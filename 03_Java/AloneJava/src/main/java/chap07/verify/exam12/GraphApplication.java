package chap07.verify.exam12;

/**
 * packageName : chap07.verify.exam12
 * fileName : GraphApplication
 * author : GGG
 * date : 2024-02-07
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class GraphApplication {
    public static void main(String[] args) {
//    TODO: 연습문제) 다형성 + 상속 예제
//     아래 소스를 보고 Graph(부모클래스) 와 StockGraph(자식클래스) 클래스를 완성하세요.
//     결과 :
//           주가변경 추이를 그립니다.
//           기본 그래프를 그립니다.
        StockGraph stockGraph = new StockGraph();   // 자식
        Graph graph = new Graph();                  // 부모

        Report r = new Report();
        r.drawing(stockGraph); // "주가변경 추이를 그립니다."
        r.drawing(graph);      // "기본 그래프를 그립니다."
    }
}
