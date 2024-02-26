package basic02;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple32
 * author : GGG
 * date : 2024-02-08
 * description : 13277 큰 수 곱셈
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Simple32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num1 = scanner.nextBigInteger();
        BigInteger num2 = scanner.nextBigInteger();
        System.out.println(num1.multiply(num2));
    }
}
