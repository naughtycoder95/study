package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple42
 * author : kimtaewan
 * date : 2024-03-07
 * description : 2742 기찍 N
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07         kimtaewan          최초 생성
 */
public class Simple42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = N; i > 0; i--) {
            System.out.println(i);
        }
    }
}
