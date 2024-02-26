package chap08.sec01.exam01;

/**
 * packageName : chap08.sec01.exam01
 * fileName : SmartApplication
 * author : GGG
 * date : 2024-02-08
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class SmartApplication {
    public static void main(String[] args) {
//        클래스 생성 : 클래스 변수 = new 생성자함수();
        SmartTelevision smartTelevision = new SmartTelevision();

//        인터페이스에 위의 클래스 저장
        RemoteControl remoteControl = smartTelevision;
        Searchable searchable = smartTelevision;

        remoteControl.turnOn();
        remoteControl.setVolume(7);
        searchable.search("www.naver.com");
        remoteControl.turnOff();
    }
}
