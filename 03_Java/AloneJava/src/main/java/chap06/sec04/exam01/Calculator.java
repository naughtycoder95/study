package chap06.sec04.exam01;

/**
 * packageName : chap06.sec04.exam01
 * fileName : Calculator
 * author : GGG
 * date : 2024-02-05
 * description : 함수(메소드)
 * 요약 :
 *     TODO: 클래스 3요소 (속성(필드), 생성자함수, 함수(메소드))
 *        함수(메소드) 사용법 :
 *            (접근제한자) return_자료형 함수명(자료형 매개변수 ...){실행문;}
 *            void : return 을 사용하지 않는 함수
 *            예) public int Max(int a, int b){};
 *                void powerOn(){};
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class Calculator {
    //   특징 : 속성(필드)
//   동작 : 함수(메소드)
//    1) 전원켜기 기능
    void powerOn() {
        System.out.println("전원 켜기");
    }
    //    2) return 있는 함수 : 덧셈
    int plus(int x, int y) {
        int result = x + y;
        return result;      // result => 정수
    }
    //    TODO: 3) return 있는 함수 : 뺄셈
//       함수(메소드)명 : minus 작성
    int minus(int x, int y) {
        int result = x - y;
        return result;            // 자료형 : 정수
    }

    //    TODO: 3) return 있는 함수 : 나눗셈
//       함수(메소드)명 : divide 작성
    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result;             // 자료형 : double(실수)
    }

    //    4) 전원끄기 기능
    void powerOff() {
        System.out.println("전원 끄기");
    }
}