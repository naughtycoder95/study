package org.example.simpledms.controller.shop.simpleproduct;

import lombok.extern.slf4j.Slf4j;
import oracle.ucp.proxy.annotation.Post;
import org.example.simpledms.model.dto.shop.simpleproduct.SimpleOrderDto;
import org.example.simpledms.model.entity.shop.simpleproduct.SimpleCart;
import org.example.simpledms.model.entity.shop.simpleproduct.SimpleOrder;
import org.example.simpledms.model.entity.shop.simpleproduct.SimpleProduct;
import org.example.simpledms.service.shop.simpleproduct.SimpleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * packageName : org.example.simpledms.controller.shop.simpleproduct
 * fileName : SimpleOrderController
 * author : GGG
 * date : 2024-04-11
 * description : 주문 컨트롤러
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-11         GGG          최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/api/shop")
public class SimpleOrderController {

    @Autowired
    SimpleOrderService simpleOrderService; // DI

    //    TODO: 주문 저장 함수
    @PostMapping("/simple-order")
//    저장(insert) -> post 방식 -> @PostMapping
    public ResponseEntity<Object> create(
            @RequestBody SimpleOrderDto simpleOrderDto
    ) {
        try {
//            저장 서비스 실행
            SimpleOrder simpleOrder = simpleOrderService.insert(simpleOrderDto);

            return new ResponseEntity<>(simpleOrder, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //    TODO: 주문 상세 조회
//    조회(select) -> get 방식 -> @GetMapping
    @GetMapping("/simple-order/{sono}")
    public ResponseEntity<Object> findById(
            @PathVariable int sono
    ) {
        try {
//            상세조회 서비스 실행
            Optional<SimpleOrder> optionalSimpleOrder
                    = simpleOrderService.findById(sono);

            if (optionalSimpleOrder.isEmpty() == true) {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
//                조회 성공
                return new ResponseEntity<>(optionalSimpleOrder.get(), HttpStatus.OK);

            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
