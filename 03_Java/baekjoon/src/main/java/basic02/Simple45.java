package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple46
 * author : kimtaewan
 * date : 2024-03-07
 * description : 3046 R2
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07         kimtaewan          최초 생성
 */
public class Simple45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R1 = scanner.nextInt();
        int S = scanner.nextInt();
        int R2 = S * 2 - R1;
        System.out.println(R2);
    }
}
