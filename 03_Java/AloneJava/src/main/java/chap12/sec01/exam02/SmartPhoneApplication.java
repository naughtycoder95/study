package chap12.sec01.exam02;

/**
 * packageName : chap12.sec01.exam02
 * fileName : SmartPhoneApplication
 * author : GGG
 * date : 2024-02-15
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class SmartPhoneApplication {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("구글", "안드로이드");

//        .toString() 함수 : 객체를 문자열로 변환하는 함수
//        출력 : 패키지명+클래스명@16진수해쉬코드(방번호)
//        개발자 기대하는 출력 : 속성의 값들을 보고 싶다.
        System.out.println(smartPhone.toString());
        System.out.println(smartPhone);                // 생략가능
    }
}