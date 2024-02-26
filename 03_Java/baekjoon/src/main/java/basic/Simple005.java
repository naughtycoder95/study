package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple005
 * author : GGG
 * date : 2024-01-24
 * description : 1008	 A/B
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         GGG          최초 생성
 */
public class Simple005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first  = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println((double) first / (double) second);
    }
}
