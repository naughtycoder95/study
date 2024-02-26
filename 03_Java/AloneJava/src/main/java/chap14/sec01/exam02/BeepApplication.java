package chap14.sec01.exam02;

/**
 * packageName : chap14.sec01.exam02
 * fileName : BeepApplication
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
public class BeepApplication {
    public static void main(String[] args) {
        Thread thread = new BeepThread(); // 다형성
        thread.start();                   // 삐소리 쓰레드 실행 #1

//        띵 화면 출력 : 5번
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);   // 0.5 초 실행 지연
            } catch (Exception e) {}
        }
    }
}