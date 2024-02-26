package chap07.sec01.exam01;

/**
 * packageName : chap07.sec01.exam01
 * fileName : DmbCellPhone
 * author : GGG
 * date : 2024-02-06
 * description : TODO: 자식 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class DmbCellPhone extends CellPhone {
    //    3요소 : 속성(필드), 생성자, 함수(메소드)
    int channel;   // tv 채널 속성(필드)

    //    생성자 : 3개짜리, model, color, channel
//    alt + insert
    public DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }
    //  tv 수신하는 함수
    void turnOn() {
        System.out.println("tv 를 수신합니다.");
    }
}