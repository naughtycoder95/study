package org.example.jpaexam.repository.basic;

import org.example.jpaexam.model.entity.basic.Dept;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName : org.example.jpaexam.repository.basic
 * fileName : DeptRepository
 * author : GGG
 * date : 2024-03-19
 * description : 레포지토리 클래스 : DB CRUD 함수가 있는 인터페이스
 * 요약 :
 *      CRUD 용어 : C(Create==Insert), R(Read==Select)
 *                 U(Update==Update), D(Delete=Delete)
 *                 DML(데이터 조작어) 문임
 *      사용법 : interface 이름 extends JpaRepository<엔티티명,기본키속성자료형>
 *          => 엔티티명        : DB 와 연결될 엔티티 클래스명
 *          => 기본키속성자료형 : 엔티티 클래스의 기본키 속성 자료형 명시
 *          => JPA 기본 함수 사용 가능
 *             - findAll()       : 전체 조회 , 자동 sql 문 생성
 *             - findById(기본키) : 상세 조회(1건), 자동 sql 문 생성
 *             - save(객체)       : 저장/수정을 알아서 실행함
 *                  저장 : 기본키가 없으면 insert
 *                  수정 : 기본키가 있으면 update
 *             - deleteById(기본키): 삭제 , 자동 sql 문 생성
 *      페이징 처리 + like 검색어 :
 *          1) like 검색 sql 문 작성 :
 *          2) 페이징 처리 : 테이블 개수 세기 sql 문 추가로 들어가야함
 *      사용법 : @Query(value="sql 문", countQuery ="sql 문2", nativeQuery=true)
 *          - @Param("매개변수명") : sql 문 속으로 함수의 매개변수값을 전달하기 위한 어노테이션
 *          - select ~ where 컬럼명 like :매개변수명 : 함수매개변수 == :매개변수 (일치)
 *          - JPA @Query 옵션 : nativeQuery = true : 오라클 SQL 문 사용가능
 *                             nativeQuery = false : 객체 SQL 문(JPQL) 사용해야함(참고), 생략가능
 *      Page<엔티티>객체 : 페이징된 결과값을 저장할 객체(함수의 리턴값으로 사용)
 *          - 예) 속성 : 현재페이지번호, 전체페이지건수 등
 *      Pageable   객체 : 페이징하기 위한 객체(함수의 매개변수로 사용)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-19         GGG          최초 생성
 */
@Repository
public interface DeptRepository extends JpaRepository<Dept,Integer> {
    @Query(value = "SELECT D.* FROM TB_DEPT D\n" +
            "WHERE UPPER(D.DNAME) LIKE UPPER('%'|| :dname ||'%')"
            , countQuery = "SELECT COUNT(*) FROM TB_DEPT D\n" +
            "WHERE UPPER(D.DNAME) LIKE UPPER('%'|| :dname ||'%')"
            , nativeQuery = true)
    Page<Dept> findAllByDnameContaining(
            @Param("dname") String dname,
            Pageable pageable
    );

}


