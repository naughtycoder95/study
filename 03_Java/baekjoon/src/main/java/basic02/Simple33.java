package basic02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * packageName : basic02
 * fileName : Simple33
 * author : GGG
 * date : 2024-02-08
 * description : 16170 오늘의 날짜는?
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Simple33 {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");        // 세계 시간 설정
        Date date = new Date();                                    // 현재 시간 저장 변수
        DateFormat year = new SimpleDateFormat("YYYY");     // 연도 포맷 설정
        DateFormat month = new SimpleDateFormat("MM");      // 월 포맷 설정
        DateFormat day = new SimpleDateFormat("dd");        // 일 포맷 설정
        year.setTimeZone(timeZone);                                // 연도를 설정한 세계 시간으로 변경
        month.setTimeZone(timeZone);                               // 월을 설정한 세계 시간으로 변경
        day.setTimeZone(timeZone);                                 // 일을 설정한 세계 시간으로 변경
        System.out.println(year.format(date));
        System.out.println(month.format(date));
        System.out.println(day.format(date));
    }
}
