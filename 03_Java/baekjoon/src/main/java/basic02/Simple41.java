package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple41
 * author : kimtaewan
 * date : 2024-03-07
 * description : 27959 초코바
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07         kimtaewan          최초 생성
 */
public class Simple41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        if (N * 100 >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
