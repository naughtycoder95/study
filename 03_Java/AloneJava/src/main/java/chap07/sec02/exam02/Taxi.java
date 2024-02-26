package chap07.sec02.exam02;

/**
 * packageName : chap07.sec02.exam02
 * fileName : Taxi
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 자식클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
