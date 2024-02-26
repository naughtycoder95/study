package chap06.sec04.exam01;

/**
 * packageName : chap06.sec04.exam01
 * fileName : CalculatorApplication
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
public class CalculatorApplication {
    public static void main(String[] args) {
//        클래스 생성 :
        Calculator calculator = new Calculator();

        calculator.powerOn();      // 전원켜기
        System.out.println(calculator.plus(5, 6));    // 덧셈
        System.out.println(calculator.minus(10, 6));  // 뺄셈
        System.out.println(calculator.divide(6, 3));  // 나눗셈
        calculator.powerOff();
    }
}