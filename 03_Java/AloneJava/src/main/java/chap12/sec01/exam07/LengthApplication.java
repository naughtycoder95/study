package chap12.sec01.exam07;

/**
 * packageName : chap12.sec01.exam07
 * fileName : LengthApplication
 * author : GGG
 * date : 2024-02-15
 * description : String (*) 클래스 함수: length()
 * 요약 :
 *      1) 사용법 : 문자열.length()
 *       => return 값 : 문자열 길이
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class LengthApplication {
    public static void main(String[] args) {
//        주민번호
        String ssn = "123456-1234567";
        int len = ssn.length();
        System.out.println(len);    // 14
    }
}