package chap02;

import java.util.Scanner;

/**
 * packageName : chap02
 * fileName : Sec04
 * author : GGG
 * date : 2024-01-24
 * description : 입력 객체
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         GGG          최초 생성
 */
public class Sec04 {
    public static void main(String[] args) {
//           main : 자바 실행용
//     TODO: 예제) 입력 1개 받고 출력하기
//        입력 : a
//        출력 : a
//      Scanner 클래스(객체) : 입력을 위한 객체
//        객체 : 속성, 함수(메소드)
//        Scanner scanner = new Scanner(System.in);
////      단어 : 공백/엔터를 기준으로함 예) hello world (1단어 : hello)
//        String first = scanner.next(); // 1단어 입력함수(문자열)
//        System.out.println(first);

//     TODO: 예제2) 2단어 입력 받아서 출력하세요
//        입력 : hello world
//        출력 : hello
//              world
//        Scanner scanner = new Scanner(System.in);
//        String first  = scanner.next();  // 1번째 입력(단어)
//        String second = scanner.next();  // 2번째 입력(단어)
//
//        System.out.println(first);
//        System.out.println(second);

//      TODO: 예제 3) 정수 1개 입력받아서 출력
//        입력 : 3
//        출력 : 3
//        Scanner scanner = new Scanner(System.in); // 객체 생성
//        int first = scanner.nextInt();    // 정수 1개 입력
//
//        System.out.println(first);

//      TODO: 예제 4) 정수 2개 입력받아서 (+)계산해서 출력하기
//        입력 : 3 5
//        출력 : 8
//        System.in : 키보드 입력
        Scanner scanner = new Scanner(System.in);
        int first  = scanner.nextInt(); // 정수 1개
        int second = scanner.nextInt(); // 정수 1개
        System.out.println(first + second);
    }
}