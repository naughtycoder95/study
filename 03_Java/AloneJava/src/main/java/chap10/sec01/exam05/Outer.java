package chap10.sec01.exam05;

/**
 * packageName : chap10.sec01.exam05
 * fileName : Outer
 * author : GGG
 * date : 2024-02-20
 * description : 중첩 클래스에서 this 사용
 * 요약 :
 *      1) this : 클래스 자기 자신
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class Outer {
    String field = "외부필드";
    void method() {
        System.out.println("외부함수");
    }
    class Inner{
        String field = "내부필드";
        void method() {
            System.out.println("내부함수");
        }
        void print() {
            System.out.println(this.field); // 중첩클래스 속성(필드)
            this.method();                  // 중첩클래스 함수(메소드)
//      TODO: 외부 필드/함수(메소드) this 접근
            System.out.println(Outer.this.field); // 외부클래스 속성(필드)
            Outer.this.method();                  // 외부클래스 함수(메소드)
        }
    }

}