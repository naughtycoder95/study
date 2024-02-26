package chap07.sec01.exam01;

/**
 * packageName : chap07.sec01.exam01
 * fileName : CellPhone
 * author : GGG
 * date : 2024-02-06
 * description : TODO: 상속 : 부모클래스
 * 요약 :
 *      TODO: 상속 : 현실세계? 부모로부터 재산을 물려받는 것
 *                  코딩세계? 부모로부터 재산을(속성,생성자,함수) 물려받는 것
 *            상속관계 : 부모클래스(물려준쪽) -> 자식클래스(물려받은쪽)
 *             사용법(자식) : class 자식클래스 extends 부모클래스 {}
 *             장점 : 1) 코딩 중복 제거
 *                   2) 코딩 효율성 증가
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class CellPhone {
    //  TODO: 3요소 : 속성(필드), 생성자, 함수(메소드)
    String model;
    String color;

    //  TODO: 함수(메소드) : 기능, 동작
//    전원 켜기 기능
    void powerOn() {
        System.out.println("전원 켜기");
    }
    //    전원 끄기 기능
    void powerOff() {
        System.out.println("전원 끄기");
    }
    //    벨 울림
    void bell() {
        System.out.println("벨이 울립니다.");
    }
    //    통화하기
    void voice() {
        System.out.println("통화를 합니다.");
    }
    //    전화 끊기
    void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}