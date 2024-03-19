package org.example.jpaexam.controller.basic;

import lombok.extern.slf4j.Slf4j;
import org.example.jpaexam.model.entity.basic.Emp;
import org.example.jpaexam.service.basic.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * packageName : org.example.jpaexam.controller.basic
 * fileName : EmpController
 * author : kimtaewan
 * date : 2024-03-19
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-19         kimtaewan          최초 생성
 */
@Slf4j
@Controller
@RequestMapping("/basic")
public class EmpController {
    @Autowired
    EmpService empService;
    @GetMapping("/emp")
    public String getEmpAll(
            @RequestParam(defaultValue = "") int eno,
            @RequestParam(defaultValue = "") String ename,
            @RequestParam(defaultValue = "") String job,
            @RequestParam(defaultValue = "") int manager,
            Model model) {
        model.addAttribute("eno", eno);
        model.addAttribute("ename", ename);
        model.addAttribute("job", job);
        model.addAttribute("manager", manager);
        return "basic/emp/emp_all.jsp";
    }
}
