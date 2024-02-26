package chap07.sec02.exam01;

/**
 * packageName : chap07.sec02.exam01
 * fileName : Parent
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 다형성(*), 부모 클래스
 * 요약 :
 *      TODO: 다형성 : 코딩은 동일하지만 다양한 객체를 이용해서 다양한 실행결과가 나오도록 하는것
 *          이용조건 : 1) 상속관계만 사용 가능
 *                   2) 재정의 함수가 있어야함
 *           다형성 사용법 : 부모클래스 변수 = 자식변수; // 자동자료형 변환
 *          정리 : 클래스의 의미 : 새로운 자료형을 만들었다고 할 수 있음
 *              자료형 변수 : in a, Parent parent, String a
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class Parent {
    public void method1() {
        System.out.println("부모함수 - method1");
    }
    public void method2() {
        System.out.println("부모함수 - method2");
    }
}