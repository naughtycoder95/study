package chap07.verify.exam02;

/**
 * packageName : chap07.verify.exam02
 * fileName : PointApplication
 * author : GGG
 * date : 2024-02-06
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
// 문제 : 아래 ColorPoint와 실행클래스를 보고
//     부모 클래스 Point를 완성하세요
// 결과 :
//    red
//    (3,4)
public class PointApplication {
    public static void main(String[] args) {
        ColorPoint colorPoint = new ColorPoint();

        colorPoint.setX(3);          // 부모 setter
        colorPoint.setY(4);          // 부모 setter
        colorPoint.setColor("red");  // 자식 setter

        colorPoint.showColorPoint(); // 자식함수 호출 : red (3,4)
    }
}
