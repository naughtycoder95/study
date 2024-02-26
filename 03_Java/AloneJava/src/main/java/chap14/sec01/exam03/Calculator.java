package chap14.sec01.exam03;

/**
 * packageName : chap14.sec01.exam03
 * fileName : Calculator
 * author : GGG
 * date : 2024-02-20
 * description : 2개의 쓰레드(user1, user2)에서
 *         공통적으로 실행하는 함수가 있는 클래스 : setMemory()
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class Calculator {
    private int memory;

    //    getter / setter : alt + insert
    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);  // 2초 지연 (예외처리 필요)
        } catch (Exception e) {}
//        화면 출력 : memory 값
        System.out.println(this.memory);
    }
}