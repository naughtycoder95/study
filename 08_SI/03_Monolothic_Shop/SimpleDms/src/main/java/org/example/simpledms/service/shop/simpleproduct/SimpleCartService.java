package org.example.simpledms.service.shop.simpleproduct;

import org.example.simpledms.model.dto.shop.simpleproduct.ISimpleCartDto;
import org.example.simpledms.model.entity.shop.simpleproduct.SimpleCart;
import org.example.simpledms.model.entity.shop.simpleproduct.SimpleProduct;
import org.example.simpledms.repository.shop.simpleproduct.SimpleCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * packageName : org.example.simpledms.service.shop.simpleproduct
 * fileName : SimpleCartService
 * author : GGG
 * date : 2024-04-09
 * description : 장바구니 서비스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-09         GGG          최초 생성
 */
@Service
public class SimpleCartService {

    @Autowired
    SimpleCartRepository simpleCartRepository; // DI

    //    TODO: 저장(수정)함수
    public SimpleCart save(SimpleCart simpleCart) {
//        DB 저장 함수 실행
        SimpleCart simpleCart2 = simpleCartRepository.save(simpleCart);
        return simpleCart2;
    }

    //    TODO: 전체 조회 함수
    public Page<ISimpleCartDto> selectByTitleContaining(
            String title,
            Pageable pageable
    ) {
        Page<ISimpleCartDto> page
                = simpleCartRepository.selectByTitleContaining(
                title,
                pageable
        );
        return page;
    }

//    TODO: 삭제 함수
    public boolean removeById(int scno) {
        if(simpleCartRepository.existsById(scno)) {
            simpleCartRepository.deleteById(scno); // DB 삭제
            return true;
        } else {
            return false;
        }
    }
}
