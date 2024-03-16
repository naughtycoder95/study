package org.example.modelexam.service.exam01;

import org.example.modelexam.dao.BoardDao;
import org.example.modelexam.model.Board;
import org.example.modelexam.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : org.example.modelexam.service.exam01
 * fileName : BoardService
 * author : GGG
 * date : 2024-03-15
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-15         GGG          최초 생성
 */
@Service
public class BoardService {
    //  todo: 연습 2)
//    BoardService 클래스를 만들고 findAll() 함수를 정의한다.
//    BoardController 클래스를 만들어서 getBoardAll() 함수를 정의하고,
//    샘플데이터 뷰로(jsp : board_all.jsp) 전송해 보세요.
//    DB 접속하는(조회/수정/추가/삭제) 클래스 : BoardDao
//    url : /exam01/board
//    jsp : /exam01/board/board_all.jsp
//    url test : http://localhost:8000/exam01/board
    @Autowired
    BoardDao boardDao;

//    전체 조회
    public List<Board> findAll() {
//        TODO : DB 전체 조회 실행
        List<Board> list = boardDao.selectAll();

        return list;
    }

//  todo: 연습 2-2)
//    BoardService 클래스를 만들고 findById() 함수를 정의한다.
//    BoardController 클래스를 만들어서 getBoardId() 함수를 정의하고,
//    샘플데이터 뷰로(jsp : board_id.jsp) 전송해 보세요.
//    url : /board/{id}
//    jsp : exam01/board/board_id.jsp
//    url test : http://localhost:8000/exam01/board/1

//   기본키(게시판번호)로 상세조회: 1건
    public Board findById(int id) {
//        TODO: DB 상세조회 함수 실행
        Board board = boardDao.selectById(id);

        return board;
    }

    //  todo: 연습 4-2)
//    BoardService 클래스를 만들고 save() 함수를 정의한다.
//    BoardController 클래스를 만들어서 addBoard(),
//    createBoard() 함수를 정의
//    addBoard()
//    - url : /board/addition
//    - jsp : exam01/board/add_board.jsp
//    createBoard()
//    - url : /board/add
//    - redirect url : /exam01/board
//    if(board.getId() == null) { boardDao.insert(게시판객체) }
//    else { boardDao.update(게시판객체) }
//    저장함수
    public List<Board> save(Board board) {
        List<Board> list = null;
//      게시판번호가 없으면(null) : insert
//      게시판번호가 있으면       : update
        if(board.getId() == null) {
            list = boardDao.insert(board); // 게시판번호 자동생성(시퀀스)
        }

        return list;
    }

//  todo: 연습 5-2)
//    BoardService 클래스를 만들고 save() 함수를 정의한다.
//    BoardController 클래스를 만들어서 editBoard(), updateBoard() 함수를 정의
//    editBoard()
//    - url : /board/edition/{id}
//    - jsp : exam01/board/update_board.jsp
//    updateBoard()
//    - url : /board/edit/{id}
//    - redirect url : /exam01/board
}


