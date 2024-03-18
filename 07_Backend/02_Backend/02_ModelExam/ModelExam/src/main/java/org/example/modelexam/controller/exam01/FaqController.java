package org.example.modelexam.controller.exam01;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.example.modelexam.model.Dept;
import org.example.modelexam.model.Faq;
import org.example.modelexam.service.exam01.DeptService;
import org.example.modelexam.service.exam01.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * packageName : org.example.modelexam.controller.exam01
 * fileName : FaqController
 * author : GGG
 * date : 2024-03-18
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-18         GGG          최초 생성
 */
@Slf4j
@Controller
@RequestMapping("/exam01")
public class FaqController {
    @Autowired
    FaqService faqService; // 객체 정의(전체조회함수)

    //    전체 조회 함수
    @GetMapping("/faq")
    public String getFaqAll(Model model) {

        List<Faq> list = faqService.findAll();
        model.addAttribute("list", list);

        log.debug("list : " + list);

        return "exam01/faq/faq_all.jsp";
    }
}
