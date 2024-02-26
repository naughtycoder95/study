package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple020
 * author : GGG
 * date : 2024-01-26
 * description : 2480 주사위 세개
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = 0;
        int prize = 0;
//        a, b, c 모두 다를 때
        if (a != b && a != c && b != c) {
//            a 가 가장 큰 수일 때
            if (a > b && a > c) {
                max = a;
//                b 가 가장 큰 수일 때
            } else if (b > a && b > c) {
                max = b;
//                c 가 가장 큰 수일 때
            } else {
                max = c;
            }
//            3등 상금 계산
            prize = max * 100;
            System.out.println(prize);
        } else {
//            a, b, c 가 모두 같을 때
            if (a == b && a == c) {
//                1등 상금 계산
                prize = 10000 + a * 1000;
                System.out.println(prize);
            } else {
//                a, b 또는 a, c 가 같을 때
                if (a == b || a == c) {
//                    2등 상금 계산
                    prize = 1000 + a * 100;
                    System.out.println(prize);
//                    b, c 가 같을 때
                } else {
//                    2등 상금 계산
                    prize = 1000 + b * 100;
                    System.out.println(prize);
                }
            }
        }
    }
}
