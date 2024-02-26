package ref;

/**
 * packageName : ref
 * fileName : StringContains
 * author : GGG
 * date : 2024-02-01
 * description : 문자열에서 찾을문자가 있으면 true / 없으면 false
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         GGG          최초 생성
 */
public class StringContains {
    public static void main(String[] args) {
//      TODO: java 에서 a 가 있으면 true 없으면 false 라고 출력
        String str   = "java";
        boolean flag = str.contains("a"); // true
        System.out.println(flag);         // true
    }
}