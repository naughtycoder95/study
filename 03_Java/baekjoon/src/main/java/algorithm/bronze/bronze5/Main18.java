package algorithm.bronze.bronze5;

import java.util.Scanner;

/**
 * packageName : algorithm.bronze.bronze5
 * fileName : Main18
 * author : kimtaewan
 * date : 2024-06-05
 * description : 27294 몇개고?
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-05         kimtaewan          최초 생성
 */
public class Main18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (12 <= a && a <= 16 && b == 0) {
            System.out.println(320);
        } else {
            System.out.println(280);
        }
    }
}
