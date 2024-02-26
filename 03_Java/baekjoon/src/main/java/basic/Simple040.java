package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple040
 * author : GGG
 * date : 2024-01-30
 * description : 1546 평균
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple040 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int subject = scan.nextInt();                   // 과목 수
        int[] sub = new int[subject];                   // 점수 배열 (점수들이 들어갈 배열)
        double[] fake = new double[subject];            // 가짜 점수 배열
        int max = 0;                                    // 최고점수 저장공간
        double sum = 0;                                 // 가짜총합 저장공간
        double avg = 0;                                 // 가짜평균 저장공간
        for (int i = 0; i < sub.length; i++) {
            int score = scan.nextInt();                 // 점수 입력
            sub[i] = score;                             // score 배열에 점수 저장
            for (int j = 0; j < sub.length; j++) {
                if (max < sub[i]) {                     // 최대 점수 구하기
                    max = sub[i];
                }
            }
        }
        for (int i = 0; i < fake.length; i++) {
            fake[i] = (double) sub[i] / (double) max * 100;     // 가짜 점수 구해서 fake 배열에 저장
            }
        for (int i = 0; i < fake.length; i++) {
            sum = sum + fake[i];                                // 가짜 총합 구하기
        }
        avg = sum / subject;                                    // 가짜 평균 구하기
        System.out.println(avg);
    }
}
