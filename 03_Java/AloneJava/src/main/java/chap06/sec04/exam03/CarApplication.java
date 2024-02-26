package chap06.sec04.exam03;

/**
 * packageName : chap06.sec04.exam03
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
//        Car 클래스 생성
        Car car = new Car();

//      1) 자동차에 gas 넣기 : 5
        car.setGas(5);

//      2) 달리기
        car.run();

//      3) gas 확인
        if(car.isLeftGas() == true) {
            System.out.println("gas 넣을 필요 없음");
        } else {
            System.out.println("gas 넣어야함");
        }

    }
}