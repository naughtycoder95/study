package chap15.sec02.exam02;

/**
 * packageName : chap15.sec02.exam02
 * fileName : Message
 * author : GGG
 * date : 2024-02-14
 * description : Queue 자료구조 예제
 * 요약 :
 *      1) 처음에 들어간 자료가 처음으로 나옴 (선입선출, FIFO(First In First Out))
 *      2) 주요 함수 :
 *          - 넣기 : .offer()
 *          - 빼기 : .poll() : 큐에서 삭제됨, 뺀 값 확인가능
 *          - 조회 : .peek() : 첫번째 값 조회, 큐에서 삭제안됨
 *
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class Message {
    public String command;      // 명령어
    public String to;           // 대상(사람)

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Message{" +
                "command='" + command + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
