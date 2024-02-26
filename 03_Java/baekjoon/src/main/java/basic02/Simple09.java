package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple09
 * author : GGG
 * date : 2024-02-08
 * description : 4101 크냐?
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Simple09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; ; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if (num1 > num2) {
                System.out.println("Yes");
            } else if (num1 == 0 && num2 == 0) {
                break;
            } else {
                System.out.println("No");
            }
        }
    }
}
