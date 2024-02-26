package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple021
 * author : GGG
 * date : 2024-01-26
 * description : 2739 구구단
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i < 10; i++) {
            int val = num * i;
            System.out.println(num + " * " + i + " = " + val);
        }
    }
}
