package chap07.sec02.exam01;

/**
 * packageName : chap07.sec01.exam07
 * fileName : ChildApllication
 * author : GGG
 * date : 2024-02-07
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class ChildApplication {
    public static void main(String[] args) {
//        TODO: 클래스 생성 : 클래스 변수 = new 생성자함수();
//          클래스(정의 : 설계도) == 객체(건물) == 인스턴스
//        자식클래스 생성
        Child child = new Child();
        Child2 child2 = new Child2();

//        TODO: 다형성 : 부모클래스에 자식클래스를 넣기(대입(=)), 상속관계만 가능
//          => 효과 : 재정의된 함수가 있으면 자식함수가 실행됨
//          => 장점 1) 코드 수정을 최소화하고 싱행클래스에 다양한 결과를 만들어 낼 수 있음
//        Parent parent = child;
        Parent parent = child2;

        parent.method1();       // 부모함수
//        method2() : 부모, 자식 동시에 있음
        parent.method2();       // 자식함수
    }
}
