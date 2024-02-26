package chap06.sec04.exam04;

/**
 * packageName : chap06.sec04.exam04
 * fileName : Calculator
 * author : GGG
 * date : 2024-02-05
 * description :  TODO: 계산기 클래스
 * 요약 :
 *      TODO: 덧셈, 평균, (평균 + 간단한 인사말) 특수 기능
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class Calculator {
    //    속성(필드) 없음
//    함수 정의 : 설계
//      TODO: 1) 덧셈 : int plus()
    int plus(int x, int y) {
        return x + y;
    }

//      TODO: 2) 평균 : / (실수) : double avg()
    double avg(int x, int y) {
//        double result = (double) (x + y) / 2;
        double result = (double) plus(x,y) / 2;
        return result;
    }
//    3) (평균 + 간단한 인사말) 특수 기능

//      TODO: 3) 간단한 인사말 함수(메소드) : void print()
    void print() {
        System.out.println("안녕하세요");
    }

//      TODO: 4) (평균 + 간단한 인사말) 특수 기능 : void excute()
    void excute() {
        print();                                // 인사말
        System.out.println(avg(7, 10));   // 평균
    }
}