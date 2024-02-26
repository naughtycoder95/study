package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple044
 * author : GGG
 * date : 2024-01-30
 * description : 11654 아스키 코드
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple044 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char asc = scan.next().charAt(0);
        System.out.println((int) asc);
    }
}
