package chap06.sec06.exam01;

/**
 * packageName : chap06.sec06.exam01
 * fileName : CarApplication
 * author : GGG
 * date : 2024-02-06
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
//        클래스 생성
//        클래스 변수 = new 생성자함수();
        Car car = new Car();

        System.out.println(car.getSpeed()); // 사용가능
//        System.out.println(car.speed);      // 사용불가(private)
    }
}
