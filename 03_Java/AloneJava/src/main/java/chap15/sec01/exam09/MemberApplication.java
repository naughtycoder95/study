package chap15.sec01.exam09;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName : chap15.sec01.exam09
 * fileName : MemberApplication
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
public class MemberApplication {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

//      집합 : 객체(생성해서) 넣기
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));  // 중복 (x)
        System.out.println(set); // [Member{name='홍길동', age=30}]
    }
}