package basic02;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple06
 * author : GGG
 * date : 2024-02-05
 * description : 10757 큰 수 A+B
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class Simple06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num1 = scanner.nextBigInteger();
        BigInteger num2 = scanner.nextBigInteger();
        BigInteger sum =  num1.add(num2);
        System.out.println(sum);
    }
}
