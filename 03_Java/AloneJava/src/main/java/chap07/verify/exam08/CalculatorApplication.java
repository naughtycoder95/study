package chap07.verify.exam08;

/**
 * packageName : chap07.verify.exam08
 * fileName : CalculatorApplication
 * author : GGG
 * date : 2024-02-07
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class CalculatorApplication {
    public static void main(String[] args) {
        GoodCalc goodCalc = new GoodCalc();

        System.out.println(goodCalc.add(2,3));
        System.out.println(goodCalc.subtract(2,3));
        System.out.println(goodCalc.average(new int[]{2,3,4})); // 평균
    }
}
