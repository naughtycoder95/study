package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple006
 * author : GGG
 * date : 2024-01-25
 * description : 10869   사칙연산
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-25         GGG          최초 생성
 */
public class Simple006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();  // 1개
        int second = scanner.nextInt(); // 1개

        System.out.println(first + second);
        System.out.println(first - second);
        System.out.println(first * second);
        System.out.println(first / second);
        System.out.println(first % second);
    }
}
