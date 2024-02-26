package chap04;

import java.util.Scanner;

/**
 * packageName : chap04
 * fileName : Sec01
 * author : GGG
 * date : 2024-01-25
 * description : 조건문
 * 요약 :
 *      사용법 : if(조건식){실행문}
 *              else if(조건식2){실행문2}
 *              else{실행문3}
 *      => 조건식 참이면 실행문 실행
 *      => 조건식2 참이면 실행문2 실행
 *      => 모두 거짓이면 실행문3 실행
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-25         GGG          최초 생성
 */
public class Sec01 {
    public static void main(String[] args) {
//      TODO: 조건문 예제
//        int score = 93; // 초기값

//      예제 1) score 90 보다 크거나 같으면 90보다 큽니다.
//             등급은 A입니다.
//        if(score >= 90) {
//            System.out.println("90보다 큽니다.");
//            System.out.println("등급은 A입니다. ");
//        }

//      예제 2) score 90 보다 크거나 같으면 90보다 큽니다.
//             등급은 A입니다.
//              score < 90 이면 점수가 90보다 작습니다.
//              등급은 B입니다.
//        if(score >= 90) {
//            System.out.println("90보다 큽니다.");
//            System.out.println("등급은 A입니다. ");
//        } else {
//            System.out.println("점수가 90보다 작습니다.");
//            System.out.println("등급은 B입니다.");

//        }
//
//      예제 3) score 90 보다 크면 90보다 큽니다.
//             등급은 A입니다.
//             score 90 이면 90입니다.
//                 등급은 B입니다.
//              score < 90 이면 점수가 90보다 작습니다.
//              등급은 C입니다.
//        if(score > 90) {
//            System.out.println("90보다 큽니다.");
//            System.out.println("등급은 A입니다. ");
//        } else if(score == 90) {
//            System.out.println("90입니다.");
//            System.out.println("등급은 B입니다. ");
//        } else {
//            System.out.println("90보다 작습니다.");
//            System.out.println("등급은 C입니다.");
//        }

//     TODO: 연습 1)  num2 != 0 이면    num1/num2 결과 출력
//                   num2 == 0 이면    "무한대" 출력
//        int num1 = 3;  // 초기값
//        int num2 = 0;  // 초기값
//
//        if(num2 != 0) {
//            System.out.println((double) num1/(double) num2);
//        } else {
//            System.out.println("무한대");
//        }

//     TODO: 연습 2) 아이디와 패스워드를 각각 입력받아 아이디가 "java"가 아니면
//        "로그인 실패:아이디가 존재하지 않음" 출력
//        아이디가 "java"이면 패스워드를 체크해서 12345이면 "로그인 성공" 출력하고
//        패스워드가 12345가 아니면 "로그인 실패:패스워드가 틀림" 출력하세요.
//        힌트 : if문 2번 사용 : 중첩 if문,
//        힌트 : 문자열비교 : 문자열.equals(문자열2) == true
//        입력 : java2
//        출력 : 로그인 실패:아이디가 존재하지 않음
//      비교연산자  : ==, !=, >, < => 정수, 실수, 1문자(char) 사용가능
//      문자열 비교 :  문자열.equals(문자열2) == true
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();   // 입력 1개

//        1) java 인지 판단
//        if(name.equals("java") == true) {
//        2) password 입력받아 12345 인지 판단
//            int password = scanner.nextInt();
//            if(password == 12345) {
//                System.out.println("로그인 성공");
//            } else {
//                System.out.println("로그인 실패:패스워드가 틀림");
//            }
//        } else {
//            System.out.println("로그인 실패:아이디가 존재하지 않음");
//        }

//      TODO: 연습 3) A 또는 a이면 "우수 회원입니다. " 출력
//                    B 또는 b이면 "일반 회원입니다." 출력
//                    그 외는 "손님입니다" 출력하세요
//        입력 : A
//        출력 : 우수 회원입니다.
//        힌트 : 논리 연산자(||, &&) , 문자열.equals(문자열2) == true
//          조건식 샘플 : (문자열.equals("A") == true || 문자열.equals("a")
//        Scanner scanner = new Scanner(System.in);
//        String grade = scanner.next(); // 1단어 입력

//        if(grade.equals("A") == true || grade.equals("a") == true) {
//            System.out.println("우수 회원입니다.");
//        } else if(grade.equals("B") == true || grade.equals("b") == true) {
//            System.out.println("일반 회원입니다.");
//        } else {
//            System.out.println("손님입니다");
//        }

//      TODO: 예제 ) 랜덤 함수 : Math.random()
//           random() : 0 ~ 1 사이의 실수를 뽑는 함수 : 0 <= x < 1
//           => 1 ~ 10까지 랜덤 정수로 변경
//           1) 0.0 <= Math.random() < 1.0
//           2) 0.0 * 10 <= Math.random() * 10 < 1.0 * 10
//           3) (int)0.0 <= (int)(Math.random() * 10) < (int)10.0
//           4) (int)0 <= (int)(Math.random() * 10) < (int)10
//           5) (int)0 + 1 <= (int)(Math.random() * 10) + 1 < (int)10 + 1
//            => 1 <= (int)(Math.random() * 10) + 1 < 11
//            => 정리 : (int)(Math.random() * 끝숫자) + 시작숫자
//        예제 ) 1 ~ 6 까지 랜덤한 수를 뽑아서 그 수를 출력하세요
//        int num = (int)(Math.random() * 6) + 1; // 1 ~ 6까지 랜덤 정수

//        if(num == 1) {
//            System.out.println(1);
//        } else if(num == 2) {
//            System.out.println(2);
//        }else if(num == 3) {
//            System.out.println(3);
//        }else if(num == 4) {
//            System.out.println(4);
//        }else if(num == 5) {
//            System.out.println(5);
//        }else {
//            System.out.println(6);
//        }

//     TODO: 다른 조건문) 참고) switch/case 문
//        예제 ) A 또는 a이면 "우수 회원입니다. " 출력
//                    B 또는 b이면 "일반 회원입니다." 출력
//                    그 외는 "손님입니다" 출력하세요
//        입력 : A
//        출력 : 우수 회원입니다.
//        사용법 : switch (변수) {
//                  case 값;
//                      실행문;
//                      break;
//                  ...
//                  default :
//                      실행문2;
//                      break;
//                }
//        => 변수 == 값 이면 실행문 실행되고, 모두 아니면 실행문2가 실행됨
        char grade = 'B';  // 초기값

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
                break;
        }
    }
}











