package chap14.sec01.exam02;

import java.awt.*;

/**
 * packageName : chap14.sec01.exam02
 * fileName : BeepThread
 * author : GGG
 * date : 2024-02-20
 * description : 쓰레드 상속받아 만들기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class BeepThread extends Thread {
    //    함수 재정의 : run()
    @Override
    public void run() {
        //    TODO: 1) 삐소리를 내는 쓰레드 : 5번
//        자바 멀티미디어 클래스 import 사용 : java.awt.*;
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // 소리내는 클래스 가져오기
        for (int i = 0; i < 5; i++) {
            toolkit.beep();              // 삐소리
            try {
                Thread.sleep(500);  // 0.5초 실행 지연시킴
            } catch (Exception e) {}
        }
    }
}