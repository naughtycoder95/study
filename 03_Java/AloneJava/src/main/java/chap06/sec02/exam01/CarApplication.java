package chap06.sec02.exam01;

/**
 * packageName : chap06.sec02.exam01
 * fileName : CarApplication
 * author : GGG
 * date : 2024-02-02
 * description : 실행클래스 : main() 함수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-02         GGG          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
//        Car 클래스 생성
//      TODO: 사용법 : 클래스명 변수 = new 생성자함수();
//        => why? 클래스 : 필드(속성), 메소드(함수) 사용하기 위해
        Car car = new Car(); // 객체 생성법

        System.out.println(car.company);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.maxSpeed);
        System.out.println(car.speed); // 0

//      속성(필드) 값 수정
        car.speed = 60;
        System.out.println(car.speed); // 출력 : 60
    }
}