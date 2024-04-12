package org.example.simpledms.controller.shop.simpleproduct;

import lombok.extern.slf4j.Slf4j;
import org.example.simpledms.model.entity.shop.simpleproduct.SimpleProduct;
import org.example.simpledms.service.shop.simpleproduct.SimpleProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * packageName : org.example.simpledms.controller.shop.simpleproduct
 * fileName : SimpleProductController
 * author : GGG
 * date : 2024-04-09
 * description : 상품 컨트롤러
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
public class SimpleProductController {

    @Autowired
    SimpleProductService simpleProductService; // DI

//    TODO: 전체조회 함수
//    조회(select) -> get 방식 -> @GetMapping
    @GetMapping("/simple-product")
    public ResponseEntity<Object> findAll(
            @RequestParam(defaultValue = "") String title,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {
        try {
//            페이징 객체 생성
            Pageable pageable = PageRequest.of(page, size);

//            전체 조회 서비스 실행
            Page<SimpleProduct> simpleProductPage
                    = simpleProductService
                    .findAllByTitleContaining(title, pageable);

//            공통 페이징 객체 생성 : 자료구조 맵 사용
            Map<String , Object> response = new HashMap<>();
            response.put("simpleProduct", simpleProductPage.getContent());    // simpleProduct 배열
            response.put("currentPage", simpleProductPage.getNumber());       // 현재페이지번호
            response.put("totalItems", simpleProductPage.getTotalElements()); // 총건수(개수)
            response.put("totalPages", simpleProductPage.getTotalPages());    // 총페이지수

            if(simpleProductPage.isEmpty() == false) {
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

//    TODO: 상세조회 함수
//    조회(select) -> get 방식 -> @GetMapping
    @GetMapping("/simple-product/{spno}")
    public ResponseEntity<Object> findById(
            @PathVariable int spno
    ) {
        try {
//            상세조회 서비스 실행
            Optional<SimpleProduct> optionalSimpleProduct
                    = simpleProductService.findById(spno);

            if(optionalSimpleProduct.isEmpty() == true) {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
//                조회 성공
                return new ResponseEntity<>(optionalSimpleProduct.get(), HttpStatus.OK);

            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}








