package chap05;

/**
 * packageName : chap05
 * fileName : Sec02
 * author : GGG
 * date : 2024-01-26
 * description : 배열 (참조 자료형) : 자료구조
 * 요약 :
 *      배열 : 여러가지 값을 저장하는 곳
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Sec02 {
    public static void main(String[] args) {
//        TODO: 예제 ) 10명의 학생 성적을 저장하여 총합/평균 출력하세요
//         평균 = 총합/학생수
//      TODO: 사용법(*) : 자료형[] 변수 = {값, 값2, ..., 값n}; // 배열정의
//      TODO: 사용법 2  : 자료형 변수[] = {값, 값2, ..., 값n}; // 배열정의
//      TODO: 배열의 사용(값): 변수[인덱스번호];  // 인덱스번호: 0 ~ n
//          예) arr[0], arr[1];
//      TODO: 1) 1번째 배열정의 :
//        int[] score = {90, 91, 92, 93, 94,95,96,97,98,99};
//        int sum = 0;   // 총합을 저장할 변수
////      fori : 반복문 단축키
//        for (int i = 0; i < 10; i++) {
//            sum = sum + score[i];      // 누적합(총합)
////        TODO: 중간 결과 또는 중간 변수값을 알고 싶음 : 디버깅 또는 로깅
////            System.out.print(":::"+score[i] + " ");
//        }
////        평균 = 총합/학생수
//        int avg = sum/10;   // 소수점 절삭(잘라내기)
//        System.out.println(sum + " " + avg);

//      TODO: 2nd 배열 정의
//      예제 2) 학생성적값 (10,20,30) 배열에 넣고 출력해보세요
//      => 의미 : int(정수) 3개를 메모리(힙방) 방을 예약하는 행위
//        int[] arr = new int[3];          // 배열정의

//      배열값 넣기 : 반복문 사용 예시
//        for (int i = 0; i < 3; i++) {
//            arr[i] = 10;
//        }
//      참고) 변수 값 정의      : int a = 0;    //변수정의
//           변수 사용(수정)    : a = 1;        // 값수정(0->1 변경)
//           배열변수 사용(수정) : arr[0] = 10;  // 배열값 수정

//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//
////      출력
//        for (int i = 0; i < 3; i++) {
//            System.out.println(arr[i]);  // 배열값 출력
//        }

//      TODO: 연습문제 1) : 실수(double) 배열 arr2를 만들어서 값을
//               (0.1, 0.2, 0.3 ) 저장하고 출력하세요.
//     사용법 #1: 자료형[] 변수 = {값, 값2 ...};
//     사용법 #2: 자료형[] 변수 = new 자료형[개수];
//               변수[0] = 값;
//               변수[1] = 값2;
//        double[] arr = new double[3];   // 배열정의
//
//        arr[0] = 0.1;                   // 배열값 수정(값넣기)
//        arr[1] = 0.2;
//        arr[2] = 0.3;
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(arr[i]); // 출력
//        }

//      TODO: 연습문제 2) 문자열(String) 배열 arr3를 만들어서 값을("1월", "2월", "3월")
//                 저장하고 출력하세요.
//        String[] arr3 = new String[3];   // 배열 정의

//        arr3[0] = "1월";
//        arr3[1] = "2월";
//        arr3[2] = "3월";
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(arr3[i]);  // 배열값 출력
//        }

//      TODO: 배열 사용법 #3(참고) :
//        int[] score;                   // 배열변수 정의
//        score = new int[]{80,81,82};   // new(예약) + {값, 값2}
//
////      바로 출력
//        for (int i = 0; i < 3; i++) {
//            System.out.println(score[i]);
//        }

//      TODO: 2차원 배열 : 배열 안에 배열
//      TODO: 2가지 사용법 2차원 배열 정의 : {}, new 사용
//      TODO: 1) 배열정의
//        int[][] score = {{1,2,3}, {11,12,13}};
//
////      배열 1개 출력 : for 문 1개
////      배열 2개 출력 : for 문 2개 사용
////      * 배열의 크기(길이,개수) 속성 : 배열변수.length
//
//        for (int i = 0; i < score.length; i++) {        // 바깥 { == 바깥 for 문
//            for (int j = 0; j < score[i].length; j++) { // 안쪽 { == 안쪽 for 문
////              TODO: 배열[1st인덱스번호:i][2nd인덱스번호:j]
//                System.out.println(score[i][j]);        // 배열값(2차원)
//            }
//        }

//      TODO: 2) 배열정의
//        int[][] score = {{1,2,3}, {11,12,13}};
//        int[][] score = new int[2][3];   // 배열정의 (방예약)
//
////      값 넣기
//        score[0][0] = 1;
//        score[0][1] = 2;
//        score[0][2] = 3;
//
//        score[1][0] = 11;
//        score[1][1] = 12;
//        score[1][2] = 13;
//
////      출력
//        for (int i = 0; i < score.length; i++) {
//            for (int j = 0; j < score[i].length; j++) {
//                System.out.println(score[i][j]);  // 결과 출력
//            }
//        }

//     TODO: 예제 3) 향상된 for 문
//            학점에 총합과 평균 구하기
        int[] score = {90,91,92,93,94};

        int sum = 0;                // 누적합 변수
//        for (int i = 0; i < score.length; i++) {
//            sum = sum + score[i]; // 누적합 코드(총합)
//        }

//      TODO: 향상된 for 문 바꾸기
//      고전 for 사용법   : for(초기값;조건식;증감식){실행문;}
//      향상된 for 사용법 : for(배열값 : 배열){실행문;}
//        => (참고) : 단점) break, continue 사용 못함
//        => 자동으로 배열의 끝까지 반복함
//        => 해석) value = 90,91,92,93,94 순차적으로 저장됨
//        for(int value : score) {
//            sum = sum + value;      // 누적합 코드(총합)
//        }
//
//        System.out.println(sum);    // 총합 출력
//        int avg = sum/score.length; // 평균
//        System.out.println(avg);


//      TODO: 예제 4) 기술면접 질문 대비
//         깊은 복사(deep copy) vs 얇은 복사 : (참조 자료형)
//        복사 : Copy, 원본값을 복제하는 행위
//       0) 얇은 복사(shallow copy) 코드 : 대입연산자 이용해서 복사
        int[] oldInt = {1,2,3};      // 원본
//        oldInt = 방번호(스택)
        System.out.println(oldInt);  // 방번호 출력

        int[] newInt = oldInt;       // 얇은 복사(메모리 방번호가 저장)
//      TODO: 단점) 복사본 값을 수정하면 원본값도 바뀜
        newInt[0] = 10;  // 새로운배열값 수정 (원본에 0번지 배열값도 수정됨)
        System.out.println(newInt[0]); // 복사본값 출력
        System.out.println(oldInt[0]); // 원본값 출력

//       1) 깊은 복사(deep copy) 코드 :
        int[] oldInt2 = {1,2,3};    // 원본
        int[] newInt2 = new int[3]; // 복사본(방예약)

//      복사본값 = 원본값 넣기
//        newInt2[0] = oldInt2[0];
//        newInt2[1] = oldInt2[1];
//        newInt2[2] = oldInt2[2];
        for (int i = 0; i < oldInt2.length; i++) {
            newInt2[i] = oldInt2[i];
        }
//      TODO: 장점 : 복사본 배열값을 바꾸어도 원본값이 바뀌지 않음
        newInt2[0] = 10;                 // 복사본 값 수정
        System.out.println(newInt2[0]);  // 복사본값 출력
        System.out.println(oldInt2[0]);  // 원본값 출력
    }
}







