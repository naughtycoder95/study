package chap07.verify.exam12;

/**
 * packageName : chap07.verify.exam12
 * fileName : report
 * author : GGG
 * date : 2024-02-07
 * description : 매개변수 다형성 이용 함수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class Report {
    public void drawing(Graph graph) {
        graph.draw(); // 재정의된 자식클래스의 함수가 호출
    }
}
