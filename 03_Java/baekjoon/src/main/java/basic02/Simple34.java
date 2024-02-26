package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple34
 * author : GGG
 * date : 2024-02-16
 * description : 15963 CASIO
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-16         GGG          최초 생성
 */
public class Simple34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long M = scanner.nextLong();
        if (N == M) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
