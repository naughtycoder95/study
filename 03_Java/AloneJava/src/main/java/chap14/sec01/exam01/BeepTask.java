package chap14.sec01.exam01;

import java.awt.*;

/**
 * packageName : chap14.sec01.exam01
 * fileName : BeepTask
 * author : GGG
 * date : 2024-02-20
 * description : 작업 쓰레드
 * 요약 :
 *      1) 쓰레드 : 프로세스 안에서 독립적으로 실행되는 것
 *          - 프로세스 : 실행중인 프로그램 (한글, 워드, 카카오톡 등)
 *          - 멀티 프로세스 : 실행중인 프로그램이 2 이상인것
 *      2) 멀티 쓰레드 : 프로세스 안에서 독립적으로 2 이상 실행되는 것
 *      3) 사용법 :
 *          - 인터페이스 상속으로 사용
 *          - 일반 클래스 상속으로 사용
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class BeepTask implements Runnable {
    //    TODO: 1) 삐소리를 내는 쓰레드 , 2) 화면에  띵 5번 출력하는 쓰레드
//    alt + insert :
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