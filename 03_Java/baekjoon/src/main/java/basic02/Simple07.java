package basic02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * packageName : basic02
 * fileName : Simple07
 * author : GGG
 * date : 2024-02-05
 * description : 10699 오늘 날짜
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class Simple07 {
    public static void main(String[] args) {
        Date cal = new Date();
        DateFormat date = new SimpleDateFormat("YYYY-MM-dd");
        date.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.print(date.format(cal));
    }
}
