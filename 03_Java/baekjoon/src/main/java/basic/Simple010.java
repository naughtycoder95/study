package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple010
 * author : GGG
 * date : 2024-01-25
 * description : 2588 곱셈
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-25         GGG          최초 생성
 */
public class Simple010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int num1 = a * (b % 10);
        int num2 = a * ((b / 10) % 10);
        int num3 = a * (b / 100);
        int sum = num1 + (num2 * 10) + (num3 * 100);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(sum);
    }
}
