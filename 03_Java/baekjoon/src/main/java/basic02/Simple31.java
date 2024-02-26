package basic02;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple31
 * author : GGG
 * date : 2024-02-08
 * description : 15740 A+B - 9
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Simple31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num1 = scanner.nextBigInteger();
        BigInteger num2 = scanner.nextBigInteger();
        System.out.println(num1.add(num2));
    }
}
