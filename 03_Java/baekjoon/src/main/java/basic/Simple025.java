package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple025
 * author : GGG
 * date : 2024-01-26
 * description : 25314 코딩은 체육과목 입니다
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String lo = "long ";
        if (num % 4 == 0) {
            num = num / 4;
            for (int i = 0; i < num; i++) {
                System.out.print(lo);
            }
            System.out.print("int");
        }
    }

}
