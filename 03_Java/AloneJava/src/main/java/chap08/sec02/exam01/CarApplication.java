package chap08.sec02.exam01;

/**
 * packageName : chap08.sec02.exam01
 * fileName : CarApplication
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
public class CarApplication {
    public static void main(String[] args) {
//        Car 클래스 생성 : 클래스 변수 = new 생성자 함수();
        Car car = new Car();

//        run() 실행 : 2개의 타이어가 있음
        car.run();

//        한국타이어 -> 금호타이어 (앞, 뒤)
        car.frontTire = new KumhoTire();
        car.backTire = new KumhoTire();

        car.run();  // 금호타이어 (다형성)
    }
}
