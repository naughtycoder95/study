package chap07.sec01.exam02;

/**
 * packageName : chap07.sec01.exam02
 * fileName : People
 * author : GGG
 * date : 2024-02-06
 * description : TODO: 상속 : 부모클래스 : super 예약어
 * 요약 :
 *      TODO: super(값, ...) : 부모생성자를 호출하는 예약어
 *              1) 순서중시 : 부모생성자 호출 - 자식생성자 처리
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class People {
    //    TODO: 3요소 : *속성, 생성자, 함수
    public String name;
    public String ssn;   // 주민번호
    //    생성자 : 2개짜리 : alt + insert
    public People(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}