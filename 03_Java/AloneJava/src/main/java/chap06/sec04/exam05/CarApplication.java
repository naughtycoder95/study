package chap06.sec04.exam05;

/**
 * packageName : chap06.sec04.exam05
 * fileName : CarApplication
 * author : GGG
 * date : 2024-02-05
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
//      TODO: 문제 : 실행클래스를 보고 Car 클래스 설계하기
        // 결과 :
        //    키를 돌립니다.
        //    달립니다. 1
        //    달립니다. 2
        //    달립니다. 3
        //    달립니다. 4
        //    달립니다. 5
        //    현재 속도: 5
        Car car = new Car();
        car.keyTurnOn();            // 키를 돌립니다. 출력
        car.run();                  // 5개의 달립니다.
        int speed = car.getSpeed(); // 현재 속도 값을 리턴
        System.out.println("현재속도:" + speed);
    }
}