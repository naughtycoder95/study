package chap15.sec01.exam09;

import java.util.Objects;

/**
 * packageName : chap15.sec01.exam09
 * fileName : Member
 * author : GGG
 * date : 2024-02-13
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class Member {
    public String name;    // 이름
    public int age;        // 나이
    //  생성자 : 2개
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //  TODO: toString() : 객체 출력용 재정의
    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //  TODO: .equals(), .hashCode() 재정의 : alt + insert(cmd + n)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return age == member.age && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}