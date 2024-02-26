package chap12.sec01.exam10;

import java.util.Arrays;

/**
 * packageName : chap12.sec01.exam10
 * fileName : SplitApplication
 * author : GGG
 * date : 2024-02-15
 * description : String 클래스 함수 : split()
 * 요약 :
 *      1) 사용법 : 문자열.split("구분자")
 *          => return 값 : 구분자를 기준으로 나누어진 문자열 배열
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class SplitApplication {
    public static void main(String[] args) {
        String ssn = "123456-1234567";

        String[] str = ssn.split("-");
        System.out.println(Arrays.toString(str));
    }
}
