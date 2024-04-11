package org.example.simpledms.model.entity.shop.simpleproduct;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * packageName : org.example.simpledms.model.entity.shop.simpleproduct
 * fileName : SimpleOrderDetail
 * author : kimtaewan
 * date : 2024-04-11
 * description : 주문상세 엔티티(자식)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-11         kimtaewan          최초 생성
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
public class SimpleOrderDetail {
//    속성
    @Id
    private Integer sono;           // 주문번호(PK), FK
    @Id
    private Integer spno;           // 상품번호(PK2), FK

    private Integer productCount;   // 상품수량
}
