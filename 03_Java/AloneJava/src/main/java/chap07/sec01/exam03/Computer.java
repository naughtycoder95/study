package chap07.sec01.exam03;

/**
 * packageName : chap07.sec01.exam03
 * fileName : Computer
 * author : GGG
 * date : 2024-02-06
 * description : TODO: 자식클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class Computer extends Calculator {
    //    원의 넓이 함수
    double areaCircle(double r) {
        System.out.println("자식 함수");
//      수학객체 : 속성 : PI (3.14xxxxx)
        return r * r * Math.PI;
    }
}