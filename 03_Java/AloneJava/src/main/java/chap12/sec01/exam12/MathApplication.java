package chap12.sec01.exam12;

/**
 * packageName : chap12.sec01.exam12
 * fileName : MathApplication
 * author : GGG
 * date : 2024-02-15
 * description : Math 클래스 : 수학 함수들
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class MathApplication {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 10;

//        TODO: 최대값 : Math.max(값, 값2)
        System.out.println(Math.max(v1, v2));
//        TODO: 최대값 : Math.min(값, 값2)
        System.out.println(Math.min(v1, v2));

        int v3 = -1;
//        TODO: 절대값 (무조건 양수로 만듦) : Math.abs(값)
        System.out.println(Math.abs(v3));

        double v4 = 5.3;
//        TODO: 올림 : Math.ceil(값)
        System.out.println(Math.ceil(v4));
//        TODO: 내림 : Math.floor(값)
        System.out.println(Math.floor(v4));
//        TODO: 반올림 : Math.round(값)
        System.out.println(Math.round(v4));

//        TODO: 응용
        double v5 = 12.3456;    // 3번째 자리 반올림
        System.out.println((double) Math.round((v5 * 100)) / 100);
    }
}
