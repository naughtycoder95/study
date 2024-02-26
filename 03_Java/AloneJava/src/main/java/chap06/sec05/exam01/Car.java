package chap06.sec05.exam01;

/**
 * packageName : chap06.sec05.exam01
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
    //   TODO: *속성(필드), 생성자, 함수(메소드)
    String model;
    int speed;

    //  생성자 : 1개 , 매개변수 : model
//  단축키 : alt + insert (맥: cmd + n)
    public Car(String model) {
        this.model = model;
    }

    //  TODO: 속성에 값을 저장/수정하는 함수 : setter 함수 :
//     setter 함수 : speed 속성(필드)에 매개변수값을 저장할 함수
//     약속: 이름 : set속성명(매개변수){}
//    단축키 : alt + insert (맥: cmd + n)
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //  TODO: 속성에 값을 가져오는(조회하는) 함수 : getter 함수 : speed
//    약속 : 이름 : 자료형 get속성명() { return 속성;}
//    단축키 : alt + insert (맥: cmd + n)
    public int getSpeed() {
        return speed;
    }
}