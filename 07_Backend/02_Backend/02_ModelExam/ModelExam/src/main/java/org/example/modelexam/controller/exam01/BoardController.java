package org.example.modelexam.controller.exam01;

import lombok.extern.slf4j.Slf4j;
import org.example.modelexam.model.Board;
import org.example.modelexam.service.exam01.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

/**
 * packageName : org.example.modelexam.controller.exam01
 * fileName : BoardController
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
@Slf4j
@Controller
@RequestMapping("/exam01")
public class BoardController {

    @Autowired
    BoardService boardService;

//   전체 조회
    @GetMapping("/board")
    public String getBoardAll(Model model) {
//        TODO: 전체 조회 서비스 함수 실행
        List<Board> list = boardService.findAll();
//        TODO: 배열 -> jsp 전송
        model.addAttribute("list", list);

        return "exam01/board/board_all.jsp";
    }

//  기본키로(게시판번호) 상세 조회
    @GetMapping("/board/{id}")
    public String getBoardId(@PathVariable int id,
                             Model model) {
//        TODO: 서비스 상세조회 함수 실행
        Board board = boardService.findById(id);
//        TODO: 객체 1개를 jsp 로 전송
        model.addAttribute("board", board);
        return "exam01/board/board_id.jsp";
    }

//   저장함수 : 2개 : 1) 추가(저장) 페이지 열기 함수
//                  2) 저장 버튼 클릭시 실행될 함수
//    addBoard()
//    - url : /board/addition
//    - jsp : exam01/board/add_board.jsp
//    1) 추가(저장) 페이지 열기 함수
    @GetMapping("/board/addition")
    public String addBoard() {
        return "exam01/board/add_board.jsp";
    }

//    createBoard()
//    - url : /board/add
//    - redirect url : /exam01/board
//    sql insert(추가/저장) : post 방식 -> @PostMapping
//    2) 저장 버튼 클릭시 실행될 함수 : DB 에 실제 저장
    @PostMapping("/board/add")
    public RedirectView createBoard(@ModelAttribute Board board) {
//        TODO: DB 에 저장하는 함수 실행(서비스)
        boardService.save(board);
//        TODO: 저장 후 전체 조회 페이지로 강제 이동 : exam01/board
        return new RedirectView("/exam01/board");
    }

    @GetMapping("/board/edition/{id}")
    public String editBoard(@PathVariable int id,
                            Model model) {
        Board board = boardService.findById(id);
        model.addAttribute("Board", board);
        return ("/exam01/board/update_board");
    }

    @PutMapping("/board/edit/{id}")
    public RedirectView updateBoard(@PathVariable int id,
                                  @ModelAttribute Board board) {
        boardService.save(board);
        return new RedirectView("/exam01/board");
    }

}
