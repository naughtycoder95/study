package chap06.sec03.verify.exam03;

/**
 * packageName : chap06.sec03.verify.exam03
 * fileName : BoardApplication
 * author : GGG
 * date : 2024-02-05
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class BoardApplication {
    public static void main(String[] args) {
//        2) Board 객체를 생성하고 싶습니다. 생성자에서 title 속성과 content 속성을
//        외부에서 받은 값으로 초기화 할 수 있도록 Board 클래스를 작성해 보세요.
//        생성자 단축키 : alt + insert (오른쪽클릭 -> 생성 -> 생성자 -> 속성선택)
//        TODO: 해석 : 매개변수 2개짜리 생성자 만들고 값넣고 출력
//        결과 :
//               제목
//               내용
        Board board = new Board("제목", "내용");
        System.out.println(board.title);
        System.out.println(board.content);
    }
}