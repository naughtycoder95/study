package chap15.sec01.verify.exam03;

import java.util.List;

/**
 * packageName : chap15.sec01.verify.exam03
 * fileName : FaqApplication
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
public class FaqApplication {
    public static void main(String[] args) {
        // TODO: 연습문제) 실행 클래스의 결과가 다음과 같도록
//       Faq 모델을 디자인하고 실행클래스 FaqApplication 에서
//      다음과 같은 결과가 나오도록 코딩하세요
//    결과 :
//        1 제목1 내용1
//        2 제목2 내용2
//        3 제목3 내용3
        FaqDao faqDao = new FaqDao();

        List<Faq> faqList =  faqDao.createFaq();

        //        List 배열 내용 출력
        for(Faq faq : faqList) {
            System.out.println(faq.getFid() + " "
                    + faq.getSubject() + " "
                    + faq.getText());
        }
    }
}
