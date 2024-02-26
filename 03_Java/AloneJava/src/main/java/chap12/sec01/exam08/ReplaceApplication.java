package chap12.sec01.exam08;

/**
 * packageName : chap12.sec01.exam08
 * fileName : ReplaceApplication
 * author : GGG
 * date : 2024-02-15
 * description : String 클래스 함수 : replace()
 * 요약 :
 *      1) 사용법 : 문자열.replace("원본문자열", "바꿀문자열")
 *      => return 값 : 바뀐 문자열
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class ReplaceApplication {
    public static void main(String[] args) {
        String old = "자바 프로그램. 자바 API";
        String newStr = old.replace("자바", "Java");

        System.out.println(old);
        System.out.println(newStr);
    }
}
