package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple019
 * author : GGG
 * date : 2024-01-26
 * description : 2525 오븐 시계
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int min = scan.nextInt();
        int cook = scan.nextInt();
        int cm = min + cook;
//        cm이 59분보다 클 때
        if (cm > 59) {
//            cm 을 60으로 나눈 나머지 =  min
            min = cm % 60;
//            cm을 60으로 나눈 정수값을 hour에 추가
            hour = hour + cm / 60;
//            hour가 23보다 클 때 시 구하기
            if (hour > 23) {
//                hour에 24를 뺀 값 = hour
                hour = hour - 24;
            }
            System.out.println(hour + " " + min);
//            cm이 59분보다 작을 때
        } else if ((min + cook) < 59) {
            System.out.println(hour + " " + cm);
        }
    }
}