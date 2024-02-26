package chap12.sec01.exam03;

/**
 * packageName : chap12.sec01.exam03
 * fileName : SystemTimeApplication
 * author : GGG
 * date : 2024-02-15
 * description : System 클래스 함수 : nanoTime()
 * 요약 :
 *      1) 사용법 : System.nanoTime()
 *      => 1/10^9초가 나옴
 *      => 날짜/시간 => 사용하지 않음, 주로 소요시간 계산에 사용
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class SystemTimeApplication {
    public static void main(String[] args) {
//        알고리즘 : 1) 처음시간 측정
//                 2) 실행문 실행
//                  3) 끝시간 측정 : 끝시간 - 처음시간 = 소요시간
//        TODO: 1) 처음시간 측정
        long time = System.nanoTime(); // 1/10^9 시간

//        TODO: 2) 실행문 실행 : 반복문(1~1000000)
        int sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum = sum + i;
        }
//        TODO:  3) 끝시간 측정 : 끝시간 - 처음시간 = 소요시간
        long time2 = System.nanoTime(); // 1/10^9 시간
        System.out.println(time2 - time);
    }
}