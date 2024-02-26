package chap15.sec01.verify.exam03;

/**
 * packageName : chap15.sec01.verify.exam03
 * fileName : Faq
 * author : GGG
 * date : 2024-02-13
 * description : 모델(Model) 클래스 : 핵심정보가 있는 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class Faq {
    int fid;         // faq 번호
    String subject;  // 제목
    String text;     // 내용
    //    생성자 : 3개
    public Faq(int fid, String subject, String text) {
        this.fid = fid;
        this.subject = subject;
        this.text = text;
    }
    //  getter 함수 : 3개
    public int getFid() {
        return fid;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }
}