package chap06.sec04.verify.exam02;

/**
 * packageName : chap06.sec04.verify.exam02
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
// MemberService 클래스에 login() 함수 정의(선언)하려고 합니다.
// login() 함수는 매개변수값 id가 "hong", password 가 "12345" 일 경우에만
//     "로그인 되었습니다." 출력하고,
//     아니면 "id 또는 password가 올바르지 않습니다." 가 출력됩니다.
//     클래스를 작성하세요.
// 결과 :
//    로그인 되었습니다.
        MemberService memberService = new MemberService();
        memberService.login("hong", "12345");
    }
}