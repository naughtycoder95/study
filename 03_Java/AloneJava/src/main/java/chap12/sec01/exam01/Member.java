package chap12.sec01.exam01;

import java.util.Objects;

/**
 * packageName : chap12.sec01.exam01
 * fileName : Member
 * author : GGG
 * date : 2024-02-15
 * description : 객체의 동등 비교 : .equals()
 * 요약 :
 *      1) String 클래스 : 미리 재정의되어 사용하면 값비교가 됨
 *      2) 일반 클래스   : 재정의 안되어 있음, 재정의해야 값비교가 됨
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class Member {
    public String id;

    //    복습 : 생성자 1개
    public Member(String id) {
        this.id = id;
    }

    //    TODO: equals 재정의 : alt + insert(cmd + n)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }
}