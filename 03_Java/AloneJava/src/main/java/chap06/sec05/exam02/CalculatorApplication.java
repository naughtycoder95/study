package chap06.sec05.exam02;

/**
 * packageName : chap06.sec05.exam02
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
//        클래스 생성 안함
//        Calculator calculator = new Calculator();
//      TODO: 사용법 : 클래스명.속성, 클래스명.함수()
        double result = 10 * 10 * Calculator.pi;
        int result2   = Calculator.plus(10, 5);

        System.out.println(result);   // 314
        System.out.println(result2);  // 15

//      TODO: 뺄셈 실행
        int result3    = Calculator.minus(10 , 5);
        System.out.println(result3);   // 5

    }
}