package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple16
 * author : GGG
 * date : 2024-02-08
 * description : 5522 카드 게임
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Simple16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
