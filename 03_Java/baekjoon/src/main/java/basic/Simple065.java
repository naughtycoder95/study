package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple065
 * author : kimtaewan
 * date : 2024-06-05
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-05         kimtaewan          최초 생성
 */
public class Simple065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int a = x / 25;
            int b = (x % 25) / 10;
            int c = ((x % 25) % 10) / 5;
            int d = (((x % 25) % 10) % 5) / 1;
            System.out.println(a + " " + b + " " + c + " " + d);
        }
    }
}
