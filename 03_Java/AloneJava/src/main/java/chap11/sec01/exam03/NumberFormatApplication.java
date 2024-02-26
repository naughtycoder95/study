package chap11.sec01.exam03;

/**
 * packageName : chap11.sec01.exam03
 * fileName : NumberFormatApplication
 * author : GGG
 * date : 2024-02-14
 * description : Number Format Exception :
 * 요약 :
 *      1) 숫자로 바꿀수 없는 값을 강제로 바꿀때 발생
 *       => .NumberFormatException
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class NumberFormatApplication {
    public static void main(String[] args) {
        String data1 = "100";   // 문자열
        String data2 = "a100";  // 문자열

//      TODO: Integer.parseInt(문자열) : 숫자 변환 함수
        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);

        System.out.println(value1);
        System.out.println(value2);

    }
}