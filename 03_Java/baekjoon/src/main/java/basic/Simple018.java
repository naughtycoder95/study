package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple018
 * author : GGG
 * date : 2024-01-26
 * description : 2884 알람 시계
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int min = scan.nextInt();
        if (min < 45) {                 // 현재 시간이 45분보다 작을 때
            hour--;                     // 시간 조정
            min = 60 - (45 - min);      // 분 구하기
            if (hour < 0) {
                hour = 23;              // 0시보다 작아지면 24시간으로 표현
            }
            System.out.println(hour + " " + min);
        } else {
            System.out.println(hour + " " + (min-45));   // 현재 시간이 45분보다 클 때
        }
    }
}
