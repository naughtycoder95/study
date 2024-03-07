package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple45
 * author : kimtaewan
 * date : 2024-03-07
 * description : 10039 평균 점수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07         kimtaewan          최초 생성
 */
public class Simple44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int score = scanner.nextInt();
            if (score >= 40) {
                sum += score;
            } else {
                sum += 40;
            }
        }
        System.out.println(sum / 5);
    }
}
