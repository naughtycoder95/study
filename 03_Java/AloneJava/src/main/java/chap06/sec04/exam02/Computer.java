package chap06.sec04.exam02;

/**
 * packageName : chap06.sec04.exam02
 * fileName : Computer
 * author : GGG
 * date : 2024-02-05
 * description : TODO: 함수(메소드)
 * 요약 :
 *      TODO: 매개변수로 배열 전달
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class Computer {
    //    1) 매개변수로 배열을 받아 누적합을 구하는 함수
//     => sum = sum + 값;
    int mySum(int[] value) {
        int sum = 0;                  // 누적합 변수 초기화

//      반복문 : 매개변수 배열크기까지
        for (int i = 0; i < value.length; i++) {
            sum = sum + value[i];     // 누적합 코드
        }
        return sum;                   // 누적합 내보내기
    }

    //  2) 매개변수로 배열을 받아 누적합을 구하는 함수 : #2(참고)
//  TODO: ... => 매개변수 개수를 전달받아 임시로 배열로 만들어주는 연산자
    int mySum2(int ...value) {
        int sum = 0;
        for (int i = 0; i < value.length; i++) {
            sum = sum + value[i];    // 누적합 코드
        }
        return sum;
    }
}





