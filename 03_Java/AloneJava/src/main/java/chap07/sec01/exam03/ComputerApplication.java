package chap07.sec01.exam03;

/**
 * packageName : chap07.sec01.exam03
 * fileName : ComputerApplication
 * author : GGG
 * date : 2024-02-06
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class ComputerApplication {
    public static void main(String[] args) {
//        TODO: 부모 클래스 생성 : 클래스 변수 = new 생성자함수();
        Calculator calculator = new Calculator();
//        반지름 값 저장
        System.out.println(calculator.areaCircle(10));

//       TODO: 자식 클래스 생성 : Computer : 오버라이딩(재정의) 함수 실행
        Computer computer = new Computer();
        System.out.println(computer.areaCircle(10));
    }
}