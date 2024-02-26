package ref;

/**
 * packageName : ref
 * fileName : StringRepeat
 * author : GGG
 * date : 2024-02-01
 * description : 특정 문자열을 반복시켜주는 함수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         GGG          최초 생성
 */
public class StringRepeat {
    public static void main(String[] args) {
        // TODO: hello 3번 출력
//       사용법 : 문자열.repeat(반복횟수)
        String temp = "hello";
        System.out.println(temp.repeat(3)); // hellohellohello

//      TODO: A 3번 출력
        char temp2 = 'A';
        String strTemp2 = String.valueOf(temp2);
        System.out.println(strTemp2.repeat(3)); // AAA

    }
}