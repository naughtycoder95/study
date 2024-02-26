package chap14.sec01.exam01;

/**
 * packageName : chap14.sec01.exam01
 * fileName : BeepTaskApplication
 * author : GGG
 * date : 2024-02-20
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class BeepTaskApplication {
    public static void main(String[] args) {
//       Todo: 1) 삐소리 쓰레드 실행
        Runnable runnable = new BeepTask();   // 작업쓰레드 #1
        Thread thread = new Thread(runnable); // 작업쓰레드 #1 를 쓰레드에 넘김
        thread.start();                       // 쓰레드 실행

//       Todo: 2) 띵 출력 실행 : 5번
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);        // 0.5초 실행 지연
            } catch (Exception e) {}
        }
    }
}