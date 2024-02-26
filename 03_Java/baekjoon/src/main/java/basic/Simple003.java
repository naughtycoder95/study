package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple003
 * author : GGG
 * date : 2024-01-24
 * description : 1001	 A-B
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         GGG          최초 생성
 */
public class Simple003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first  = scanner.nextInt(); // 1개 정수
        int second = scanner.nextInt(); // 1개 정수
        System.out.println(first - second);
    }
}
