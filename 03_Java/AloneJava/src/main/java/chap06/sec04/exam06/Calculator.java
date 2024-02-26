package chap06.sec04.exam06;

/**
 * packageName : chap06.sec04.exam06
 * fileName : Calculator
 * author : GGG
 * date : 2024-02-05
 * description : TODO: 함수(메소드) 오버로딩
 * 요약 :
 *      TODO: 오버로딩 : 매개변수나 return 값을 다르게 사용하면
 *          같은 함수명을 이용할수 있도록 허용하는 것
 *          => 기본 : 같은 함수명은 사용불가
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class Calculator {
    //    TODO: *속성, 생성자, 함수(메소드)
//    함수 정의 : 매개변수 1개짜리, 정사각형 넓이 함수 : w * w
    double area(double width) {
        return width * width;
    }

    //    매개변수 2개, 직사각형 넓이 함수 : w * h
    double area(double width, double height) {
        return width * height;
    }

}