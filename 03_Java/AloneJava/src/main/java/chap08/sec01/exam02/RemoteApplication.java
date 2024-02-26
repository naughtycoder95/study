package chap08.sec01.exam02;

/**
 * packageName : chap08.sec01.exam02
 * fileName : RemoteApplication
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
public class RemoteApplication {
    public static void main(String[] args) {
//        TODO: Audio, Television 클래스를 완성하세요
//          다형성 : Tv 객체
//          실행 사용법 : 인터페이스 변수 = 자식클래스; // 다형성 코드 형태 일치
        RemoteControl rc = new Television();
        rc.turnOn();      // 텔레비젼을 켭니다.
        rc.turnOff();     // 텔레비젼을 끕니다.

//        다형성 : 오디오 객체
        rc = new Audio();
        rc.turnOn();       // 오디오를 켭니다.
        rc.turnOff();      // 오디오를 끕니다.
    }
}
