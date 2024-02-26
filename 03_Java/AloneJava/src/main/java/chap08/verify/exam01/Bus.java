package chap08.verify.exam01;

/**
 * packageName : chap08.verify.exam01
 * fileName : Bus
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
public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
