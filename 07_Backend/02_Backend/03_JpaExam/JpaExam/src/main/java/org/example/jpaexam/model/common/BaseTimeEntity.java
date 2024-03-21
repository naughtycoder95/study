package org.example.jpaexam.model.common;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

//    TODO: JPA 에서 insert 가 실행되기전에 실행하는 함수
//     예) OnPrePersist() -> insert 실행
    @PrePersist
    void OnPrePersist() {
//        insert 하기전에 현재날짜를 넣기 : 날짜포맷(yyyy-MM-dd HH:mm:ss)
        this.insertTime = LocalDateTime.now()
                            .format(DateTimeFormatter
                                    .ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

//    TODO: JPA 에서 update 가 실행되기전에 실행되는 함수
//     예) OnPreUpdate() -> update 실행
    @PreUpdate
    void OnPreUpdate() {
//        update 하기전에 현재날짜를 넣기
        this.updateTime = LocalDateTime.now()
                            .format(DateTimeFormatter
                                    .ofPattern("yyyy-MM-dd HH:mm:ss"));
//        insertTime 같이 변경 (생성일시 == 수정일시 동일하게 처리)
        this.insertTime = this.updateTime;
    }
}
