package org.example.loginquiz.controller.auth;

import lombok.extern.slf4j.Slf4j;
import org.example.loginquiz.model.entity.auth.Fellow;
import org.example.loginquiz.service.auth.FellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

/**
 * packageName : org.example.loginquiz.controller.auth
 * fileName : FellowController
 * author : GGG
 * date : 2024-03-28
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-28         GGG          최초 생성
 */
@Slf4j
@Controller
@RequestMapping("/auth")
public class FellowController {

    @Autowired
    FellowService fellowService; // DB CRUD DI

    @Autowired
    PasswordEncoder passwordEncoder; // 암호화 DI

    //    로그인 함수 :
//    복습 :  @GetMapping("url") : 웹브라우저 주소창
    @GetMapping("/customLogin")
    public String login() {
//      TODO: 주의 : spring security(보안) 절대주소 안됨
//              예) /auth/customLogin.jsp (x) :절대주소
//                   auth/customLogin.jsp (o) :상대주소
        return "auth/customLogin.jsp"; // jsp 파일의 위치
    }

    //    저장 : 1) 저장(회원가입) 페이지 열기 함수
    @GetMapping("/register")
    public String addFellow() {
        return "auth/register.jsp";
    }

    //          2) 저장버튼 클릭시 실행될 함수
//    insert -> post 방식 -> @PostMapping
    @PostMapping("/regist")
    public RedirectView createFellow(
            @ModelAttribute Fellow fellow
    ) {
//        TODO: 1) 전달된 매개변수 객체가(fellow) DB 있는지 조사
//             => 있으면 insert 할 필요없음 : 에러페이지로 강제이동
//             => 없으면 insert 함
        if(fellowService.existsById(fellow.getUserId())==true) {
            return new RedirectView("/auth/error");
        }

//        TODO: 2) 위의 에러가 통과되면 새로운 회원(Fellow) 생성해서 저장(save)
//          => 필수) 패스워드 : 암호화
        Fellow newFellow = new Fellow(
                fellow.getUserId(),
                passwordEncoder.encode(fellow.getPassword()), // 필수 암호화
                fellow.getName(),
                fellow.getCodeName()
        );
//        DB 저장 : save
        fellowService.save(newFellow);
        return new RedirectView("/auth/customLogin");
    }

    //    error 페이지 열기 함수
    @GetMapping("/error")
    public String error() {
        return "common/error.jsp";
    }
}
