package org.example.loginquiz.controller.auth;

import lombok.extern.slf4j.Slf4j;
import org.example.loginquiz.service.auth.FellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
