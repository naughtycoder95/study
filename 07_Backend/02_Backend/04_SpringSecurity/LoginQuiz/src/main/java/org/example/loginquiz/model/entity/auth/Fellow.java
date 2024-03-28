package org.example.loginquiz.model.entity.auth;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.loginquiz.model.common.BaseTimeEntity2;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

/**
 * packageName : org.example.loginquiz.model.entity.auth
 * fileName : Fellow
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
@Entity
@Table(name = "TB_FELLOW")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
// soft delete
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql ="UPDATE TB_FELLOW SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE USER_ID = ?")
public class Fellow extends BaseTimeEntity2 {
//    연습 : Member 가 잇는 LoginExam 프로젝트를 참고해서
//      Fellow 가 로그인하는 페이지를 완성하세요
//      id : forbob
//      pwd : 123456
    @Id
    private String userId;      // 기본키, 유저ID (jsp : username(스프링에서 사용하는 유저ID)

    private String password;    // 암호

    private String name;        // 유저명

    private String codeName;    // 권한명 (ROLE_ADMIN, ROLE_USER) : TB_CODE 테이블
}
