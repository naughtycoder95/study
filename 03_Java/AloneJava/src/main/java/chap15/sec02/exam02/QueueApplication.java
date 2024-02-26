package chap15.sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName : chap15.sec02.exam02
 * fileName : QueueApplication
 * author : GGG
 * date : 2024-02-14
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class QueueApplication {
    public static void main(String[] args) {
//        TODO: 큐 인터페이스(객체) 생성 : Queue<자료형> 변수 = new LinkedList<>();
//          큐 : 인터페이스 (스택 : 클래스)
        Queue<Message> queue = new LinkedList<>();

//        TODO: .offer(값) : 큐에 자료 넣기
        queue.offer(new Message("sendMail", "홍길동"));
        queue.offer(new Message("sendSMS", "장길산"));
        queue.offer(new Message("sendKakao", "홍두깨"));

        System.out.println(queue);

//        TODO: .poll() : 자료 꺼내기 -> 큐에서 삭제됨
        Message message = queue.poll();
        System.out.println(message);
        Message message2 = queue.poll();
        System.out.println(message2);

//        TODO: .peek() : 현재 큐의 첫번째 값 조회
        System.out.println(queue.peek());
    }
}
