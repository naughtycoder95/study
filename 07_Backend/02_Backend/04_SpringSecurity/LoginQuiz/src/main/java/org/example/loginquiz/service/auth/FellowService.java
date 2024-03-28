package org.example.loginquiz.service.auth;

import org.example.loginquiz.model.entity.auth.Fellow;
import org.example.loginquiz.repository.auth.FellowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * packageName : org.example.loginquiz.service.auth
 * fileName : FellowService
 * author : GGG
 * date : 2024-03-27
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-27         GGG          최초 생성
 */
@Service
public class FellowService {

    @Autowired
    FellowRepository fellowRepository; // DI

    //    상세조회 함수
    public Optional<Fellow> findById(String userId) {
        Optional<Fellow> optionalFellow
                = fellowRepository.findById(userId);
        return optionalFellow;
    }

//    기본키로 조회 함수
    public boolean existsById(String userId) {
        boolean result = fellowRepository.existsById(userId);
        return result;
    }
}
