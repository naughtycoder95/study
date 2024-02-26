package chap12.sec02.exam01;

import java.util.Calendar;
import java.util.Date;

/**
 * packageName : chap12.sec01.exam13
 * fileName : DateApplication
 * author : GGG
 * date : 2024-02-15
 * description : Date : 날짜 클래스 (과거)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class DateApplication {
    public static void main(String[] args) {
//        Date 날짜
        Date date = new Date();
        System.out.println(date.toString());

//        추가 날짜 클래스 : Calendar
        Calendar calendar = Calendar.getInstance();
//        년 / 월 / 일
        int y = calendar.get(Calendar.YEAR);            // 현재 년
        int m = calendar.get(Calendar.MONTH) + 1;       // 현재 월 (0부터 시작, +1 해줘야함)
        int d = calendar.get(Calendar.DAY_OF_MONTH);    // 현재 일

        System.out.println(y);
        System.out.println(m);
        System.out.println(d);
    }
}
