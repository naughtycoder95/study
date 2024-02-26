package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple016
 * author : GGG
 * date : 2024-01-26
 * description : 2753 윤년
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("1");
        } else if (year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
