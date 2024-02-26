package chap10.sec02.exam02;

/**
 * packageName : chap10.sec02.exam02
 * fileName : Anonymous
 * author : GGG
 * date : 2024-02-20
 * description : 익명클래스 사용 : 인터페이스
 * 요약 :
 *      1) 인터페이스 익명클래스 : 인터페이스를 상속받아 구현한 이름없는 자식클래스
 *      2) 사용법 : 인터페이스 변수 = new 인터페이스명() {} => {} : 익명클래스, 1회용 클래스
 *          인터페이스 변수
 *             = new 인터페이스명() {
 *         @Override
 *         public void 재정의함수() {
 *             실행문;
 *         }
 *     };
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class Anonymous {
    //    속성(필드), 함수(메소드)
//    1) 속성(필드) : 익명클래스 사용
    RemoteControl remoteControl
            = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("Tv 를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("Tv 를 끕니다.");
        }
    };

    //    2) 함수(메소드) 안에서 익명클래스 사용
    void method1() {
        RemoteControl remoteControl2
                = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("오디오를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("오디오를 끕니다.");
            }
        };
        remoteControl2.turnOn();         // 함수 실행
    }

    //    3) 함수 매개변수로 익명클래스 사용
    void method2(RemoteControl remoteControl) {
        remoteControl.turnOn();
    }
}