package chap06.sec05.exam06;

/**
 * packageName : chap06.sec05.exam06
 * fileName : EarthApplication
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
public class EarthApplication {
    public static void main(String[] args) {
//        복습 : static(전역) -> 클래스 생성없음 -> 바로 사용가능
//        클래스 변수 = new 생성자(); // 필요없음
//        TODO: static(전역) 사용법 : 클래스명.전역속성(전역상수)
        System.out.println(Earth.EARTH_RADIUS); // 지구반지름
        System.out.println(Earth.EARTH_AREA);   // 지구표면적
    }
}
