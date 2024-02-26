package chap02;

/**
 * packageName : chap02
 * fileName : Sec01
 * author : GGG
 * date : 2024-01-24
 * description :
 * 요약 : 변수
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         GGG          최초 생성
 */
public class Sec01 {
    public static void main(String[] args) {
//    TODO: main 함수 역할 : 프로그램을 실행시키는 부분

//    TODO: 1) 변수 정의
//    TODO: 사용법 : 자료형 변수명 = 값;
//         int : 정수 자료형
//        int value = 20;
//        System.out.println(value); // 결과 출력

//     TODO: 2) 변수 활용
//        int value2 = 30;
//        int result = value2 + 30;
//        System.out.println(result); // 60

//     TODO: 주석 단축키 : ctrl + /
//     TODO: 3) 연습 ) val = 10 , val2 = 30
//         결과 : 40
//        int val = 10;
//        int val2 = 30;
//        int result = val + val2;
//
//        System.out.println(result);

//      TODO: 4) 정수 , 문자열 붙이기 : +
//        int hour   = 3; // 시간
//        int minute = 5; // 분
////      TODO: 문자열 붙이기
////          sout
//        System.out.println(hour + "시간" + minute + "분");

//      TODO: 5) 산술연산자 : +, -, *, /, %
//        int hour = 3;
//        int total = (hour * 60) + 4;
//        System.out.println(total);   // 결과 출력

//      TODO: 6) 변수 값 바꾸기 : swap 하기
        int x = 3;
        int y = 5;
        System.out.println("x :" + x + ", y :" + y);

//      TODO: swap 코딩
//           1) x 의 값을 미리 임시변수에 저장해 둔다
//           2) x 에 y 를 저장한다.
//           3) y 에 임시변수의 값을 저장한다.
        int temp = x; // x 의 값을 미리 임시변수에 저장해 둔다
        x = y;
        y = temp;

        System.out.println("x: " + x + ", y :" + y);

    }
}
