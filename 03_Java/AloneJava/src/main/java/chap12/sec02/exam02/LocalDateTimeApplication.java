package chap12.sec02.exam02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * packageName : chap12.sec02.exam02
 * fileName : LocalDateTimeApplication
 * author : GGG
 * date : 2024-02-16
 * description : 날짜 클래스 : LocalDateTime (현재)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-16         GGG          최초 생성
 */
public class LocalDateTimeApplication {
    public static void main(String[] args) {
//      TODO: DB(데이터베이스)에 데이터 넣을때 자주 사용
        LocalDateTime localDateTime = LocalDateTime.now(); // 현재 날짜+시간
        System.out.println(localDateTime);

//      TODO: 날짜 포맷 변경 방법 소개
//        자바 언어 : 대소문자 구분
//        yyyy : 년(year)   (4자리수)
//        MM   : 월(month)  (2자리수)
//        dd   : 일(day)    (2자리수)
//        HH   : 시(hour)   (2자리수)
//        mm   : 분(minute) (2자리수)
//        ss   : 초(second) (2자리수)
        DateTimeFormatter dateTimeFormatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        날짜에 위에서 만든 포맷 적용
        String str = localDateTime.format(dateTimeFormatter);

        System.out.println(str);                 // 적용된 포맷 출력
    }
}