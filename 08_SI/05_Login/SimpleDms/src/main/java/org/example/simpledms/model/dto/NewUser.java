package org.example.simpledms.model.dto;

import lombok.*;

/**
 * packageName : org.example.simpledms.model.dto
 * fileName : NewUser
 * author : GGG
 * date : 2024-04-16
 * description : 회원가입 용 DTO
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-16         GGG          최초 생성
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class NewUser {
    private String email;    // ID
    private String password; // 암호
    private String name;     // 이름
    private String codeName; // 권한명
}
