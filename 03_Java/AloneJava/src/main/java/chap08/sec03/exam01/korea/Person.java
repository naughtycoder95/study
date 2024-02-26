package chap08.sec03.exam01.korea;

/**
 * packageName : chap08.sec03.exam01.korea
 * fileName : Person
 * author : GGG
 * date : 2024-02-08
 * description : TODO: 부모클래스, 접근제한자 #2
 * 요약 :
 *      1) public    : 모든 클래스에서 사용 가능
 *      2) default   : 같은 패키지(폴더)에서만 사용 가능, 생략가능
 *      3) protected : 같은 패키지(폴더)에서만 사용 가능, 다른 패키지(폴더)일 경우 상속받은 자식 클래스만 사용 가능
 *      4) private   : 자기 자신만 사용 가능, 상속받은 자식 클래스도 사용 불가
 *      접근권한 : (제한) private < default < protected < public (허용)
 *      5) 함수 재정의 시 접근제한자 사용 :
 *          1) 부모 : public 함수 -> 자식 : public 함수
 *          2) 부모 : default 함수 -> 자식 : default, public 함수
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Person {
    private int no;           // private 속성(필드)
    int name;                 // default 속성(필드)
    protected String address; // protected 속성(필드)

    public void print() {     // public 함수(메소드)
        System.out.println("안녕");
    }
}
