package org.example.controllerexam.controller.exam00;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName : org.example.controllerexam.controller.exam00
 * fileName : HelloWorldController
 * author : GGG
 * date : 2024-03-11
 * description :  Hello World 컨트롤러
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-11         GGG          최초 생성
 */
@Controller
public class HelloWorldController {

    @GetMapping("/exam00/hello")
    public String Hello(Model model) {
        return "/exam00/hello.jsp";
    }

//  TODO: 연습) url : "/exam00/hello2"
//          => 함수명 : public String Hello2
//          => jsp : "/exam00/example01.jsp"
//          => 결과 출력 : Hello JSP & Spring boot
//         함수를 만들어 주세요
    @GetMapping("/exam00/hello2")
    public String Hello2(Model model) {
        return "/exam00/example01.jsp";
    }
}
