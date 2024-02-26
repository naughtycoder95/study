package chap14.sec01.exam03;

/**
 * packageName : chap14.sec01.exam03
 * fileName : CalculatorApplication
 * author : GGG
 * date : 2024-02-20
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

//        TODO: 1 쓰레드 실행
        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();                  // 쓰레드 실행 : 내부적으로 run() 찾아 실행함

//        TODO: 2 쓰레드 실행
        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();                  // 쓰레드 실행 : 내부적으로 run() 찾아 실행함
    }
}