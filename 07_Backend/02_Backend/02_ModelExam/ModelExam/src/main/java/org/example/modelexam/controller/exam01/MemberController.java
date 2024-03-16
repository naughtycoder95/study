package org.example.modelexam.controller.exam01;

import org.example.modelexam.model.Member;
import org.example.modelexam.service.exam01.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

/**
 * packageName : org.example.modelexam.controller.exam01
 * fileName : MemberController
 * author : GGG
 * date : 2024-03-13
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-13         GGG          최초 생성
 */
@Controller
@RequestMapping("/exam01")
public class MemberController {

//    TODO: service 객체 가져오기
    @Autowired
    MemberService memberService;

    /**
     * 전체 조회
     * @param model
     * @return
     */
    @GetMapping("/member")
    public String getMemberAll(Model model) {

//      TODO: 서비스 전체조회 함수 호출
        List<Member> list = memberService.findAll();
//      TODO: jsp 전송(배열)
        model.addAttribute("list", list);

        return "exam01/member/member_all.jsp";
    }

//    url test : http://localhost:8000/exam01/member/7369
    @GetMapping("/member/{eno}")
    public String getMemberId(@PathVariable long eno,
                              Model model
                              ) {
//      TODO: Service 상세조회 함수(findById) 호출
        Member member = memberService.findById(eno);
//      TODO: member 객체 jsp 로 전달
        model.addAttribute("member", member);

        return "exam01/member/member_id.jsp";
    }

//    TODO: 새로운 멤버 추가 페이지 열기 함수
    @GetMapping("/member/addition")
    public String addMember() {
        return "exam01/member/add_member.jsp";
    }

//   TODO: 저장 버튼 클릭시 실행될 함수
//    createMember()
//    - url : /member/add
//    - redirect url : /exam01/member
//    insert (추가) - @PostMapping
//    Member 객체 : eno(정수), ename(문자열), job(문자열), manager(정수)
    @PostMapping("/member/add")
    public RedirectView createMember(
        @ModelAttribute Member member
    ) {
//        TODO: DB 저장 서비스 함수
        memberService.save(member);

//        TODO: 전체 조회 페이지 강제 이동
        return new RedirectView("/exam01/member");
    }

    //    TODO: 수정 페이지 열기 함수
//    => 상세조회 1번 해서 화면에 출력해야함 => 그 정보를 수정할 수 있음
    @GetMapping("/member/edition/{eno}")
    public String editMember(@PathVariable long eno,
                             Model model
                             ) {
//        TODO: 1) 사원번호로(eno) 상세조회
        Member member = memberService.findById(eno);
//        TODO: 2) 사원 객체 를 jsp 로 전달
        model.addAttribute("member", member);

        return "exam01/member/update_member.jsp";
    }

//    TODO: 수정 버튼 클릭시 실행될 함수
//      => 전체 조회페이지로 강제이동
//      update -> put 방식 -> @PutMapping
//      update ~ where 조건식 : /member/edit/{eno}
    @PutMapping("/member/edit/{eno}")
    public RedirectView updateMember(@PathVariable int eno,
                                   @ModelAttribute Member member
                                   ) {
//        TODO: DB 수정(서비스함수) 실행
        memberService.save(member);
//        TODO: 전체조회 페이지 강제이동(redirect)
        return new RedirectView("/exam01/member");
    }

//  todo: 연습 6)
//    MemberService 클래스를 만들고 removeById() 함수를 정의한다.
//    MemberController 클래스를 만들어서 deleteMember() 함수를 정의
//    update_member.jsp 삭제버튼과 url 를 추가한다.
//    - url : /member/delete/{eno}
//    - redirect url : /exam01/member
//     sql delete -> delete 방식 -> @DeleteMapping
//    클래스 == 자료형
    @DeleteMapping("/member/delete/{eno}")
    public RedirectView deleteMember(@PathVariable int eno) {
//        TODO: 사원번호로 삭제 서비스 함수(removeById) 실행
        memberService.removeById(eno);
//        TODO: 전체 조회 페이지로 강제 이동 : /exam01/member
        return new RedirectView("/exam01/member");
    }

}
