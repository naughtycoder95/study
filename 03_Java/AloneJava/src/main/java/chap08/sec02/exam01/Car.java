package chap08.sec02.exam01;

/**
 * packageName : chap08.sec02.exam01
 * fileName : Car
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
public class Car {
//    인터페이스 사용법 : 인터페이스 변수 = new 자식생성자();
    Tire frontTire = new HankookTire(); // 앞타이어
    Tire backTire = new HankookTire(); // 뒤타이어

//    함수 run() : 인터페이스의 함수 : roll() 실행
    void run() {
        frontTire.roll();
        backTire.roll();
    }
}
