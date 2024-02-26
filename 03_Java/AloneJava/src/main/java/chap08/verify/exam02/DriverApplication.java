package chap08.verify.exam02;

/**
 * packageName : chap08.verify.exam02
 * fileName : DriverApplication
 * author : GGG
 * date : 2024-02-08
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class DriverApplication {
    public static void main(String[] args) {
//        TODO: 연습문제) 아래 실행클래스의 결과와 인터페이스를 보고 자식클래스 ( Bat, Sparrow, Whale ) 디자인(코딩) 하세요.
//          결과 :
//               박쥐 날고 있삼.. 슈웅!!
//               참새 날고 있삼.. 허우적!!
//               고래 수영 중. 어프!
        Flyable flyable = new Bat();
        flyable.fly();

        flyable = new Sparrow();
        flyable.fly();

        Swimable swimable = new Whale();
        swimable.swim();
    }
}
