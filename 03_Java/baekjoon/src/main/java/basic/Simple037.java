package basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple037
 * author : GGG
 * date : 2024-01-29
 * description : 5597 과제 안 내신 분..?
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         GGG          최초 생성
 */
public class Simple037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] checklist = new int[31];      // 0(인덱스 번호 시작) ~ 30
        for (int i = 1; i < 29; i++) {      // 1 부터 시작
            int check = scan.nextInt();
            checklist[check] = 1;
        }
        for (int i = 1; i < checklist.length; i++) {        // 1부터 시작
            if (checklist[i] != 1) {
                System.out.println(i);
            }
        }
    }
}
