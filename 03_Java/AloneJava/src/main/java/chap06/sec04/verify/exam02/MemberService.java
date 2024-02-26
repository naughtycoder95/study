package chap06.sec04.verify.exam02;

/**
 * packageName : chap06.sec04.verify.exam02
 * fileName : MemberService
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
public class MemberService {
    //      TODO: 조건문 : if, switch
//          1) id="hong" 동시에 password="12345" => "로그인 되었습니다."
//             아니면             "id 또는 password가 올바르지 않습니다."
//             복습 : 문자열 비교   : 문자열.equals(문자열2)
//                 기본 자료형 비교 : >=, == 등
    void login(String id, String password) {
        if(id.equals("hong") && password.equals("12345")) {
            System.out.println("로그인 되었습니다.");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}