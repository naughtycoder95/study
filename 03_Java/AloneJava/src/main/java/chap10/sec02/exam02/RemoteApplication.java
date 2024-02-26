package chap10.sec02.exam02;

/**
 * packageName : chap10.sec02.exam02
 * fileName : RemoteApplication
 * author : GGG
 * date : 2024-02-20
 * description : 익명클래스 사용 : 인터페이스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class RemoteApplication {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

//        속성 익명 클래스 실행     : Tv 를 켭니다.
        anonymous.remoteControl.turnOn();

//        함수 안에 익명 클래스 실행 : 오디오를 켭니다.
        anonymous.method1();

//        함수 매개변수로 익명 클래스 사용         : 스마트 tv 를 켭니다.
        anonymous.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("스마트 tv 를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("스마트 tv 를 끕니다.");
            }
        });
    }
}