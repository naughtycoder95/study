package chap07.sec01.exam03;

/**
 * packageName : chap07.sec01.exam03
 * fileName : Calculator
 * author : GGG
 * date : 2024-02-06
 * description : TODO: 부모 클래스 : 오버라이딩(overriding):재정의
 * 요약 :
 *      TODO: 함수(메소드) 오버라이딩
 *          => 부모 - 자식 상속관계에서 동일한 이름의 함수가 있을경우
 *              자식 함수가 실행됨
 *          => 언제 사용 ? 부모 함수를 사용할려고 했으니 기능 개선이
 *              필요할 경우 사용함 (이름은 동일하게 사용하고 싶음)
 *          => 예) 실무: 실행클래스 : sum() 호출 : 덧셈(결과)
 *              => 2개월후 sum() 동일하게 사용 : 덧셈 + 인사말 출력
 *              => 해결? 함수 오버라이딩 이용(상속)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class Calculator {
    //    3요소 : *속성, 생성자 , 함수
//    원의 넓이 함수
    double areaCircle(double r) {
        System.out.println("부모 함수");
        return r * r * 3.14;
    }
}