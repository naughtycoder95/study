package org.example.simpledms.repository.shop.simpleproduct;

import org.example.simpledms.model.entity.shop.simpleproduct.SimpleCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName : org.example.simpledms.repository.shop.simpleproduct
 * fileName : SimpleCartRepository
 * author : GGG
 * date : 2024-04-09
 * description : 장바구니 레포지토리
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-09         GGG          최초 생성
 */
@Repository
public interface SimpleCartRepository extends JpaRepository<SimpleCart, Integer> {
}
