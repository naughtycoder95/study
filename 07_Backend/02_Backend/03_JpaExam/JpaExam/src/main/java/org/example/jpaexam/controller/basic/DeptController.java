package org.example.jpaexam.controller.basic;

import lombok.extern.slf4j.Slf4j;
import org.example.jpaexam.model.entity.basic.Dept;
import org.example.jpaexam.service.basic.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * packageName : org.example.jpaexam.controller.basic
 * fileName : DeptController
 * author : GGG
 * date : 2024-03-19
 * description : 부서 컨트롤러
 * 요약 :
 *      컨트롤러 : 함수에 url 달수 있고, return 값은 jsp 보낼수 있음
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-19         GGG          최초 생성
 */
@Slf4j
@Controller
@RequestMapping("/basic")
public class DeptController {

//    서비스 클래스 가져오기
    @Autowired
    DeptService deptService;

//    전체 조회
    @GetMapping("/dept")
    public String getDeptAll(Model model) {
//        DB 전체 조회 서비스 함수 실행
        List<Dept> list = deptService.findAll();
//        결과를 jsp 전송
        model.addAttribute("list",list);
        return "basic/dept/dept_all.jsp";
    }
}
