package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple017
 * author : GGG
 * date : 2024-01-26
 * description : 14681 사분면 고르기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coo1 = scan.nextInt();
        int coo2 = scan.nextInt();
        if (coo1 > 0 && coo2 > 0) {
            System.out.println("1");
        } else if (coo1 < 0 && coo2 > 0) {
            System.out.println("2");
        } else if (coo1 < 0 && coo2 < 0) {
            System.out.println("3");
        } else if (coo1 > 0 && coo2 < 0) {
            System.out.println("4");
        }
    }
}
