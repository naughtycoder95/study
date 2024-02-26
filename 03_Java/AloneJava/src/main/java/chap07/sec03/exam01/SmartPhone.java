package chap07.sec03.exam01;

/**
 * packageName : chap07.sec03.exam01
 * fileName : SmartPhone
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 자식 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class SmartPhone extends Phone {
    //    생성자 : alt + insert(cmd + n)
    public SmartPhone(String owner) {
        super(owner);
    }
    //    함수 : 인터넷 검색
    public void search() {
        System.out.println("인터넷 검색");
    }
}