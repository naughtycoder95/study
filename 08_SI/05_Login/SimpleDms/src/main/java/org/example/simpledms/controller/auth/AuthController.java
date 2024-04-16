package org.example.simpledms.controller.auth;

import lombok.extern.slf4j.Slf4j;
import oracle.ucp.proxy.annotation.Post;
import org.example.simpledms.model.dto.NewUser;
import org.example.simpledms.model.dto.UserReq;
import org.example.simpledms.model.dto.UserRes;
import org.example.simpledms.model.entity.auth.Member;
import org.example.simpledms.security.jwt.JwtUtils;
import org.example.simpledms.service.auth.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * packageName : org.example.simpledms.controller.auth
 * fileName : AuthController
 * author : GGG
 * date : 2024-04-15
 * description : 인증(로그인/회원가입) 컨트롤러
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-15         GGG          최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    MemberService memberService;     // DI

    @Autowired
    PasswordEncoder passwordEncoder; // 암호화 DI

    @Autowired
    JwtUtils jwtUtils;               // 웹토큰 유틸 DI

    //    인증/권한 체크를 위한 인증관리 클래스 객체
    @Autowired
    AuthenticationManagerBuilder authenticationManagerBuilder;

    //    로그인 함수
    @PostMapping("/login")
    public ResponseEntity<Object> login(
            @RequestBody UserReq userReq
    ) {
        try {
//            1) 직접 인증 시작
//            1) id/패스워드로 인증 => 인증된 객체(리턴)
            Authentication authentication
                    = authenticationManagerBuilder.getObject().authenticate(
                    new UsernamePasswordAuthenticationToken(userReq.getEmail(), userReq.getPassword())
            );

//            2) 인증된 객체 => 홀더(필통)에 관리 => 인증 완료
            SecurityContextHolder.getContext().setAuthentication(authentication);

//            3) 웹토큰 발행(생성) => 프론트 전송
//               => authentication => memberDto => email 로 웹토큰 생성
            String jwt = jwtUtils.generateJwtToken(authentication);

//            4) 권한 정보 : ROLE_USER, ROLE_ADMIN
//              => Set -> List => new ArrayList(Set객체) : 변경됨
//              => authentication.getAuthorities() : 권한 배열 집합(set)
            String codeName = new ArrayList(authentication.getAuthorities()).get(0).toString();

//             5) DTO : jwt(웹토큰), 이메일, 권한명 => 프론트에 전송
            UserRes userRes = new UserRes(
                    jwt,                // 웹토큰
                    userReq.getEmail(), // 이메일
                    codeName
            );
            return new ResponseEntity<>(userRes, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //    회원 가입 함수(insert)
    @PostMapping("/register")
    public ResponseEntity<Object> createUser(
            @RequestBody NewUser newUser
    ) {
        try {
//            1) 이메일이 DB 있는지 확인 : 있으면 우리 회원 => 바로 리턴
            if(memberService.existsById(newUser.getEmail()) == true) {
                return new ResponseEntity<>("이미 회원입니다.", HttpStatus.BAD_REQUEST);
            }

//            2) 새로운 사용자 생성
            Member member = new Member(
                    newUser.getEmail(),                            // 로그인 ID
                    passwordEncoder.encode(newUser.getPassword()), // 암호화 적용
                    newUser.getName(),                             // 이름
                    newUser.getCodeName()                          // 권한
            );

//            3) 저장
            memberService.save(member);

//            4) 프론트 전송
            return new ResponseEntity<>(member, HttpStatus.OK);

        } catch (Exception e) {
//            log.debug("에러 : " + e); // 디버깅
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
