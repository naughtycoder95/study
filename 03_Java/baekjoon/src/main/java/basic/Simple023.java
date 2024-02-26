package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple023
 * author : GGG
 * date : 2024-01-26
 * description : 8393 합
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple023 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }System.out.println(sum);
    }
}