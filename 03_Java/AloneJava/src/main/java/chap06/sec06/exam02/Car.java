package chap06.sec06.exam02;


import java.util.Scanner;

/**
 * packageName : chap06.sec06.exam02
 * fileName : Car
 * author : GGG
 * date : 2024-02-06
 * description : TODO: 패키지(폴더) , 자바이론 : 컴파일언어
 * 요약 :
 *      TODO: 1) 패키지 구조 : 상위패키지.하위패키지.클래스
 *               예) package chap06.sec06.exam02
 *            2) 자바 fullName : 패키지명 + 클래스명
 *               예) package chap06.sec06.exam02.Car // 전체 풀네임
 *            3) 패지키 정의(선언) :
 *                  package 상위패키지.하위패키지
 *                  class 클래스명{}
 *            4) 자바 import : 다른 클래스를 사용할떄 작성함
 *                  => 개발툴이 자동으로 import 해줌
 *                  => 만약 안되면 -> alt + enter (자동 추가됨)
 *                  Scanner ... => 위에 inport java.util.Scanner
 *            5) 클래스 : 객체 정의
 *                  => 3요소 : 속성(필드), 생성자, 함수(메소드)
 *                  => 객체 : 학생, 강사, 학원 등 모든 실생활 사물, 사람을 의미
 *                      (1) 속성(필드)   : 특징
 *                      (2) 함수(메소드) : 동작, 기능
 *                  => 객체지향 코딩 : 객체(클래스) 정의하고 코딩하는 방법
 *            6) 자바 : 컴파일 언어 vs 스크립트 언어(js)
 *                  => 컴파일 언어    : 소스 -> 컴파일(실행버튼) -> 기계어 -> 실행
 *                      예) Car.java -> 실행 -> Car.class -> java Car
 *                  => 스크립트 언어  : 소스 -> 실행 -> 실행 (내부적으로 기계어로 바꾸어 실행 : 속도 느림)
 *                  => 자바 언어 특징 : 맥/윈도우 운영체제(OS) 모두에서 실행됨
 *                      -> 가능하게 하는것 : JVM(자바가상머신) : jdk 설치하면 있음
 *                      -> 다른 언어 불가 : C++ 등
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class Car {
    Scanner scanner = new Scanner(System.in);
}
