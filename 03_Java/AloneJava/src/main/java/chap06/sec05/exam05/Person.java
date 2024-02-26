package chap06.sec05.exam05;

/**
 * packageName : chap06.sec05.exam05
 * fileName : Person
 * author : GGG
 * date : 2024-02-05
 * description : TODO: 상수 : final 예약어
 * 요약 :
 *      TODO: 변수 : 1가지값을 저장하는 곳, 수정가능
 *            상수 : 1가지값을 저장하는 곳, 수정불가
 *       상수 : 정의하면 바로(즉시) 값을 넣어야함
 *             아니면, 생성자를 이용해서 넣기
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class Person {
    final String nation = "Korea"; // 1) 상수 : 값 바로 넣기

    final String ssn;      // 주민번호
    String name;

    //   생성자 : 2 (ssn, name)
//    alt + insert
    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}