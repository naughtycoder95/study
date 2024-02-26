package basic02;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple17
 * author : GGG
 * date : 2024-02-08
 * description : 2338 긴자리 계산
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Simple17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num1 = scanner.nextBigInteger();
        BigInteger num2 = scanner.nextBigInteger();
        System.out.println(num1.add(num2));
        System.out.println(num1.subtract(num2));
        System.out.println(num1.multiply(num2));
    }
}
