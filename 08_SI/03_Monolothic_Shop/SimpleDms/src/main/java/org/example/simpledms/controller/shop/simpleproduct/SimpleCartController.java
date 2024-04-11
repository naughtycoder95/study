package org.example.simpledms.controller.shop.simpleproduct;

import lombok.extern.slf4j.Slf4j;
import org.example.simpledms.model.dto.shop.simpleproduct.ISimpleCartDto;
import org.example.simpledms.model.entity.shop.simpleproduct.SimpleCart;
import org.example.simpledms.model.entity.shop.simpleproduct.SimpleProduct;
import org.example.simpledms.service.shop.simpleproduct.SimpleCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName : org.example.simpledms.controller.shop.simpleproduct
 * fileName : SimpleCartController
 * author : GGG
 * date : 2024-04-09
 * description : 장바구니 컨트롤러
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-09         GGG          최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/api/shop")
public class SimpleCartController {
    @Autowired
    SimpleCartService simpleCartService; // DI

    //    TODO: 저장함수
//    저장(insert) -> post 방식 -> @PostMapping
    @PostMapping("/simple-cart")
    public ResponseEntity<Object> create(
            @RequestBody SimpleCart simpleCart
    ) {
        try {
//            저장 서비스 실행
            SimpleCart simpleCart2 = simpleCartService.save(simpleCart);

            return new ResponseEntity<>(simpleCart2, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //    TODO: 전체조회 함수(조인) + like 검색
//    조회(select) -> get 방식 -> @GetMapping
    @GetMapping("/simple-cart")
    public ResponseEntity<Object> findAll(
            @RequestParam(defaultValue = "") String title,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {
        try {
//            페이징 객체 생성
            Pageable pageable = PageRequest.of(page, size);

//            전체 조회 서비스 실행
            Page<ISimpleCartDto> simpleCartDtoPage
                    = simpleCartService
                    .selectByTitleContaining(title, pageable);

//            공통 페이징 객체 생성 : 자료구조 맵 사용
            Map<String , Object> response = new HashMap<>();
            response.put("simpleCart", simpleCartDtoPage.getContent());       // simpleCart 배열
            response.put("currentPage", simpleCartDtoPage.getNumber());       // 현재페이지번호
            response.put("totalItems", simpleCartDtoPage.getTotalElements()); // 총건수(개수)
            response.put("totalPages", simpleCartDtoPage.getTotalPages());    // 총페이지수

            if(simpleCartDtoPage.isEmpty() == false) {
//                조회 성공
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //    TODO: 삭제 함수
    @DeleteMapping("/simple-cart/deletion/{scno}")
    public ResponseEntity<Object> delete(
            @PathVariable int scno
    ) {
        try {
//            DB 삭제 서비스 함수 실행
            boolean success = simpleCartService.removeById(scno);

            if(success == true) {
//                삭제 성공
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
//                삭제 실패: 삭제할 데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
