package basic02;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple38
 * author : kimtaewan
 * date : 2024-03-07
 * description : 25372 성택이의 은밀한 비밀번호
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07         kimtaewan          최초 생성
 */
public class Simple38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String pw = scanner.next();
            if (pw.length() >= 6 && pw.length() <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
