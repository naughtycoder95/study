package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple041
 * author : GGG
 * date : 2024-01-30
 * description : 27866 문자와 문자열
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple041 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int num = scan.nextInt()-1;
        System.out.println(str.charAt(num));
    }
}
