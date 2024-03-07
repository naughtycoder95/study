package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple48
 * author : kimtaewan
 * date : 2024-03-07
 * description : 2530 인공지능 시계
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07         kimtaewan          최초 생성
 */
public class Simple47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        s += t;
        m += s / 60;
        s %= 60;
        h += m / 60;
        m %= 60;
        h %= 24;

        System.out.println(h + " " + m + " " + s);
    }
}
