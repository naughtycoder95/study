package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple40
 * author : kimtaewan
 * date : 2024-03-07
 * description : 24883 자동완성
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07         kimtaewan          최초 생성
 */
public class Simple40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (str.equals("N") || str.equals("n")) {
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }
    }
}
