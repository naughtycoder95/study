package basic;

import java.util.Scanner;
/**
 * packageName : basic
 * fileName : Simple011
 * author : GGG
 * date : 2024-01-25
 * description : 11382 꼬마 정민
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-25         GGG          최초 생성
 */
public class Simple011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num1 = scan.nextLong();
        long num2 = scan.nextLong();
        long num3 = scan.nextLong();
        long sum = num1 + num2 + num3;
        System.out.println(sum);
    }
}
