package chap15.sec01.exam02;

import java.util.Objects;

/**
 * packageName : chap15.sec01.exam02
 * fileName : Board
 * author : GGG
 * date : 2024-02-08
 * description : TODO: Vector
 * 요약 :
 *      TODO: 1) List 인터페이스(부모) : ArrayList, Vector, LinkedList
 *            2) equals(), hashCode() 함수 재정의 필요
 *              => 그냥 사용하면 스택방 번호 (주소값)만 비교함
 *              => 함수 재정의 필요 (개발툴 자동화 기능 이용)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Board {
//    3요소 : 속성(필드), 생성자, 함수(메소드)
    String subject; // 제목
    String content; // 내용
    String writer;  // 작성자

//    생성자 : alt + insert : 3개
    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

//    TODO: 일반 클래스일 경우 동등비교 등 함수 재정의 : equals(), hashCode()
//      alt + insert

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(subject, board.subject) && Objects.equals(content, board.content) && Objects.equals(writer, board.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, content, writer);
    }

//    함수 재정의 : toString() : 배열 -> 문자열 출력
//      => 그냥 출력 : 방번지(주소)가 출력됨
//      => 속성값을 출력하도록 함수 재정의 해야함
//    alt + insert
    @Override
    public String toString() {
        return "Board{" +
                "subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
