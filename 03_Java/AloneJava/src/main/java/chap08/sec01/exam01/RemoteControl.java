package chap08.sec01.exam01;

/**
 * packageName : chap08.sec01.exam01
 * fileName : RemoteControl
 * author : GGG
 * date : 2024-02-08
 * description : TODO: 인터페이스
 * 요약 :
 *      TODO: 인터페이스
 *          1) 인터페이스에서 속성(필드) 무조건 전역상수가 됨 (static final 생략)
 *          2) 인터페이스에서 함수(메소드) 무조건 추상함수가 됨 : 실행블럭 {} 없음 (abstract 생략)
 *          3) 목적 : 추상클래스의 목적과 비슷 (명칭 표준화를 위해 오버라이딩 사용 강제)
 *          4) 사용법 : 정의 : interface 인터페이스명 {}
 *                  상속(구현) : class 클래스명 implements 인터페이스명 {}
 *          5) 실행클래스에서 사용 : 인터페이스 변수명 = 자식클래스;
 *                  잘못된 사용법 : 인터페이스 변수명 = new 인터페이스명(); (x)
 *          6) 인터페이스 다중 상속(구현) 가능 :
 *              => class 클래스명 implements 인터페이스명1, 인터페이스명2 ... {}
 *              => 자바) 일반클래스 상속 : 1개만 가능 : extends 부모클래스 {}
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public interface RemoteControl {
//    전역상수 : static final 속성
//    TODO: 인터페이스에서 속성(필드) 무조건 전역상수가 됨 (static final 생략)
    int MAX_VOLUME = 10;    // 최대볼륨
    int MIN_VOLUME = 1;     // 최소볼륨

//    함수
//    void : 함수에 return 예약어 안쓸때 사용
//    TODO: 인터페이스에서 함수(메소드) 무조건 추상함수가 됨 : 실행블럭 {} 없음 (abstract 생략)
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
