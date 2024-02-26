package chap10.sec01.exam02;

/**
 * packageName : chap10.sec01.exam02
 * fileName : Outer
 * author : GGG
 * date : 2024-02-20
 * description : 중첩 클래스의 전역/일반 객체일때의 접근
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class Outer {
    //    일반 중첩 클래스
    class Attr{}
    //    전역 중첩 클래스
    static class Share{}

    //    TODO: 테스트 : 접근 제한
    Attr attr = new Attr();    // O
    Share share = new Share(); // O

    void method1() {
        Attr attr = new Attr();    // O
        Share share = new Share(); // O
    }

    //    static Attr attr2 = new Attr();  // x (Attr : 일반 중첩클래스)
    static Share share2 = new Share(); // O (Share : 전역 중첩클래스)

    static void method2() {
//        Attr attr2 = new Attr();       // x (Attr : 일반 중첩클래스)
        Share share2 = new Share();    // O (Share : 전역 중첩클래스)
    }
}




