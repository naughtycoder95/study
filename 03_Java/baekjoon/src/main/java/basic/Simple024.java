package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple024
 * author : GGG
 * date : 2024-01-26
 * description : 25304 영수증
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple024 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();     // 총 금액
        int N = scan.nextInt();     // 총 갯수
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            sum += a * b;
        }
        if (sum == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
