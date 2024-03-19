package org.example.jpaexam.model.entity.basic;

import jakarta.persistence.*;
import lombok.*;
import org.example.jpaexam.model.common.BaseTimeEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * packageName : org.example.jpaexam.model.entity.basic
 * fileName : Emp
 * author : kimtaewan
 * date : 2024-03-19
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-19         kimtaewan          최초 생성
 */
//    연습 : Emp, EmpRepository, EmpController, emp_all.jsp
//    함수 : 전체 조회, 페이징X : findAll()

    @Entity
    @Table(name = "TB_EMP")
    @SequenceGenerator(
            name = "SQ_EMP_GENERATOR"
            , sequenceName = "SQ_EMP"
            , initialValue = 1
            , allocationSize = 1
    )
    @DynamicInsert
    @DynamicUpdate
    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
public class Emp extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_EMP_GENERATOR"
    )
    private Integer eno;

    private String  ename;

    private String  job;

    private String  manager;

    private String  hiredate;

    private String  salary;

    private String  commission;

    private String  dno;
}

