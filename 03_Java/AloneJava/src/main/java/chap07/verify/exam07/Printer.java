package chap07.verify.exam07;

/**
 * packageName : chap07.verify.exam07
 * fileName : Printer
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 부모클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class Printer {
    public void powerOn(){
        System.out.println("전원켜기");
    }

    public void print() {
        System.out.println("기본 프린터 입니다. 기본사양으로 프린팅합니다.");
    };

    public void powerOff(){
        System.out.println("전원끄기");
    }
}
