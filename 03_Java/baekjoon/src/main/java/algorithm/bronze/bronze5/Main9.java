package algorithm.bronze.bronze5;

import java.util.Scanner;

/**
 * packageName : algorithm.bronze.bornze5
 * fileName : Main9
 * author : kimtaewan
 * date : 2024-06-04
 * description : 2475 검증수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-04         kimtaewan          최초 생성
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        for (int i = 0; i < 5; i++) {
            int a = scanner.nextInt();
            b += Math.pow(a, 2);
        }
        System.out.println(b % 10);
    }
}
