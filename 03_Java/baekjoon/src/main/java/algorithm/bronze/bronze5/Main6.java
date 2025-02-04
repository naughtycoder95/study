package algorithm.bronze.bronze5;

import java.util.Scanner;

/**
 * packageName : algorithm.bronze.bronze5
 * fileName : Main6
 * author : kimtaewan
 * date : 2024-06-04
 * description : 10869 사칙연산
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-04         kimtaewan          최초 생성
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
