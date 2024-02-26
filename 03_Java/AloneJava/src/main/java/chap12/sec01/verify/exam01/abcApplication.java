package chap12.sec01.verify;

import java.util.Scanner;

/**
 * packageName : chap12.sec01.verify
 * fileName : abcApplication
 * author : GGG
 * date : 2024-02-15
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class abcApplication {
    public static void main(String[] args) {
// TODO: 연습문제) 1407 : 문자열 출력하기 1
//    길이(글자수)가 100이하인 문자열을 입력받아 공백을 제거하고 출력하시오.
//     힌트 : 문자열.split(), 문자열.replace(), scanner.next()
//           Scanner scanner = new Scanner(System.in);
//    입력 :
//       abC Def gh
//    출력:
//       abCDefgh

//        TODO: 1) 풀이
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();     // 1단어 입력(공백기준) abC
//        String str2 = scanner.next();   // 2단어 입력(공백기준)  Def
//        String str3 = scanner.next();   // 2단어 입력(공백기준)  gh
//
//        System.out.println(str + str2 + str3);

//        TODO: 2) 풀이 : split()
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();  // 1줄 입력 abC Def gh
        String[] result = str.split(" ");

//      배열 출력 : 반복문 사용
        for (int i = 0; i < 3; i++) {
            System.out.print(result[i]);
        }
    }
}