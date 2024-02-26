package chap07.sec02.exam02;

/**
 * packageName : chap07.sec02.exam02
 * fileName : Driver
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 다형성 이용을 위한 클래스 : 함수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class Driver {
    public void drive(Vehicle vehicle) {
        vehicle.run();      // 부모클래스의 run() 실행
    }
}
