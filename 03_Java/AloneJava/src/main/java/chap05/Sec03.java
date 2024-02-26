package chap05;

import java.util.Calendar;

/**
 * packageName : chap05
 * fileName : Sec03
 * author : GGG
 * date : 2024-02-02
 * description :  열거 (자료)형 : enum
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-02         GGG          최초 생성
 */
public class Sec03 {
    public void EnumWeek() {
//      열거형 정의
        Week today = null;

//      자바 : 달력 객체 : Calendar, LocalDateTime 등
        Calendar calendar = Calendar.getInstance(); // 달력 객체

//      달력 : 년도, 요일, 일 등
//      Calendar.DAY_OF_WEEK : 현재 요일정보(숫자)
//      일요일(1), 월요일(2) ..., 토요일(7)
//      TODO) 사용법 : Calendar 변수 = Calendar.getInstance(); // 달력객체생성
//          => 변수.get(Calendar.DAY_OF_WEEK); // 예) Calendar.YEAR 등
        int week = calendar.get(Calendar.DAY_OF_WEEK); // 요일정보

//      if문의 다른 조건식
        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }
//      출력 : 오늘 날짜
        System.out.println("오늘 요일 : " + today);
    }
}