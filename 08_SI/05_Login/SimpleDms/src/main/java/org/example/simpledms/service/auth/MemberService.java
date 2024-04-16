package org.example.simpledms.service.auth;

import org.example.simpledms.model.entity.auth.Member;
import org.example.simpledms.repository.auth.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * packageName : org.example.simpledms.service.auth
 * fileName : MemberService
 * author : GGG
 * date : 2024-04-15
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-15         GGG          최초 생성
 */
@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository; // DI

    //    1) 회원 있는지 확인 함수 : 회원가입
    public boolean existsById(String email) {
        boolean result = memberRepository.existsById(email);

        return result;
    }

    //    2) 저장 : 회원가입
    public Member save(Member member) {
        Member member2 = memberRepository.save(member);

        return member2;
    }
}
