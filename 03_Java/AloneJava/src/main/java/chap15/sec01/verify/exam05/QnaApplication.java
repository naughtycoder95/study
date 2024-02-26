package chap15.sec01.verify.exam05;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName : chap15.sec01.verify.exam05
 * fileName : QnaApplication
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
public class QnaApplication {
    public static void main(String[] args) {
// TODO: 연습문제) Map 자료구조에 값과 객체를 추가하고 아래와 같이 결과가 출력하도록
//    실행 클래스와 Qna 객체를 디자인(코딩)하세요
//    힌트 : put(), get()
//    입력 :  키         |    값
//         currentPage      1
//         totalNum         8
//         qna             Qna{qno=1, question='질문', questioner='질문자', answer='답변', answerer='답변자'}
//         sizePerPage      4
//    결과 :
//    1
//    8
//    Qna{qno=1, question='질문', questioner='질문자', answer='답변', answerer='답변자'}
//    4

        Map<String , Object> map = new HashMap<>();

        map.put("currentPage", 1);
        map.put("totalNum", 8);
        map.put("qna", new Qna(1, "질문", "질문자", "답변","답변자"));
        map.put("sizePerPage", 4);

//        System.out.println(map); // 전체 출력
        System.out.println(map.get("currentPage"));
        System.out.println(map.get("totalNum"));
        System.out.println(map.get("qna"));
        System.out.println(map.get("sizePerPage"));
    }
}