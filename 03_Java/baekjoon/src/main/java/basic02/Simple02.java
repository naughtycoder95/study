package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple02
 * author : GGG
 * date : 2024-02-05
 * description : 2741 N 찍기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class Simple02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
