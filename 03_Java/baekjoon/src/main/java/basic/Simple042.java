package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple042
 * author : GGG
 * date : 2024-01-30
 * description : 2743 단어 길이 재기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple042 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char[] arrStr = str.toCharArray();
        int max = 0;
        for (int i = 0; i <= str.length(); i++) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
