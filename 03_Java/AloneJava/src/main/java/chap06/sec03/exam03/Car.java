package chap06.sec03.exam03;

/**
 * packageName : chap06.sec03.exam03
 * fileName : Car
 * author : GGG
 * date : 2024-02-02
 * description : 자동차 클래스
 * 요약 :
 *      TODO: 1) 생성자 오버로딩 :
 *          => 생성자함수들은 매개변수를 다양하게 여러개 만들수 있음
 *          => 과거 언어) c-언어 => 함수명이 중복되면 에러
 *             예) car(), car(int a) => 에러
 *            2) this : 클래스 자기자신을 의미, 일반클래스
 *             예) this.속성명
 *            3) 참고) this() == Car() : 매개변수 없는 생성자함수를 호출
 *             예) this(값, 값2) == Car(int a, int b)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-02         GGG          최초 생성
 */
public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //    기본생성자 : (접근제한자) 클래스명(){}
//  TODO: public (공공의)
    public Car() {}

    //    생성자 : 매개변수 3
//    TODO: this : 클래스 자기자신을 의미 (==Car)
//      => 실행클래스 x , 일반클래스 사용가능 : o
//      => 예) 객체.속성 == this.속성
//    TODO: 자동생성 : alt + insert -> 생성자 -> 속성(필드)선택 -> 확인
    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    //   생성자 : 매개변수 2 : model, color
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    //   생성자 : 매개변수 1 : model
    public Car(String model) {
        this.model = model;
    }
}