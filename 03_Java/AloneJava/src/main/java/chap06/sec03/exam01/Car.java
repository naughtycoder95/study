package chap06.sec03.exam01;

/**
 * packageName : chap06.sec03
 * fileName : Car
 * author : GGG
 * date : 2024-02-02
 * description : TODO: 생성자함수
 * 요약 :
 *      TODO: 1) 생성자 함수 역할 : 값을 전달받아 속성(필드)에 저장하는 함수
 *             => 속성(필드) 초기화 : 생성자함수로 값을 초기화함(굿코딩)
 *            2) 매개변수 없는 생성자 : 클래스명(){} => 기본 생성자(생략가능)
 *             => 자바가 생성자가 없으면 1개 만들어줌(기본생성자)
 *         사용법 : return 안씀
 *              (접근제어자) 클래스명() {
 *                  실행문;
 *              }
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-02         GGG          최초 생성
 */
public class Car {
    //    속성(필드) 정의
    String col;   // 색깔
    int    ccNum; // 배기량

    //  TODO: 생성자 함수 : 매개변수
    Car() {}

    Car(String color, int cc) {
        col   = color;  // 검정
        ccNum = cc;     // 3000
    }
}





