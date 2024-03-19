package org.example.jpaexam.controller.basic;

import lombok.extern.slf4j.Slf4j;
import org.example.jpaexam.model.entity.basic.Dept;
import org.example.jpaexam.service.basic.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    //    전체 조회 + like 검색 + 페이징 처리
//    복습 : 매개변수 전달 방식 : 1) 쿼리스트링   : @RequestParam
//                             2) 파라메터방식 : @PathVariable
    @GetMapping("/dept")
    public String getDeptAll(
            @RequestParam(defaultValue = "") String dname,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size,
            Model model) {
//        TODO: 페이징 처리 객체에 값 저장 : Pageable
//            1) 현재페이지번호  : page
//            2) 1페이지 당 개수 : size
        Pageable pageable = PageRequest.of(page, size);
//        TODO: DB like 검색 서비스 함수 실행
        Page<Dept> pageRes
                = deptService
                .findAllByDnameContaining(dname, pageable);
//        결과를 jsp 전송
        model.addAttribute("pageRes",pageRes);
        return "basic/dept/dept_all.jsp";
    }
}
