package chap10.sec01.exam03;

/**
 * packageName : chap10.sec01.exam03
 * fileName : Outer
 * author : GGG
 * date : 2024-02-20
 * description : 중첩클래스의 전역/일반 사용제한 #2
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class Outer {
    //    TODO: 외부클래스의 속성(필드), 함수에 대한 접근제한
    int field1;
    static int field2;       // 전역 속성(필드)
    void method1() {}
    static void method2() {} // 전역 함수(메소드)

    //    TODO: 일반 중첩클래스에서 테스트
    class Attr {
        void method() {
//            외부 클래스의 일반 속성(필드)/함수(메소드) 접근
            field1 = 10;       // O
            method1();         // O
//            외부 클래스의 전역 속성(필드)/함수(메소드) 접근
            field2 = 10;       // O
            method2();         // O
        }
    }
    static class Share {
        void method() {
//            외부 클래스의 일반 속성(필드)/함수(메소드) 접근
//            field1 = 10;       // x
//            method1();         // x
//            외부 클래스의 전역 속성(필드)/함수(메소드) 접근
            field2 = 10;       // O
            method2();         // O
        }
    }
}