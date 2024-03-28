package org.example.loginquiz.config;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * packageName : org.example.loginquiz.config
 * fileName : WebSecurityConfig
 * author : GGG
 * date : 2024-03-27
 * description : TODO: 스프링 시큐리티 설정(권한/인증) 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-27         GGG          최초 생성
 */
@Configuration
public class WebSecurityConfig {

    //    패스워드 암호화 함수 : 필수
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //    공통 jsp, css, img 등 : 인증 필요없음 => 무시 설정
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers("/resources/js/**"
                , "/resources/img/**"
                , "/resources/css/**"
                , "/WEB-INF/views/**"     // 직접 jsp include 하는 것은 인증 제외
        );
    }

//    TODO: 핵심함수 ) 스프링 시큐리티 권한/인증 규칙 설정 함수
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

//      TODO: 스프링 시큐리티 규칙 설정 : (1) 권한 설정
        http.authorizeHttpRequests(req -> req
                .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                .requestMatchers("/auth/**").permitAll()       // 이 url 은 /auth/** 만 사용자 접근 허용
                .requestMatchers("/admin/**").hasRole("ADMIN") // admin 메뉴는 ROLE_ADMIN 만 가능
                .requestMatchers("/basic/**").permitAll()      // 이 url 은 /basic/** 만 사용자 접근 허용
                .requestMatchers("/").permitAll()              // 이 url 은 / 만 사용자 접근 허용
                .anyRequest()
                .authenticated());                               // 이 외의 url 은 로그인된 사용자만 볼수 있음

//       TODO: 1) 로그인 설정
        http.formLogin(req -> req
                .loginPage("/auth/customLogin")             // 사용자가 만든 화면 로그인 사용
                .loginProcessingUrl("/auth/login")          // Url로 요청이 될 시 SpringSecurity가 직접 알아서 로그인 과정을 진행 : 컨트롤러함수 필요없음, 대신 user(userdetails) 정의 필요
                .defaultSuccessUrl("/")                     // 로그인 성공하면 이동할 페이지 url
        );

//        TODO: 2) 로그아웃 설정
        http.logout(
                req -> req
                        .logoutUrl("/auth/customLogout")      // 스프링에서 logout url 제공함 (로그아웃 페이지는 따로 필요없음)
                        .invalidateHttpSession(true)          // session 삭제 후
                        .logoutSuccessUrl("/")                // logout에 성공하면 /로 redirect
        );

        return http.build();
    }
}
