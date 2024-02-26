package chap12.sec01.exam01;

/**
 * packageName : chap12.sec01.exam01
 * fileName : MemberApplication
 * author : GGG
 * date : 2024-02-15
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
//        TODO: 클래스 변수 = new 생성자함수();
        Member member = new Member("blue");
        Member member2 = new Member("blue");

//        객체 비교 시 .equals 방번호(주소) 비교
        if(member.equals(member2)) {
            System.out.println("member 와 member2는 같습니다.");
        } else {
            System.out.println("member 와 member2는 다릅니다.");
        }
    }
}