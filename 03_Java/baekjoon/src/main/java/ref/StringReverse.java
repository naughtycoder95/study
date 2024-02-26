package ref;

/**
 * packageName : ref
 * fileName : StringReverse
 * author : GGG
 * date : 2024-02-01
 * description : 문자열 거꾸러 뒤집기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         GGG          최초 생성
 */
public class StringReverse {
    public static void main(String[] args) {
//        예제 : Hello -> olleH 로 출력하세요
        String str = "Hello";

//      반복문 : 문자열의 길이 -1 ~ 0까지 실행 ; 1씩 감소
        for (int i = str.length()-1; i >= 0 ; i--) {
            char temp = str.charAt(i); // 'o'
            System.out.print(temp);    // 'o' 'l' 'l'
        }
    }
}