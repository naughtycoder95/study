package chap07.sec02.exam04;

/**
 * packageName : chap07.sec02.exam04
 * fileName : ChildApplication
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

    //  전역함수 : static 자료형 함수명(){}
    public static void method1(Parent parent) {
//        instanceof : 부모클래스에 자식클래스가 있는지 확인하는 연산자
//            => 있으면 true, 없으면 false
//            TODO: 부모변수 instanceof 자식클래스
        if( parent instanceof Child) {
//           강제형변환
            Child child = (Child)parent;
            System.out.println("강제형변환 성공");
        } else {
            System.out.println("실패");
        }
    }

    public static void main(String[] args) {
        Parent parent = new Child(); // 다형성

//        전역함수 실행 : 클래스명.함수()
//        자신의 클래스의 전역함수이므로 클래스명은 생략가능
        method1(parent);
    }
}