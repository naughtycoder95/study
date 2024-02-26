package chap08.sec01.exam02;

/**
 * packageName : chap08.sec01.exam02
 * fileName : Television
 * author : GGG
 * date : 2024-02-08
 * description : 자식 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("텔레비젼을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("텔레비젼을 끕니다.");
    }
}
