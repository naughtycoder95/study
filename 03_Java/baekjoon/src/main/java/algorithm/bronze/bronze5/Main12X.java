package algorithm.bronze.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * packageName : algorithm.bronze.bronze5
 * fileName : Main12
 * author : kimtaewan
 * date : 2024-06-05
 * description : 27434 팩토리얼 3   시간초과
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-05         kimtaewan          최초 생성
 */
public class Main12X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
