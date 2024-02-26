package chap06.sec04.exam05;

/**
 * packageName : chap06.sec04.exam05
 * fileName : Car
 * author : GGG
 * date : 2024-02-05
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class Car {
    //    속성(필드)
    int speed;     // 속도

    //    TODO: 함수(메소드) : "키를 돌립니다. 출력"
    void keyTurnOn() {
        System.out.println("키를 돌립니다.");
    }

    //   TODO: 5개의 달립니다. 출력 + 1 ~ 5 같이 출력
    void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("달립니다." + i);
            speed = i;            // 최종결과를 속성(필드)에 저장해 놓기
        }
    }

    //  TODO: 현재 속도 값을(speed) return
    int getSpeed() {
        return speed;             // 속성(필드) 값을 return 하기
    }
}