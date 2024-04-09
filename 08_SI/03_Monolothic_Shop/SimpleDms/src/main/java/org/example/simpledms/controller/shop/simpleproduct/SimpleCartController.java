package org.example.simpledms.controller.shop.simpleproduct;

import lombok.extern.slf4j.Slf4j;
import org.example.simpledms.model.entity.shop.simpleproduct.SimpleCart;
import org.example.simpledms.service.shop.simpleproduct.SimpleCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
