package ref;

/**
 * packageName : ref
 * fileName : StringSplit
 * author : GGG
 * date : 2024-01-30
 * description : String : split() 함수
 * 요약 :
 *      문자열에 특정구분자로 분리해서 배열로 저장하는 함수
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class StringSplit {
    public static void main(String[] args) {
        String str      = "1 2 3";
//      배열
        String[] result = str.split(" ");

//      배열 출력 : 반복문
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);   // 배열값 출력
        }
    }
}