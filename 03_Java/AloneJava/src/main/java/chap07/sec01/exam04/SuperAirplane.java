package chap07.sec01.exam04;

/**
 * packageName : chap07.sec01.exam04
 * fileName : SuperAirplane
 * author : GGG
 * date : 2024-02-06
 * description : TODO: 자식 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class SuperAirplane extends AirPlane {
    //    전역 상수(속성(필드))
    public static final int NORMAL = 1;
    public static final int SUPER = 2;

    public int flyMode = NORMAL;      // 1

    //  함수(메소드)재정의 : fly() => alt + insert
//  TODO: @xxx : 어노테이션 => spring 프레임워크 많이 활용
//             => 비슷한 예 : 함수와 비슷, 간단한 기능을 제공
//             => @Override : 오버라이딩 함수를 의미, (부모-자식)
//                   함수명 동일해야 오버라이딩 됨
//                   (오타 등의 이유로 이름이 틀이면 표시해줌)
    @Override
    public void fly() {
        if(flyMode == SUPER) {
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly();       // super : 부모클래스 의미
        }
    }
}