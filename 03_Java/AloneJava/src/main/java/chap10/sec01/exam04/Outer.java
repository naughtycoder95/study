package chap10.sec01.exam04;

/**
 * packageName : chap10.sec01.exam04
 * fileName : Outer
 * author : GGG
 * date : 2024-02-20
 * description : 로컬클래스에서의 접근제한(사용제한) #3
 * 요약 :
 *      1) 로컬클래스 == 함수(메소드) 안에 클래스
 *      2) 지역변수 (vs 전역변수) => 상수로 변경됨 (final 자료형 변수=값)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class Outer {
    public void method2(int arg) {
        int var = 1; // TODO: 지역변수 (vs 전역변수) => 상수로 변경됨
        class Inner {
            public void method() {
                int result = var + arg;    // O(지역변수, 매개변수)
            }
        }
    }
}