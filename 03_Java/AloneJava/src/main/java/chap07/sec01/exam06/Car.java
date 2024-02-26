package chap07.sec01.exam06;

/**
 * packageName : chap07.sec01.exam06
 * fileName : Car
 * author : GGG
 * date : 2024-02-07
 * description : TODO: final 함수(메소드) : 부모클래스
 * 요약 :
 *      TODO: 상속관계에서 부모함수(메소드)에 붙이면 자식클래스에서 오버라이딩(재정의) 불가함
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class Car {
    //  TODO: 3요소 : 속성(필드==멤버변수,인스턴스변수), 생성자함수, 함수(메소드)
    public int speed;

    //    함수(메소드)
    public void speedUp(){
        speed += 1;  // 축약식
//        speed = speed + 1;
    }

    //    TODO: final 함수(메소드)
//  void : 함수의 return 예약어가 없음을 나타낼때 사용
    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}