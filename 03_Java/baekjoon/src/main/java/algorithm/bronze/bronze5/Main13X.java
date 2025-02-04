package algorithm.bronze.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * packageName : algorithm.bronze.bronze5
 * fileName : Main13
 * author : kimtaewan
 * date : 2024-06-05
 * description : 14928 큰 수 (BIG)    시간초과
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-05         kimtaewan          최초 생성
 */
public class Main13X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger result = a.mod(BigInteger.valueOf(20000303));
        System.out.println(result);
    }
}
