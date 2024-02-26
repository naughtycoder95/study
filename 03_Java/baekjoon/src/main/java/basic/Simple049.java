package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple049
 * author : GGG
 * date : 2024-01-31
 * description : 2908 상수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class Simple049 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();


        String num1 = "";                                         // 거꾸로 바뀐 숫자 저장할 변수1
        String num2 = "";                                         // 거꾸로 바뀐 숫자 저장할 변수2

        for (int i = str1.length()-1; i >= 0; i--) {              // 배열을 역순으로 만드는 반복문
            num1 = num1 + String.valueOf(str1.charAt(i));         // charAt = char, char -> String으로 변환 후 num1에 저장
        }
        for (int i = str2.length()-1; i >= 0; i--) {              // 배열을 역순으로 만드는 반복문
            num2 = num2 + String.valueOf(str2.charAt(i));;        // charAt = char, char -> String으로 변환 후 num2에 저장
        }

        if (Integer.parseInt(num1) > Integer.parseInt(num2) ) {   // String -> Int 변환 후 숫자 비교
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
