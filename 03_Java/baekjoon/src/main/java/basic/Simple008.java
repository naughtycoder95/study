package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple008
 * author : GGG
 * date : 2024-01-25
 * description : 18108 1998년생인 내가 태국에서는 2541년생?!
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-25         GGG          최초 생성
 */
public class Simple008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        System.out.println(year - 543);
    }
}
