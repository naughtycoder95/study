package chap06.sec04.exam06;

/**
 * packageName : chap06.sec04.exam06
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
//        클래스 생성
        Calculator calculator = new Calculator();

//      TODO: 오버로딩 장점 : 코딩 효율성, 함수명 1개만 사용가능해서 가독성이 좋음
        System.out.println(calculator.area(10));          // 정사각형
        System.out.println(calculator.area(10,20));  // 직사각형
    }
}