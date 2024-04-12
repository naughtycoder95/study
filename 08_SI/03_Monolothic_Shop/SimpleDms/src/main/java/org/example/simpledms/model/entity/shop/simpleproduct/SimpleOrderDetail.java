package org.example.simpledms.model.entity.shop.simpleproduct;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;
import org.example.simpledms.model.common.SonoSpnoPk;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * packageName : org.example.simpledms.model.entity.shop.simpleproduct
 * fileName : SimpleOrderDetail
 * author : GGG
 * date : 2024-04-11
 * description : 주문상세 엔티티(자식)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-11         GGG          최초 생성
 */
@Entity
@Table(name = "TB_SIMPLE_ORDER_DETAIL")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
// 복합키 사용클래스 정의
@IdClass(SonoSpnoPk.class)
public class SimpleOrderDetail {
    @Id
    private Integer sono;         // 주문번호(PK:복합키), FK
    @Id
    private Integer spno;         // 상품번호(pk2:복합키), fk

    private Integer productCount; // 상품수량
}
