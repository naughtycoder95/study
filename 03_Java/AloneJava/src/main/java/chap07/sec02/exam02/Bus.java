package chap07.sec02.exam02;

/**
 * packageName : chap07.sec02.exam02
 * fileName : Bus
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
public class Bus extends Vehicle {
//    함수(메소드) 재정의(오버라이딩) : alt + insert (맥 : cmd + n)

    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
