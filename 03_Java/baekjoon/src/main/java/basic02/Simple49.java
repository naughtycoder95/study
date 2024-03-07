package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple50
 * author : kimtaewan
 * date : 2024-03-07
 * description : 10156 과자
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07         kimtaewan          최초 생성
 */
public class Simple49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int num = scanner.nextInt();
        int property = scanner.nextInt();

        int total = price * num;
        int need = total - property;
        if (need < 0) {
            System.out.println(0);
        } else {
            System.out.println(need);
        }
    }
}
