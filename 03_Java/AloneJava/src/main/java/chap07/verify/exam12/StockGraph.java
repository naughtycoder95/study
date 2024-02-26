package chap07.verify.exam12;

/**
 * packageName : chap07.verify.exam12
 * fileName : StockGraph
 * author : GGG
 * date : 2024-02-07
 * description : 자식클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class StockGraph extends Graph{
//    다형성 : 1) 상속 2) 함수재정의
//     => 정의 : 코드는 최소화하고 결과만 다양하게 나오게 하는것
    @Override
    public void draw() {
        System.out.println("주가변경 추이를 그립니다.");
    }
}