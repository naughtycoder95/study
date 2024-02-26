package chap07.sec01.exam06;

/**
 * packageName : chap07.sec01.exam06
 * fileName : SportsCar
 * author : GGG
 * date : 2024-02-07
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class SportsCar extends Car {
//    TODO: 부모 클래스를 상속하면 부모 클래스의 재산(속성(필드), 생성자, 함수(메소드))을 모두 사용가능
//    TODO: 함수(메소드) 오버라이딩(재정의) : alt + insert
//      speedUp() : 일반 함수   => 함수 재정의 가능
//      stop()    : final 함수 => 함수 재정의 불가

    @Override
    public void speedUp() {
        super.speedUp();
        speed += 10;
    }
}
