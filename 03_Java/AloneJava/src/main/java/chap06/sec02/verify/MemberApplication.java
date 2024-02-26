package chap06.sec02.verify;

/**
 * packageName : chap06.sec02.verify
 * fileName : MemberApplication
 * author : GGG
 * date : 2024-02-02
 * description : 실행클래스 : main()
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-02         GGG          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
// Member 객체를 생성하고 속성에 아래의 값으로 저장한 후 속성의 값을 출력하세요.
//        name 속성(필드), id 속성(필드)
//        결과 :
//            최하얀
//            23
//        클래스 생성 : 클래스 변수 = new 생성자함수();
        Member member = new Member();  // 객체(클래스)생성

//      속성 수정
        member.name = "최하얀";
        member.id = "23";

        System.out.println(member.name);
        System.out.println(member.id);
    }
}