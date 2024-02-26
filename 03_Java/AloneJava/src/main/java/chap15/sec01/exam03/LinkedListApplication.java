package chap15.sec01.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * packageName : chap15.sec01.exam03
 * fileName : LinkedListApplication
 * author : GGG
 * date : 2024-02-08
 * description : TODO: LinkedList
 * 요약 :
 *      TODO: 1) ArrayList는 순차적으로 값을 추가/삭제 시 속도 빠름
 *              => 중간에 값을 추가/삭제 시 속도 대폭 저하됨
 *            2) LinkedList는 중간에 값을 추가/삭제 시 속도 빠름
 *              => 순차적으로 값을 추가/삭제 시 속도가 대폭 저하됨
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class LinkedListApplication {
    public static void main(String[] args) {
//        TODO: ArrayList vs LinkedList 속도 비교
//          자동 import : alt + insert
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

//        1) 처음 시간 :
//        2) 실행 : 예) 반복문
//        3) 종료 시간 : 종료시간 - 처음시간 = 걸린시간
        long startTime;
        long endTime;

//        1) 처음 시간 : System 클래스 (시간표시, 강제종료, System.in 등)
//        TODO: 복습 : 전역함수, 전역상수 => 클래스명.함수명()
        startTime = System.nanoTime();  // 시간측정함수(나노초)

//        2) 실행 : 예) 반복문
        for (int i = 0; i < 10000; i++) {
//            중간에 값 추가 : .add(인덱스번호, 값)
//            끝에 값 추가 : .add(값)
            list.add(0, String.valueOf(i));
        }

//        3) 종료 시간
        endTime = System.nanoTime();
        System.out.println("걸린시간 : " + (endTime - startTime));

//        1) 처음 시간
        startTime = System.nanoTime();

//        2) LinkedList 실행
        for (int i = 0; i < 10000; i++) {
//            중간에 추가
            list2.add(0, String.valueOf(i)); // 정수 -> 문자열로 변환해서 추가
        }
//        3) 끝 시간
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린시간 : " + (endTime - startTime));
    }
}
