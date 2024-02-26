package chap15.sec01.exam06;

/**
 * packageName : chap15.sec01.exam06
 * fileName : SmartPhone
 * author : GGG
 * date : 2024-02-13
 * description : .toString() 재정의
 * 요약 :
 *      1) toString() : 객체의 정보를 출력하는 함수
 *                      (객체를 문자열로 변환해서 출력하는 함수)
 *      2) 코딩(재정의) : 속성의 값을 내보내기 하면 됨
 *         => why? 안하면 주소값이 문자열로 출력됨
 *      3) 자동화 기능 이용 : alt + insert(cmd + n)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class SmartPhone {
    private String company;   // 회사(애플, 삼서등)
    private String os;        // 운영체제(os) : IOS, 안드로이드 등, unix

    //  생성자 2개 : alt + insert(cmd + n)
    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    //   TODO: toString() 재정의 : alt + insert
//     코딩 : 속성의 값을 내보내기 하면 됨
    @Override
    public String toString() {
//        속성(필드) : company, os (문자열)
        return this.company + "," + this.os;
    }
}