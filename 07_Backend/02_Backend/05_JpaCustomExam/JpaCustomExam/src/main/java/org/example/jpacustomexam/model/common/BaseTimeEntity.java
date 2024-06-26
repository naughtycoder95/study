package org.example.jpacustomexam.model.common;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * packageName : com.example.jpaexam.model
 * fileName : BaseTimeEntity
 * author : kangtaegyung
 * date : 2022/10/16
 * description : JPA 에서 자동으로 생성일자/수정일자 만들어주는 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/10/16         kangtaegyung          최초 생성
 */
@Getter
// @MappedSuperclass : JPA Entity 클래스들이 BaseTimeEntity를 상속할 경우
// 필드들(createdDate, modifiedDate)도 칼럼으로 인식하도록 한다.
@MappedSuperclass
// @EntityListeners(AuditingEntityListener.class) : BaseTimeEntity 클래스에
// Auditing 기능을(자동 생성일, 수정일) 포함시킨다.
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {

    private String insertTime;

    private String updateTime;

    @PrePersist
        //해당 엔티티 저장하기 전
    void onPrePersist(){
        this.insertTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @PreUpdate
        //해당 엔티티 수정 하기 전
    void onPreUpdate(){
        this.updateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.insertTime = this.updateTime;
    }
}
