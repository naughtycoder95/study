package chap12.sec01.exam03;

/**
 * packageName : chap12.sec01.exam03
 * fileName : ExitApplication
 * author : GGG
 * date : 2024-02-15
 * description : System 클래스의 함수들 : exit()
 * 요약 :
 *        TODO: 프로그램을 강제종료 , 밑에 실행문이 실행되지 않음
 *          사용법 : System.exit(숫자)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class ExitApplication {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==5) {
//                반복문 중단 : break;
//             TODO: 프로그램을 강제종료 , 밑에 실행문이 실행되지 않음
//                사용법 : System.exit(숫자)
                System.exit(0); // 정상종료 : 0, 비정상종료 : -1
            }
        }
        System.out.println("실행될까요?"); // 실행 안됨
    }
}