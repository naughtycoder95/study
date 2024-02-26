package ref;

/**
 * packageName : ref
 * fileName : StringChar
 * author : GGG
 * date : 2024-01-25
 * description : 문자열 객체 : charAt()
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-25         GGG          최초 생성
 */
public class StringChar {
    public static void main(String[] args) {
//        예제 : 주민번호 뒷자리에 첫번째 글자가 1이면 남자입니다.
//               1이 아니면 여자입니다.
        String ssn = "010624-1230123";

        char gender = ssn.charAt(7); // '1'
//        char, 정수, 실수 -> 문자열 변환 : String.valueOf(값)
        System.out.println(gender);  //
    }
}