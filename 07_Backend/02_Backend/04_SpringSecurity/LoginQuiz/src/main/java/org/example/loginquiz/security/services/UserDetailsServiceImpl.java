package org.example.loginquiz.security.services;

import org.example.loginquiz.model.entity.auth.Fellow;
import org.example.loginquiz.repository.auth.FellowRepository;
import org.example.loginquiz.security.dto.FellowDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName : org.example.loginquiz.security.services
 * fileName : UserDetailsServiceImpl
 * author : GGG
 * date : 2024-03-28
 * description : TODO: DB 에 현재 프론트에서 접근한 사용자가 있는지 확인하는 클래스
 * 요약 :
 *      TODO:
 *          1) 스프링시큐리티에서 제공한 함수명으로 작성 : 인터페이스 상속(함수 재정의)
 *             (UserDetailsService 상속)
 *            -> DB 에 있는지 확인(코딩)
 *            -> 확인되면 권한도 생성해서 검증이 완료된 객체로 리턴(FellowDto)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-28         GGG          최초 생성
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService  {

    @Autowired
    FellowRepository fellowRepository; // DB CRUD DI

    // 스프링 시큐리티에서 제공한 함수 재정의 : alt + insert
    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {

        // TODO: 1) DB 에 사용자 있는지 확인 : 상세조회
        //  화살표함수(js) , (자바:람다식) : 목적(가독성 증진)
        //  js   : 화살표 함수 : (x) => x+1; // function mysum(x){return x+1;}
        //  java : 람다식      : (x) -> x+1; // interface MySum{mysum(x);}
        Fellow fellow = fellowRepository.findById(userId)
                .orElseThrow(() -> new UsernameNotFoundException("유저 없음 : " + userId));

//        TODO: 2) 권한을 생성해서 정보를 넣어 FellowDto 객체를 리턴
//           권한 : ROLE_ADMIN(관리자), ROLE_USER(사용자) => ROLE_xxx 추가해도 됨
        GrantedAuthority authority
                = new SimpleGrantedAuthority(fellow.getCodeName());

//         권한 배열 : 스프링시큐리티 고정 : Set 배열(집합 배열)
        Set<GrantedAuthority> authoritis = new HashSet<>();
        authoritis.add(authority);  // 위에서 만든 권한 추가

//      TODO: 1) 클래스에 정보를 넣는다 == 클래스의 속성(필드)에 값을 넣는다
//            2) 정보를 넣어주는 방법 : (1) 생성자, (2) Setter
        return new FellowDto(fellow.getUserId(),
                            fellow.getPassword(),
                            authoritis
                );
    }
}
