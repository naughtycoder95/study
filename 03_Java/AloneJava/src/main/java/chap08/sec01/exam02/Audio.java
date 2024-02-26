package chap08.sec01.exam02;

/**
 * packageName : chap08.sec01.exam02
 * fileName : Audio
 * author : GGG
 * date : 2024-02-08
 * description : 자식 클래스 #2
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Audio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }
}
