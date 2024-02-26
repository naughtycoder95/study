package chap07.sec01.exam01;

/**
 * packageName : chap07.sec01.exam01
 * fileName : CellApplication
 * author : GGG
 * date : 2024-02-06
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class CellApplication {
    public static void main(String[] args) {
//        클래스 생성 : DmbCellPhone
//          클래스 변수 = new 생성자함수();
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바", "검정", 10);

//        속성 출력
        System.out.println(dmbCellPhone.model);     // 부모속성
        System.out.println(dmbCellPhone.color);     // 부모속성
        System.out.println(dmbCellPhone.channel);   // 자식속성(dmbCellPhone)

//        함수 실행
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.voice();
        dmbCellPhone.hangUp();
        dmbCellPhone.turnOn();
        dmbCellPhone.powerOff();
    }
}
