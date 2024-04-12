package org.example.simpledms.repository.shop.simpleproduct;

import org.example.simpledms.model.common.SonoSpnoPk;
import org.example.simpledms.model.entity.shop.simpleproduct.SimpleOrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName : org.example.simpledms.repository.shop.simpleproduct
 * fileName : SimpleOrderDetailRepository
 * author : GGG
 * date : 2024-04-11
 * description : 주문상세 레포지토리
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-11         GGG          최초 생성
 */
@Repository
public interface SimpleOrderDetailRepository extends JpaRepository<SimpleOrderDetail, SonoSpnoPk> {
}
