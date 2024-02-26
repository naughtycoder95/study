package chap06.sec05.exam05;

/**
 * packageName : chap06.sec05.exam05
 * fileName : PersonApplication
 * author : GGG
 * date : 2024-02-05
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class PersonApplication {
    public static void main(String[] args) {
        Person person = new Person("1234567-12345678", "홍길동");

        System.out.println(person.nation); // 상수
        System.out.println(person.ssn);    // 상수
        System.out.println(person.name);   // 속성(필드)

//      테스트: 상수값 수정
//        person.nation = "CANADA";          // (x) 수정불가(why? 상수)
    }
}