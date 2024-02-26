package chap06.sec03.exam01;

/**
 * packageName : chap06.sec03
 * fileName : CarApplication
 * author : GGG
 * date : 2024-02-02
 * description : 실행클래스 : main()
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-02         GGG          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
//     클래스(객체) 생성 : 클래스 변수 = new 생성자함수();
//        Car car = new Car();
        Car car = new Car("검정", 3000);
        Car car2 = new Car("흰색", 2000);
        Car car3 = new Car("빨간색", 2000);

//      속성(필드) 출력
        System.out.println(car.ccNum);  // 3000
        System.out.println(car.col);    // 검정
        System.out.println(car2.ccNum);  // 2000
        System.out.println(car2.col);    // 흰색
    }
}