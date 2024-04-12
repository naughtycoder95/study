package org.example.simpledms.service.shop.kafka.simpleproduct;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * packageName : org.example.simpledms.service.shop.kafka.simpleproduct
 * fileName : SimpleApprovalProducer
 * author : GGG
 * date : 2024-04-12
 * description : 카프카 결재 생산자(송신자)
 * 요약 :
 *      생산자 : 메세지를 만드는 사람
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-12         GGG          최초 생성
 */
@Slf4j
@Service
public class SimpleApprovalProducer {

//    메세지 주제(제목):토픽(topic)
    private static final String TOPIC = "simple-approval";

//    TODO: 카프카에 메세지 보내는 클래스 정의
    @Autowired
    private KafkaTemplate<String, String > kafkaTemplate; // DI

//    TODO: 메세지 전송 함수 정의
//      => 카프카로 메세지 전송됨
    public void sendMessage(String message) {
//        로깅
        log.debug("SimpleApprovalProducer(결재 생산자) : " + message);
        this.kafkaTemplate.send(TOPIC, message); // 카프카로 매개변수값 보내기
    }
}
