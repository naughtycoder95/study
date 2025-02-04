package algorithm.bronze.bronze5;

import java.util.Scanner;

/**
 * packageName : algorithm.bronze.bronze5
 * fileName : Main17
 * author : kimtaewan
 * date : 2024-06-05
 * description : 20492 세금
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-05         kimtaewan          최초 생성
 */
public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (int) (n - (n * 0.22));
        int b = (int) (n - (n * 0.2 * 0.22));
        System.out.println(a + " " + b);
    }
}
