package algorithm.bronze.bronze5;

import java.util.Scanner;

/**
 * packageName : algorithm.bronze.bronze5
 * fileName : Main19
 * author : kimtaewan
 * date : 2024-06-05
 * description : 28444 HI-ARC=?
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-05         kimtaewan          최초 생성
 */
public class Main19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int i = scanner.nextInt();
        int a = scanner.nextInt();
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int hi = h * i;
        int arc = a * r * c;
        int result = hi - arc;

        System.out.println(result);
    }
}
