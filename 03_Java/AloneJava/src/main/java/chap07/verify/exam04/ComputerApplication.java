package chap07.verify.exam04;

/**
 * packageName : chap07.verify.exam04
 * fileName : ComputerApplication
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
public class ComputerApplication {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.turnOn(); // "전원을 켭니다." 출력
        computer.displayOn(); // "화면을 켭니다." 출력
        computer.typeOn(); // "타이핑을 합니다." 출력
        computer.turnOff(); // "전원을 끕니다." 출력
    }
}
