package chap04;

import java.util.Scanner;

/**
 * packageName : chap04
 * fileName : Verify01
 * author : GGG
 * date : 2024-01-26
 * description : 종합 문제
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Verify01 {
    public static void main(String[] args) {
        /**
         * 1)
         * 문자열 반복해서 출력하기
         * 입력 : string 5
         * 출력 : stringstringstringstringstring
         */
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();    // 1 단어 입력 (string)
//        int num    = scanner.nextInt(); // 1 정수      (5)
//
////     1) string 문자열을 5번 반복 + 줄바꿈 없이(print())
//        for (int i = 0; i < num; i++) {
//            System.out.print(str);
//
//        }

        /**
         * 2) *
         * 대소문자 바꿔서 출력하기
         * 입력 : aBcDeFg
         * 출력 : AbCdEfG
         * TODO: 문자열.charAt(인덱스번호)
         * TODO: 문자열.toUpperCase() : 대문자 바꾸기
         * TODO: 문자열.toLowerCase() : 소문자 바꾸기
         */
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();   // aBcDeFg
//
////      str.length() : 문자열의 길이를 가져오는 함수
//        for (int i = 0; i < str.length(); i++) {
////          String.valueOf() : 정수, char, 실수 => 문자열 변환
//            char  temp = str.charAt(i); // char 자료형 내보내기가 됨
////          String : 문자열 자료형 => equals, toLowerCase()
//            String str2 =  String.valueOf(temp);
//
////          i=0 일때 str2 = "a" == (str2.toLowerCase() : "a") : true
////          i=1 일때 str2 = "B" == (str2.toLowerCase() : "b") : false
//            if(str2.equals(str2.toLowerCase()) == true) {
////                대문자 바꾸서 바로 출력(줄바꿈없이) : print()
////                str2 = "a" => str2.toUpperCase() : "A"
//                System.out.print(str2.toUpperCase());
//            } else {
////                소문자 바꾸기 바로 출력 : print()
////                str2 = "B" => str2.toLowerCase() : "b"
//                System.out.println(str2.toLowerCase());
//            }
//        }
        /**
         * 3)
         * 문자열 돌리기
         * 입력 : abcde
         * 출력 :
         * a
         * b
         * c
         * d
         * e
         */
//        문자열.charAt(인덱스번호) : 문자 1개씩 뽑기 (char 자료형)
//      1) 입력값(문자열)을 문자 1개씩 뽑아서 줄바꿈해서 차례로 출력하기(반복문)
//        Scanner scanner = new Scanner(System.in);
//        String first = scanner.next();  // 1개 단어 : abcde

//        for (int i = 0; i < 5; i++) {
//            char temp = first.charAt(i);    // 0번의 문자
//            바로 출력 (줄바꿈해서)
//            System.out.println(temp);
//        }

        /**
         * 덧셈식 출력하기
         * 입력 : 4 5
         * 출력 : 4 + 5 = 9
         */
//        Scanner scan = new Scanner(System.in);
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int sum = num1 + num2;
//        System.out.println(num1 + " + " + num2 + " = " + sum);

        /** 5)
         * 문자열 붙여서 출력하기
         * 입력 : apple pen
         * 출력 : applepen
         */
//        Scanner scan = new Scanner(System.in);
//        String str1 = scan.next();
//        String str2 = scan.next();
//        System.out.println(str1 + str2);

        /** 6)
         * 홀짝 구분하기
         * 입력 : 100
         * 출력 : 100 is even
         * 입력 2 : 1
         * 출력 2 : 1 is odd
         */
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        if (num % 2 == 0){
//            System.out.println(num + " is even");
//        } else {
//            System.out.println(num + " is odd");
//        }

        /** 7)
         * n의 배수
         * 정수 num과 n이 매개 변수로 주어질 때,
         * num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 출력하세요
         *
         *  입력  98 2
         *  결과   1
         */
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        int n = scan.nextInt();
//        if (num % n == 0){
//            System.out.println("1");
//        }else{
//            System.out.println("0");
//        }

        /**
         * 공배수
         * 정수 number와 n, m이 주어집니다.
         * number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 출력하세요
         *
         * 입력 60 2 3
         * 결과 1
         */
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        int n = scan.nextInt();
//        int m = scan.nextInt();
//        if (number % n == 0 && number % m == 0) {
//            System.out.println("1");
//        } else {
//            System.out.println("0");
//        }

        /** 9)
         * flag에 따라 다른 값 반환하기
         * 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
         * flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
         *
         * 입력 -4 7 true
         * 결과  3
         */
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        boolean flag = scan.nextBoolean();
//        if (flag == true) {
//            System.out.println(a + b);
//        } else if (flag == false) {
//            System.out.println(a - b);
//        }

        /**
         *  10) 두수 의 최대값 구하세요
         *  입력 : 10 100
         *  출력 : 100
         */
        //        TODO: 1) 풀이
//        힌트 : 1) 10 < 20 -> min = 10,(참) 조건문 # 1
//               2) 아니라면 -> min = 20
//              3) min(10) < 30 비교 -> min 을 출력 : 조건문 #2
//              4) 아니라면  -> 30을 출력
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();   // 10
//        int num2 = scanner.nextInt();  // 20
//        int num3 = scanner.nextInt();  // 30
//        int min = 0;                     // 최소값을 저장할 변수
//
////        1) 두수 판단 : 최소값 찾기
//        if (num < num2) {
//            min = num;
//        } else {
//            min = num2;
//        }
//
////        2) min 과 num3 비교 : 최소값 찾기
//        if (min < num3) {
//            System.out.println(min); // 세수의 최소값
//        } else {
//            System.out.println(num3); // 세수의 최소값
//        }
//        TODO: 2) 풀이
//        Scanner scan = new Scanner(System.in);
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        if (num1 > num2){
//            System.out.println(num1);
//        }else {
//            System.out.println(num2);
//        }

        /**
         * 11) 세수의 최소값 구하세요
         * 입력 : 10 20 30
         * 출력 : 10
         */
        //        TODO: 수학함수 : Math.max(값, 값2), Math.min(값, 값2)
//        TODO: 1) 풀이
//        힌트 : 1) 10 < 20 -> min = 10,(참) 조건문 # 1
//               2) 아니라면 -> min = 20
//              3) min(10) < 30 비교 -> min 을 출력 : 조건문 #2
//              4) 아니라면  -> 30을 출력
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();   // 10
//        int num2 = scanner.nextInt();  // 20
//        int num3 = scanner.nextInt();  // 30
//        int min = 0;                     // 최소값을 저장할 변수
//
////        1) 두수 판단 : 최소값 찾기
//        if (num < num2) {
//            min = num;
//        } else {
//            min = num2;
//        }
//
////        2) min 과 num3 비교 : 최소값 찾기
//        if (min < num3) {
//            System.out.println(min); // 세수의 최소값
//        } else {
//            System.out.println(num3); // 세수의 최소값
//        }

//        TODO: 2) Math.min()
//        min = Math.min(num, num2); // 두수 최소값
//        System.out.println(Math.min(min, num3)); // 세수의 최소값

//        TODO: 3)
//        Scanner scan = new Scanner(System.in);
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int num3 = scan.nextInt();
//        if (num1 < num2 && num1 < num3) {
//            System.out.println(num1);
//        } else if (num2 < num1 && num2 < num3) {
//            System.out.println(num2);
//        } else if (num3 < num1 && num3 < num2){
//            System.out.println(num3);
//        }

        /**
         * 12) 서로 다른 주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.
         * 단, n, m은 10이하의 자연수
         * 입력 : 2 3
         * 출력 :
         * 1 1
         * 1 2
         * 1 3
         * 2 1
         * 2 2
         * 2 3
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}







