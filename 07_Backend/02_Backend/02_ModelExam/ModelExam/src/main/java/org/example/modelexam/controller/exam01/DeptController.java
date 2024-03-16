package org.example.modelexam.controller.exam01;

import lombok.extern.slf4j.Slf4j;
import org.example.modelexam.model.Dept;
import org.example.modelexam.service.exam01.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

/**
 * packageName : org.example.modelexam.controller.exam01
 * fileName : DeptController
 * author : GGG
 * date : 2024-03-13
 * description : 부서 컨트롤러 : 전체 조회
 * 요약 :
 *     TODO:
 *      @Controller
 *      @RequestMapping("/공통url")
 *      spring 코딩 : 1) service 함수 정의
 *                   2) controller 에서 service 함수 호출
 *                      결과를 jsp 전송
 *      1) 간단 디버깅(로깅) : 변수값 추적 : 성능 느림
 *         System.out.println("[디버깅] : " + list);
 *       2) 실무 : 전용 로깅툴 : logback 툴 : 성능 빠름
 *          설치 : log4jdbc.log4j2.properties, logback-spring.xml
 *              resource 폴더에 붙여넣기 : 기본설치
 *          logback-spring.xml : logback 설정 파일
 *              => 1) 체크 : 주석 Logger 1줄 패키지명 확인 : org.example.modelexam
 *         사용법 : 1) @Slf4g : 클래스위에 붙임
 *                 2) log.debug("변수명 : " + 변수값);
 *                 =>(참고) (정보많이 출력)trace > debug > info (정보 작게 출력)
 *                 => 예) log.trace(), log.debug(), log.info() 등
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-13         GGG          최초 생성
 */
@Slf4j
@Controller
@RequestMapping("/exam01")
public class DeptController {

    @Autowired
    DeptService deptService; // 객체 정의

    /**
     * 전체 조회
     * http://localhost:8000/공통url/함수url
     * url : http://localhost:8000/exam01/dept
     * @return exam01/dept/dept_all.jsp
     */
    @GetMapping("/dept")
    public String getDeptAll(Model model) {

//        TODO: Service 객체의 전체조회 함수를(findAll) 호출
        List<Dept> list = deptService.findAll();
//        TODO: model 에 담아 jsp 전달
        model.addAttribute("list", list);

//      1) 간단 디버깅(로깅) : 변수값 추적 : 성능 느림
//        System.out.println("[디버깅] : " + list);
//      2) 실무 : 전용 로깅툴 : logback 툴 : 성능 빠름
//        사용법 : 1) @Slf4g : 클래스위에 붙임
//                2) log.debug("변수명 : " + 변수값);
        log.debug("list : " + list);

        return "exam01/dept/dept_all.jsp";
    }

//  상세조회 : 기본키(매개변수:부서번호(dno))를 웹브라우저 주소창에 입력해서 전달받기
//  url 테스트 : http://localhost:8000/exam01/dept/10
//  jsp : exam01/dept/dept_id.jsp
//  url : /dept/{dno}
    @GetMapping("/dept/{dno}")
    public String getDeptId(@PathVariable long dno,
                            Model model){
//      TODO: service 의 상세조회 함수(findById) 호출
        Dept dept = deptService.findById(dno);
//      TODO: jsp 로 dept(부서) 객체 전송
        model.addAttribute("dept", dept);
        return "exam01/dept/dept_id.jsp";
    }

//  TODO: 부서 추가 페이지 열기 함수 #1
//    jsp : exam01/dept/add_dept.jsp
//    url : /dept/addition
    @GetMapping("/dept/addition")
    public String addDept() {
        return "exam01/dept/add_dept.jsp";
    }

//  TODO: 저장 버튼 클릭시 실행될 함수 #2
//    jsp : /exam01/dept  (강제 페이지 이동:전체조회)
//    url : /dept/add
//    html : form 방식 : (insert -> post 방식)
//    어노테이션 : insert -> @PostMapping("/url")
    @PostMapping("/dept/add")
    public RedirectView createDept(
            @ModelAttribute Dept dept
    ) {
//        TODO: DB 저장 함수 실행
        deptService.save(dept);

//      TODO: 전체 조회 페이지로 강제 이동
//       RedirectView : 이 클래스가 강제 페이지 이동시켜주는 것
//        사용법 : new RedirectView("/공통url/함수url")
        return new RedirectView("/exam01/dept");
    }

//    TODO: 수정 페이지 열기 함수
//      => 수정 페이지가 열릴때 상세 조회한 결과를 수정함
//     url : /dept/edition/{dno}
//     jsp : exam01/dept/update_dept.jsp
    @GetMapping("/dept/edition/{dno}")
    public String editDept(@PathVariable long dno,
                           Model model) {
//      TODO: 1) 먼저 상세조회를(1건) 함
        Dept dept = deptService.findById(dno);
//      TODO: 2) 부서 객체를 jsp 로 전송
        model.addAttribute("dept", dept);
        return "exam01/dept/update_dept.jsp";
    }

//    TODO: 수정 버튼 클릭시 실행될 함수
//     => 수정후 전체조회 페이지로 강제이동 :
//     => 사용법) new RedirectView("/이동할url")
//     => 클래스 == 자료형
//     => update => put 방식 => @PutMapping("/url")
//     => sql update ~ where 부서번호 = 20
//     => url : /dept/edit/{dno}
    @PutMapping("/dept/edit/{dno}")
    public RedirectView updateDept(@PathVariable long dno,
                                   @ModelAttribute Dept dept
                                   ) {
//        TODO: 수정 함수(서비스) 호출
//         => save : if (insert) else (update) : dno == null
        deptService.save(dept);
//        TODO: 전체조회 페이지로 강제이동 : /exam01/dept
        return new RedirectView("/exam01/dept");
    }

//  TODO: sql delete -> delete 방식 -> @DeleteMapping
//     => sql delete ~ where 조건식 (dno = 10)
//     => url : /dept/delete/{dno}
//     => 삭제 후 전체조회 페이지로 강제 이동
    @DeleteMapping("/dept/delete/{dno}")
    public RedirectView deleteDept(@PathVariable int dno) {
//        TODO: db 삭제 함수 실행(서비스)
        deptService.removeById(dno);
//        TODO: 삭제 후 전체조회 페이지로 강제 이동
        return new RedirectView("/exam01/dept");
    }
}
