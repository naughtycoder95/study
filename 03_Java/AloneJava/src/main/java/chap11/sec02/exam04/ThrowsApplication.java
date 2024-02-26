package chap11.sec02.exam04;

/**
 * packageName : chap11.sec02.exam04
 * fileName : ThrowsApplication
 * author : GGG
 * date : 2024-02-15
 * description : throws 예약어
 * 요약 :
 *       TODO: throws
 *        => 현재 라인에 에러가 발생하면 그곳에서 예외(에러)처리를 하지않고
 *           현재 함수를 호출하는 곳에서 하게끔 떠넘기는 키워드
 *        => 사용법 : 자료형 함수명() throws 예외클래스{}
 *        => (참고) : main() 함수에서는 만약 예외처리를 하지 않으면
 *               (또 throws 키워드로 떠넘긴다면 )
 *              마지막으로 자바가상머신 해줌
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class ThrowsApplication {

    //  전역함수 :
//    TODO: throws
//       => 현재 라인에 에러가 발생하면 그곳에서 예외(에러)처리를 하지않고
//          현재 함수를 호출하는 곳에서 하게끔 떠넘기는 키워드
    public static void findClass() throws ClassNotFoundException {
//      Class 객체(클래스) : 클래스의 정보를 가지고 있는 클래스: 클래스명, 패키지명 등
        Class clazz = Class.forName("java.lang.String2"); // 에러 발생
    }

    public static void main(String[] args) {
        try {
            findClass();                    // 전역함수 실행
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
//            System.out.println(e.getMessage());
        }
    }
}
