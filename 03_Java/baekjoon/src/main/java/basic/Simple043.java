package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple043
 * author : GGG
 * date : 2024-01-30
 * description : 9086 문자열
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple043 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        int max = 0;
        for (int i = 0; i < test; i++) {
            String str = scan.next();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
        }
    }
}
