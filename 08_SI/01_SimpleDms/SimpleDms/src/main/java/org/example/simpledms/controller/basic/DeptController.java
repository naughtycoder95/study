package org.example.simpledms.controller.basic;

import lombok.extern.slf4j.Slf4j;
import org.example.simpledms.model.entity.basic.Dept;
import org.example.simpledms.service.basic.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName : org.example.simpledms.controller.basic
 * fileName : DeptController
 * author : GGG
 * date : 2024-04-02
 * description : 부서 컨트롤러
 * 요약 :
 *      TODO:
 *          1) @RestController : Vue(React, Angular 등) 사용하는 컨트롤러
 *              특징 : return 값이 JSON 데이터임(JSON 데이터를 전송 -> 프론트로)
 *              (vs @Controller : return 값 jsp 파일 위치 )
 *          2) Rest 용어 : (과거) GET(R) / POST(CUD) vs
 *              => 미래 : GET(R) / POST(C) / PUT(U) / DELETE(D)
 *              => 위의 규칙대로 작성된 프로그램(==애플리케이션)
 *              => Restful Application
 *          3) Rest API(함수) 용어 : (관례) @RestController 로 제작된 벡엔드
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-02         GGG          최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/api/basic")
public class DeptController {
    @Autowired
    DeptService deptService; // DI

    //    TODO: 전체 조회 함수 + 검색 + 페이징
    @GetMapping("/dept")
    public ResponseEntity<Object> findAll(
            @RequestParam(defaultValue = "") String dname,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {
        try{
//            매개변수(page, size) 페이징 변수에 저장
//              page : 현재페이지번호, size : 1페이지당개수
            Pageable pageable = PageRequest.of(page, size);

//            전체 조회 서비스 함수 실행
            Page<Dept> pageList = deptService.findAllByDnameContaining(dname, pageable);

//            vue 로 json 데이터를 전송 : jsp(model : Map(키, 값))
            Map<String, Object> response = new HashMap<>();
            response.put("dept", pageList.getContent());                // 부서배열
            response.put("currentPage", pageList.getNumber());          // 현재페이지 번호(x)
            response.put("totalItems", pageList.getTotalElements());    // 전체데이터 개수
            response.put("totalPages", pageList.getTotalPages());       // 전체페이지수(x)

//            TODO: 1) pageList 값이 없으면 : DB 테이블 없음 => NO_CONTENT(203)
//                  2) pageList 값이 있으면 : 성공 => OK(200)
            if (pageList.isEmpty() == true) {
//                  1) pageList 값이 없으면 : DB 테이블 없음 => NO_CONTENT(203)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
//                  2) pageList 값이 있으면 : 성공 => OK(200)
                return new ResponseEntity<>(response, HttpStatus.OK);

            }
        } catch (Exception e) {
//            TODO: INTERNAL_SERVER_ERROR(500) : 벡엔드 서버 에러
//               아래 코드는 프론트로(웹브라우저) 신호를(500) 보냄
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
