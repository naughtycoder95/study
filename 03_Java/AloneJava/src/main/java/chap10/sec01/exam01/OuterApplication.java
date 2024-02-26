package chap10.sec01.exam01;

/**
 * packageName : chap10.sec01.exam01
 * fileName : OuterApplication
 * author : GGG
 * date : 2024-02-20
 * description : (참고)중첩 클래스의 사용법
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class OuterApplication {
    public static void main(String[] args) {
//        외곽 클래스 : Outer
        Outer outer = new Outer();

//       1) 중첩클래스(클래스안에 클래스) : Attr (일반 속성(필드))
        Outer.Attr attr = outer.new Attr();

        attr.field1 = 3;  // 중첩클래스의 속성(필드)
        attr.method1();   // 중첩클래스의 함수(메소드)

//       2) 중첩클래스(클래스안에 클래스) : Share (전역 속성(필드))
//         복습 : 전역속성(함수) 사용법 : 클래스명.속성(함수)
        Outer.Share.field2 = 3;   // 중첩클래스의 전역속성(필드)
        Outer.Share.method2();    // 중첩클래스의 전역함수(메소드)

//       3) 함수(메소드) 중첩클래스 == 로컬 클래스
        outer.method();           // 함수안에 클래스 자동 생성
    }
}