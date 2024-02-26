package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple11
 * author : GGG
 * date : 2024-02-08
 * description : 2744 대소문자 바꾸기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Simple11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);                 // i값 저장할 변수
            if (Character.isLowerCase(c)) {         // isLowerCase = 소문자 확인 함수 -> true, false 반환
                c = Character.toUpperCase(c);       // toUpperCase = 대문자 변경 함수
            } else if (Character.isUpperCase(c)) {  // isUpperCase = 대문자 확인 함수 -> true, false 반환
                c = Character.toLowerCase(c);       // toLowerCase = 소문자 변경 함수
            }
            System.out.print(c);
        }
    }
}
