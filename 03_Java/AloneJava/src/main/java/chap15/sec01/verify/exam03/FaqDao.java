package chap15.sec01.verify.exam03;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : chap15.sec01.verify.exam03
 * fileName : FaqDao
 * author : GGG
 * date : 2024-02-13
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class FaqDao {
    public List<Faq> createFaq() {
//        내용 완성
//        ArrayList 사용, .add()
        List<Faq> list = new ArrayList<>();
        list.add(new Faq(1, "제목1", "내용1"));
        list.add(new Faq(2, "제목2", "내용2"));
        list.add(new Faq(3, "제목3", "내용3"));

        return list;
    }
}
