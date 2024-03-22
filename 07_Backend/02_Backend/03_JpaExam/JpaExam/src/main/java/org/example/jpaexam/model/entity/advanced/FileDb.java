package org.example.jpaexam.model.entity.advanced;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.*;
import org.example.jpaexam.model.common.BaseTimeEntity2;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

/**
 * packageName : org.example.jpaexam.model.entity.basic
 * fileName : FileDb
 * author : GGG
 * date : 2024-03-22
 * description : 파일 업로드 엔티티 클래스
 * 요약 :
 *      TODO:
 *       1) 시퀀스 사용않함 -> 자바의 uuid 사용(기본키)
 *         => uuid : 자바에서 문자열이 생성됨(세계에서 유일하게)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-22         GGG          최초 생성
 */
// jpa 어노테이션
@Entity
@Table(name = "TB_FILE_DB")
@DynamicInsert
@DynamicUpdate
// 롬북 어노테이션
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
// soft delete jpa 어노테이션
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql ="UPDATE TB_FILE_DB SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE UUID = ?")
public class FileDb extends BaseTimeEntity2 {

//    TB_FILE_DB : 컬럼과 일치하게 속성 작성
    @Id
    private String uuid;        // 기본키 : 자바생성

    private String fileTitle;   // 제목

    private String fileContent; // 내용

    private String fileName;    // 업로드 파일명

    @Lob
    private byte[] fileData;    // 이미지 저장 속성(필드)

    private String fileUrl;     // 이미지 다운로드 url

}
