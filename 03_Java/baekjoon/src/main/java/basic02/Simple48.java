package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple49
 * author : kimtaewan
 * date : 2024-03-07
 * description : 10797 10부제
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07         kimtaewan          최초 생성
 */
public class Simple48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (day == num) {
                count++;
            }
        }
        System.out.println(count);
    }
}
