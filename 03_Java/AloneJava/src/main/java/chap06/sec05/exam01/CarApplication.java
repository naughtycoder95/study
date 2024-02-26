package chap06.sec05.exam01;

/**
 * packageName : chap06.sec05.exam01
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
//        클래스 생성
        Car car = new Car("벤츠");

//       저장함수 : setter
        car.setSpeed(10);                    // speed 속성 10 저장됨
//      car.speed = 10;                      // 추천(x)
//        System.out.println(car.speed);     // 추천(x)
        System.out.println(car.getSpeed());  // 10
    }
}