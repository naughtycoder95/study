package chap10.sec02.exam01;

/**
 * packageName : chap10.sec02
 * fileName : PersonApplication
 * author : GGG
 * date : 2024-02-20
 * description : 익명클래스 사용
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class PersonApplication {

    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

//        익명 클래스의 함수 실행  : 6시에 일어납니다.
        anonymous.person.wake();

//        일반 클래스의 함수 실행 : 5시에 일어납니다. 산책합니다.
        anonymous.method1();    // 메소드 안에 익명 클래스가 있음

//        함수의 매개변수에 익명클래스 넣기 : 8시에 일어납니다.
        anonymous.method2(new Person() {
            @Override
            void wake() {
                System.out.println("8시에 일어납니다.");
            }
        });
    }
}