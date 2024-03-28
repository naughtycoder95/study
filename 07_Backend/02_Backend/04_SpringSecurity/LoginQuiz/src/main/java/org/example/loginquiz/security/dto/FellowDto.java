package org.example.loginquiz.security.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * packageName : org.example.loginquiz.security.dto
 * fileName : FellowDto
 * author : GGG
 * date : 2024-03-28
 * description : TODO: 검증이 완료된 사용자 클래스
 * 요약 :
 *      TODO: User, UserDetails 스프링시큐리티에서 제공한 클래스 상속
 *       1) 위의 2개 중에 1개 상속해서 작성
 *       2) (참고) 스프링 시큐리티가 이후에는 현재 사용자와 이 객체를
 *            내부적으로 계속 비교해서 인증함(화면을 돌아다닐때 마다)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-28         GGG          최초 생성
 */
@Getter
@Setter
@ToString
public class FellowDto extends User {

    private String userId; // 개발자 추가 속성, 로그인ID(username)

//    생성자 : alt + insert
    public FellowDto(String userId, String password, Collection<? extends GrantedAuthority> authorities) {
        super(userId, password, authorities);
        this.userId = userId;
    }
}
