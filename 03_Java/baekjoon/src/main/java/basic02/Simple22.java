package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple22
 * author : GGG
 * date : 2024-02-08
 * description : 4999 아!
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Simple22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        if (str1.length() < str2.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }
}
