package chap06.sec05.exam06;

/**
 * packageName : chap06.sec05.exam06
 * fileName : Earth
 * author : GGG
 * date : 2024-02-06
 * description : TODO: 전역 상수 : static final
 * 요약 :
 *      TODO: 전역 상수는 이름을 대문자로 만듦(약속)
 *        사용법 : static final 속성(필드) = "값";
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class Earth {
    // EARTH_RADIUS : 지구 반지름
    static final double EARTH_RADIUS = 6400;
    // 지구의 표면적 : 4 * 3.14 * 지구 반지름 * 지구 반지름
    static final double EARTH_AREA = 4 * 3.14 * EARTH_RADIUS * EARTH_RADIUS;
}