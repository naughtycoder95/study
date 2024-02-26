package chap15.sec01.exam04;

/**
 * packageName : chap15.sec01.exam04
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
//        TODO: Member 클래스 생성 : 클래스 변수 = new 생성자함수();
        Member member = new Member("blue");
        Member member2 = new Member("blue");

//      1) 객체 비교 : == vs .equals() 비교 : x
        if(member == member2) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }

//      TODO: 2) 객체 비교 : .equals() 비교 :
//               2-1) String 자료형만 값비교 가능    : 자바 자체적으로 재정의 해놓음
//               2-2) 다른 클래스 자료형은 값비교 안됨 : equals 함수 재정의
//                   - 값비교 의 의미 : 속성(필드)의 값이 같다
//               2-3) equals() 재정의 후에 결과가 정상적으로 출력됨
        if(member.equals(member2)) {
            System.out.println("같음2");
        } else {
            System.out.println("다름2");
        }
    }
}