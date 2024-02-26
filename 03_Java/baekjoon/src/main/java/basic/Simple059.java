package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple059
 * author : GGG
 * date : 2024-02-02
 * description : 25206 너의 평점은
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-02         GGG          최초 생성
 */
public class Simple059 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double sumscore = 0;

        for (int i = 0; i < 20; i++) {
            String subject = scan.next();
            double score = scan.nextDouble();
            String tier = scan.next();

            if (tier.equals("A+")) {
                sum = sum + (score * 4.5);
                sumscore += score;
            } else if (tier.equals("A0")) {
                sum = sum + (score * 4.0);
                sumscore += score;
            } else if (tier.equals("B+")) {
                sum = sum + (score * 3.5);
                sumscore += score;
            } else if (tier.equals("B0")) {
                sum = sum + (score * 3.0);
                sumscore += score;
            } else if (tier.equals("C+")) {
                sum = sum + (score * 2.5);
                sumscore += score;
            } else if (tier.equals("C0")) {
                sum = sum + (score * 2.0);
                sumscore += score;
            } else if (tier.equals("D+")) {
                sum = sum + (score * 1.5);
                sumscore += score;
            } else if (tier.equals("D0")) {
                sum = sum + (score * 1.0);
                sumscore += score;
            } else if (tier.equals("F")) {
                sum = sum + (score * 0.0);
                sumscore += score;
            }
        }
        double avg = sum / sumscore;
        System.out.println(avg);
    }
}
