package chap15.sec01.exam07;

/**
 * packageName : chap15.sec01.exam07
 * fileName : BoxingApplication
 * author : GGG
 * date : 2024-02-13
 * description : Wrapper(포장,싸는것) Class
 *              Boxing/UnBoxing(박스포장/박스뜯기) 예제
 * 요약 :
 *      1) 기본 자료형 : int, long, char, double, boolean 등
 *      2) 기본 자료형을 객체(클래스)형태로 변환해서 사용할 경우가 생김
 *          예) List<Integer> list = new ArrayList<>();
 *      3) 객체 자료형 : 래퍼클래스(Wrapper Class)
 *          - int    -> Integer
 *          - long   -> Long
 *          - char   -> Character
 *          - double -> Double
 *          - boolean-> Boolean
 *          - ...
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class BoxingApplication {
    public static void main(String[] args) {
        Integer obj = 100;  // 정수 -> 객체자료형 넣기 : Boxing(박싱)

//      기본자료형 <- 객체자료형
        int value = obj;    // 객체자료형 -> 기본자료형 : UnBoxing(언박싱)

//      출력 : 2개
        System.out.println(obj);
        System.out.println(value);

    }
}