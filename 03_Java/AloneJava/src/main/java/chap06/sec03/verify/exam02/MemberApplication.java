package chap06.sec03.verify.exam02;

import chap06.sec03.verify.exam02.Member;

/**
 * packageName : chap06.sec03.verify.exam02
 * fileName : MemberApplication
 * author : GGG
 * date : 2024-02-05
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
//        1) Member 객체를 생성하고 싶습니다. 생성자에서 name 속성과 id 속성을
//        외부에서 받은 값으로 초기화 할 수 있도록 Member 클래스를 작성해 보세요.
//        생성자 단축키 : alt + insert (오른쪽클릭 -> 생성 -> 생성자 -> 속성선택)
//        결과 :
//               홍길동
//               hong
        Member member = new Member("홍길동", "hong");

        System.out.println(member.name);
        System.out.println(member.id);
    }
}