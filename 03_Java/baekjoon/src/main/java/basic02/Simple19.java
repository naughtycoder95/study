package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple19
 * author : GGG
 * date : 2024-02-08
 * description : 15964 이상한 기호
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Simple19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextInt();
        long num2 = scanner.nextInt();
        long result = (num1 + num2) * (num1 - num2);
        System.out.println(result);
    }
}
