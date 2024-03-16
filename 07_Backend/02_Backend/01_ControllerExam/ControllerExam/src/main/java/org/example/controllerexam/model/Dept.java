package org.example.controllerexam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * packageName : org.example.controllerexam.model
 * fileName : Dept
 * author : GGG
 * date : 2024-03-12
 * description : 모델 클래스 : 부서
 * 요약 :
 *  TODO:
 *      http://localhost:8000/exam04/example01?dno=10&dname=Accounting&loc=Daegu
 *      동일하게 속성필드 만들기
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-12         GGG          최초 생성
 */
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Dept {
    int dno;       // 부서번호
    String  dname; // 부서명
    String  loc;   // 부서위치
}
