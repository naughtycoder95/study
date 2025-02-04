package algorithm.bronze.bronze5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : algorithm.bronze.bronze5
 * fileName : Main11
 * author : kimtaewan
 * date : 2024-06-05
 * description : 29731 2033년 밈 투표
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-05         kimtaewan          최초 생성
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String result = "";

        String a = "Never gonna give you up";
        String b = "Never gonna let you down";
        String c = "Never gonna run around and desert you";
        String d = "Never gonna make you cry";
        String e = "Never gonna say goodbye";
        String f = "Never gonna tell a lie and hurt you";
        String g = "Never gonna stop";

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            if (Arrays.asList(a, b, c, d, e, f, g).contains(s)) {
                result = "No";
            } else {
                result = "Yes";
                break;
            }
        }
        System.out.println(result);
    }
}
