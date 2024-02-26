package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple028
 * author : GGG
 * date : 2024-01-26
 * description : 2438 별 찍기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple028 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String star = "*";
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
