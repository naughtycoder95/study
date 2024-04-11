package org.example.simpledms.service.shop.simpleproduct;

import jakarta.transaction.Transactional;
import org.example.simpledms.model.dto.shop.simpleproduct.SimpleOrderDto;
import org.example.simpledms.model.entity.shop.simpleproduct.SimpleOrder;
import org.example.simpledms.model.entity.shop.simpleproduct.SimpleOrderDetail;
import org.example.simpledms.repository.shop.simpleproduct.SimpleOrderDetailRepository;
import org.example.simpledms.repository.shop.simpleproduct.SimpleOrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * packageName : org.example.simpledms.service.shop.simpleproduct
 * fileName : SimpleOrderServie
 * author : GGG
 * date : 2024-04-11
 * description : 주문 서비스
 * 요약 :
 *          TODO:
 * //          DB 트랜잭션(transaction, 거래) :
 * //              1) CUD 작업에 대해 여러개가 있을경우 중간에 에러가 발생하면 모두 롤백함
 * //              2) 위의 있는 기능을 사용하려면 : @Transactional 함수위에 붙임
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-11         GGG          최초 생성
 */
@Service
public class SimpleOrderService {

    @Autowired
    SimpleOrderRepository simpleOrderRepository; // DI
    @Autowired
    SimpleOrderDetailRepository simpleOrderDetailRepository; // DI

    //    DTO 변환 패키지
    ModelMapper modelMapper = new ModelMapper();

    //    TODO: 저장함수 : 주문 테이블 insert + 주문상세(배열) insert(반복문)
//      => 주문 객체 DTO 정의 : (주문상세 객체배열(List), 주문상태 등)
    @Transactional
    public SimpleOrder insert(SimpleOrderDto simpleOrderDto) {
//        1) insert 할때는 DTO -> Entity 변환해서 insert
//        => DTO -> Entity : 1) 직접 변환로직 코딩 : 숙련자에게 추천
//                           2) 자동 변환 패키지 : 초보자 추천
//                             (ModelMapper 패키지 => 단점 : 성능저하)
//        TODO: 1) DTO -> Entity 변환
//          사용법 : modelMapper.map(DTO클래스, 엔티티명.class);
        SimpleOrder simpleOrder
                = modelMapper.map(simpleOrderDto, SimpleOrder.class);

//        TODO: 2) 부모테이블 저장 (부모저장 -> 자식저장)
        SimpleOrder simpleOrder2
                = simpleOrderRepository.save(simpleOrder); // 부모 테이블 저장

//        TODO: 3) 자식테이블도 저장 : 주문상세 테이블 (반복문)
//          DB 트랜잭션(transaction, 거래) :
//              1) CUD 작업에 대해 여러개가 있을경우 중간에 에러가 발생하면 모두 롤백함
//              2) 위의 있는 기능을 사용하려면 : @Transactional 함수위에 붙임
        for (int i = 0; i < simpleOrderDto.getSimpleOrderDetailList().size(); i++) {
//            자식테이블(SimpleOrderDetail) insert : 기본키(부모쪽 insert 할때 시퀀스로 생성되어 있음)
//            생성된 주문번호 -> 주문상세객체에 저장
            SimpleOrderDetail tmpSimpleOrderDetail = simpleOrderDto.getSimpleOrderDetailList().get(i);
            tmpSimpleOrderDetail.setSono(simpleOrder2.getSono());
//            DB 저장
            simpleOrderDetailRepository.save(tmpSimpleOrderDetail);
        }
        return simpleOrder2;  // 저장된 주문 객체
    }
}
