package chap07.verify.exam02;

/**
 * packageName : chap07.verify.exam02
 * fileName : Point
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
public class Point {
    //   속성 정의
    int x;
    int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //    (3,4) 출력하는 함수
    void showPoint() {
//        코딩
        System.out.println("(" + x + "," + y + ")");
    }
}