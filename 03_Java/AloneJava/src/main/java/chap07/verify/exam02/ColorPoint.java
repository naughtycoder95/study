package chap07.verify.exam02;

/**
 * packageName : chap07.verify.exam02
 * fileName : ColorPoint
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
public class ColorPoint extends Point {
    String color; // 점의 색

    public void setColor(String color) {
        this.color = color;
    }

    void showColorPoint() {
        System.out.println(color); // 색깔 출력 : red
        showPoint();    // 부모클래스의 함수 호출 : (3,4)
    }
}