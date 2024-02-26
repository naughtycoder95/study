package chap07.sec02.exam02;

/**
 * packageName : chap07.sec02.exam02
 * fileName : Vehicle
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 부모클래스 , 다형성 #2 (함수 이용)
 * 요약 :
 *      TODO: 함수의 매개변수를 이용한 다형성
 *          1) 특정 클래스의 함수 정의
 *          2) 함수(부모클래스 변수){변수.함수()};
 *          3) 실행클래스 : 함수(자식클래스); // 다형성 : 함수이용
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class Vehicle {
    public void run() {
        System.out.println("차량이 달립니다.");
    }

}
