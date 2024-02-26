package chap07.sec03.exam01;

/**
 * packageName : chap07.sec03.exam01
 * fileName : PhoneApplication
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
public class PhoneApplication {
    public static void main(String[] args) {
//        자식 클래스 : 클래스 변수 = new 생성자함수();
        SmartPhone smartPhone = new SmartPhone("홍길동");

//       TODO: 추상클래스 : abstract class
        smartPhone.turnOn();       // 전원켜기(부모)
        smartPhone.search();       // 검색(자식)
        smartPhone.turnOff();      // 전원끄기(부모)
    }
}