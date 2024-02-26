package chap07.verify.exam09;

/**
 * packageName : chap07.verify.exam09
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
        // 문제 : 아래 실행클래스의 실행결과와 추상 클래스의 Computer 객체를 보고
//      DeskTop , NoteBook 객체를 디자인(코딩) 하세요
        Computer computer = new DeskTop();

        computer.turnOn();       // "전원을 켭니다."
        computer.display();      // "DeskTop Display()"
        computer.typing();       // "DeskTop Typing()"

        computer = new NoteBook(); // 데스크탑 -> 노트북으로 변경
        computer.display();      // "NoteBook Display()"
        computer.typing();       // "NoteBook Typing()"

        computer.turnOff();         // "전원을 끕니다."
    }
}
