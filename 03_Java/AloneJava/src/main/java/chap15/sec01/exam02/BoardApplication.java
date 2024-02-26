package chap15.sec01.exam02;

import java.util.List;
import java.util.Vector;

/**
 * packageName : chap15.sec01.exam02
 * fileName : BoardApplication
 * author : GGG
 * date : 2024-02-08
 * description : TODO: 특수한 목적으로 사용함
 * 요약 :
 *      TODO: 멀티쓰레드 환경에서 사용함
 *          멀티쓰레드 : 쓰레드(1개의 프로그램), 쓰레드(1개의 프로그램)
 *              => 프로그램 안에 여러개의 프로그램이 독립적으로 실행되는 것
 *              => 일반환경에서 사용할때는 ArrayList 속도가 더 빠름
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class BoardApplication {
    public static void main(String[] args) {
//        Vector 클래스 생성 : 클래스 변수 = new 생성자함수()
//        TODO: 자동 import 단축키 : alt + enter
        List<Board> list = new Vector<>();  // 다형성 코드

//        추가/삭제/수정 함수 : add()/remove()/set()
//        객체 추가
        list.add(new Board("제목", "내용", "작성자"));
        list.add(new Board("제목2", "내용2", "작성자"));
        list.add(new Board("제목3", "내용3", "작성자"));
        list.add(new Board("제목4", "내용4", "작성자"));
        list.add(new Board("제목5", "내용5", "작성자"));

        System.out.println(list);

//        삭제
        list.remove(2);         // 인덱스 2번 삭제 [제목, 제목2, 제목4, 제목5]
        list.remove(3);         // 인덱스 3번 삭제 [제목, 제목2, 제목4]

//        배열값 : 반복문 : 변수.get(인덱스번호)
        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board.subject + " " + board.content + " " + board.writer);
        }
    }
}
