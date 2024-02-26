package chap06.sec05.exam02;

/**
 * packageName : chap06.sec05.exam02
 * fileName : Calculator
 * author : GGG
 * date : 2024-02-05
 * description : TODO: 전역변수 == 정적변수
 * 요약 :
 *      TODO: static 속성 = 값; // static 예약어 붙임
 *            static 함수();   // static 예약어 붙임
 *           사용법 : 클래스명.속성, 클래스명.함수()
 *        단점 : 많이 사용하면 메모리 부족현상이 발생함
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class Calculator {
    //  전역 변수(속성(필드))
    static double pi = 3.14;  // PI(파이)

    //  전역 함수 : 덧셈
    static int plus(int x, int y) {
        return x + y;
    }

    //  TODO: 전역 함수 정의하고 실행하세요 : 뺄셈
    static int minus(int x, int y) {
        return x - y;
    }
}