package chap02;

/**
 * packageName : chap02
 * fileName : Sec02
 * author : GGG
 * date : 2024-01-24
 * description : 자바 자료형
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         GGG          최초 생성
 */
public class Sec02 {
    public static void main(String[] args) {
//        TODO: main 단축키

//        TODO: 1) 자료형 : int(4 byte) : 정수 자료형 (*)
//              1-1) 2/8/10/16진수
//              1-2) 진수 사용
//        int var1 = 0b1011; // 2진수 (0b 붙이면 됨)
//        int var2 = 0206;   // 8진수 (0 붙이면 됨)
//        int var3 = 365;    // 10진수 (그냥 사용)
//        int var4 = 0xB3;   // 16진수 (0x 붙이면 됨)
//
////      출력 : sout , 줄복사 : ctrl + d
//        System.out.println(var1);
//        System.out.println(var2);
//        System.out.println(var3);
//        System.out.println(var4);

//      TODO: 정수자료형 2 : byte(1byte 정수형)
//          1 byte = 8bit
//          숫자표현 : -128 ~ 127 까지
//        byte var1 = -128;
//        byte var2 = -30;
//        byte var3 = 0;
//        byte var4 = 127;
////        byte var5 = 129;  // 안됨
//
//        System.out.println(var1);
//        System.out.println(var2);
//        System.out.println(var3);
//        System.out.println(var4);

//      TODO: 정수자료형 3(*) : long : (8byte 정수형)
//        long var1 = 10;
//        long var2 = 20L;            // L 이 붙기도 함(생략가능)
//        long var3 = 1000000000000L;
//
//        System.out.println(var1);
//        System.out.println(var2);
//        System.out.println(var3);

//      TODO: 정수자료형 : char : (1byte 정수형), 특이한점
//        => 정수를 저장하면 : 아스키코드가 됨 =>
//        => 문자를 저장하면 : 문자가됨 (1글자) => 홑따옴표 사용
//        char c1 = 'A';  // 홑따옴표 사용
//        char c2 = 65;   // 아스키코드 => 자동변환 문자를 출력
//        char c3 = '가';
//
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);

//      TODO: 2) 문자열 : "" (쌍따옴표 사용) : String
//        String name = "홍길동";
//        String job  = "프로그래머";
////      sout
//        System.out.println(name);
//        System.out.println(job);

//      TODO: 3) 특수문자 소개 : \(역슬래쉬 : 이스케이프문자)
//      예제 : " 출력하기
//      결과 : 우리는 "개발자" 입니다.
//        sout
        System.out.println("우리는 \"개발자\" 입니다."); // \" 사용

//      TODO: \n : 줄바꿈 문자
        System.out.print("행 출력\n");
        System.out.print("행 출력\n");
        
//      TODO: 결과 : 봄\여름\가울\겨울
        System.out.println("봄\\여름\\가을\\겨울"); // \\ 사용

//      TODO: 4) 실수형(*) : double (8byte 실수형)
        double var1 = 3.14; // 실수

        System.out.println(var1);
//      TODO: 4-1) 실수형 : float (4byte 실수형)
        float var2 = 3.14f; // 끝에 f 붙임
        System.out.println(var2);

//      TODO: 5) 참(true)/거짓(false) 자료형 : boolean (1byte)
        boolean stop = true;

//        조건문 : if(조건식){}else{}
        if(stop == true) {
            System.out.println("중지"); // sout
        } else {
            System.out.println("시작");
        }
    }

//  TODO: 대표 자료형 : 1) 정수   : int
//                    2) 문자열  : String
//                    3) 실수   : double
//                    4) 참/거짓: boolean
}








