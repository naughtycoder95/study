package algorithm.bronze.bronze5;

import java.util.Scanner;

/**
 * packageName : algorithm.bronze.bronze5
 * fileName : Main14
 * author : kimtaewan
 * date : 2024-06-05
 * description : 29699 Welcome to SMUPC!
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-05         kimtaewan          최초 생성
 */
public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = "WelcomeToSMUPC";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < s.length(); j++) {
                sb.append(s.charAt(j));
            }
        }
        System.out.println(sb.charAt(n - 1));
    }
}
