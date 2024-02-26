package chap06.sec04.exam02;

/**
 * packageName : chap06.sec04.exam02
 * fileName : ComputerApplication
 * author : GGG
 * date : 2024-02-05
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class ComputerApplication {
    public static void main(String[] args) {
//        Computer 클래스 생성
        Computer computer = new Computer();

        int[] val = {1,2,3,4,5,6,7,8,9};
//      함수(메소드) 장점 : 중복코드 제거, 코딩 효율성 증가
        System.out.println(computer.mySum(val)); // 누적합 출력

//      TODO:(참고) : ... 연산자 사용 예제
        System.out.println(computer.mySum2(1,2,3));
        System.out.println(computer.mySum2(1,2,3,4,5));
    }
}