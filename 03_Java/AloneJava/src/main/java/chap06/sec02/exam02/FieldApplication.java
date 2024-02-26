package chap06.sec02.exam02;

/**
 * packageName : chap06.sec02.exam02
 * fileName : FieldApplication
 * author : GGG
 * date : 2024-02-02
 * description : 실행클래스 : main()
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-02         GGG          최초 생성
 */
public class FieldApplication {
    public static void main(String[] args) {
//        클래스 생성
        FieldInit fieldInit = new FieldInit();

//      TODO: 속성(필드) 출력 : 정수초기화 : 값 : 0
        System.out.println(fieldInit.byteField);
        System.out.println(fieldInit.shortField);
        System.out.println(fieldInit.intField);
        System.out.println(fieldInit.longField);

//      TODO: 참/거짓 : 초기값(false), char : \u0000(인텔리제이 안보임)
//        참고) 아스키코드(127자) vs 유니코드(휠씬 많은 문자가 포함됨)
        System.out.println(fieldInit.bField);
        System.out.println(fieldInit.charField);

//      TODO: 실수 : 0.0 / 배열 : 초기값(null) / 문자열 : 초기값(null)
        System.out.println(fieldInit.fField);
        System.out.println(fieldInit.doField);
        System.out.println(fieldInit.arrField);
        System.out.println(fieldInit.strField);
    }
}