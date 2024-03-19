package org.example.jpaexam.model.common;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * packageName : org.example.jpaexam.model.common
 * fileName : BaseTimeEntiry
 * author : GGG
 * date : 2024-03-19
 * description : 공통 클래스 (공통 속성(컬럼)이 있음)
 * 요약 :
 *      @MappedSuperclass
 *      @EntityListeners(AuditingEntityListener.class)
 *       : JPA 가 sql 문을 생성할때 아래 공통컬럼(속성)을 추가해서 생성시켜주는 어노테이션
 *         - 공통컬럼(속성) : insertTime, updateTime
 *          예) insert into tb_dept(dno, dname, loc) values (1,'sales','부산');
 *            => 붙이면 :
 *              insert into tb_dept(dno, dname, loc, insert_time, update_time)
 *               values (1,'sales','부산', '2024/03/19...', '2024/03/19...');
 *        : 추가 처리 - JPA 에서 사용할때 추상클래스로 사용함
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-19         GGG          최초 생성
 */
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {
//    생성일시 컬럼(속성(필드)), 수정일시 컬럼 : 문자열(String)
//    DB 컬럼 명명법(이름짓기) : 언더바표기법(단어_단어)
//    자바 속성 명명법        : 낙타표기법( insert + Time )
//    => 개선점 : insertTime, updateTime : 공통컬럼(속성)
//    => 상속 이용 : extends 부모클래스
    private String insertTime;

    private String updateTime;
}
