package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple015
 * author : GGG
 * date : 2024-01-26
 * description : 9498 시험 성적
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score > 89) {
            System.out.println("A");
        } else if (score > 79 && score < 90) {
            System.out.println("B");
        } else if (score > 69 && score < 80) {
            System.out.println("C");
        } else if (score > 59 && score < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
