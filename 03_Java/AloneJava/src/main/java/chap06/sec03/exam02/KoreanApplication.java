package chap06.sec03.exam02;

/**
 * packageName : chap06.sec03.exam02
 * fileName : KoreanApplication
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
public class KoreanApplication {
    public static void main(String[] args) {
//                한국인 객체를 생성
//        매개변수 2개짜리 생성자를 이용해서 속성(필드)을 초기화하세요.
//        초기화 한 결과를 출력하세요.
//        name 속성(필드), ssn 속성(필드)
//        결과 :
//            박자바
//            011225-1234567
//            김자바
//            930525-0654321
//        2개짜리 매개변수 생성자 호출하면서 속성 초기화됨

        Korean korean = new Korean("박자바", "011225-1234567");
        Korean korean2 = new Korean("김자바", "930525-0654321");

        System.out.println(korean.name);
        System.out.println(korean.ssn);
        System.out.println(korean2.name);
        System.out.println(korean2.ssn);
    }
}