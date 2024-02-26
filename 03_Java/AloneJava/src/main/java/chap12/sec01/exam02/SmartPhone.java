package chap12.sec01.exam02;

/**
 * packageName : chap12.sec01.exam02
 * fileName : SmartPhone
 * author : GGG
 * date : 2024-02-15
 * description : toString() 재정의
 * 요약 :
 *      1) 객체를 출력하면 방번호(주소)가 출력됨
 *      2) 재정의해서 속성(필드)의 값이 출력되게끔 함수를 작성
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class SmartPhone {
    private String company;
    private String os;

    //    생성자 2개
    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    //    toString() 재정의 : alt + insert(cmd + n)
    @Override
    public String toString() {
        return "SmartPhone{" +
                "company='" + company + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}