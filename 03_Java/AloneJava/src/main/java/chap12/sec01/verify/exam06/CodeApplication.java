package chap12.sec01.verify.exam06;

import java.util.Scanner;

/**
 * packageName : chap12.sec01.verify.exam06
 * fileName : CodeApplication
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
public class CodeApplication {
    public static void main(String[] args) {
//  TODO: 연습문제) 1408 : 암호 처리
//    인터넷 서비스들은 대부분 아이디와 패스워드(password)를 이용한다.
//    이때 사용되는 패스워드는 여러 가지 방법으로 암호화되어 저장된다.
//    [어떤 인터넷 서비스의 2가지 암호화 방법]
//    - 입력받은 문자의 ASCII 코드값 + 2
//    - (입력받은 문자의 ASCII 코드값 * 7) % 80 + 48
//    사용자의 패스워드를 2가지 방법으로 암호화한 결과를 출력하는 프로그램을 작성하시오.
//    힌트 : charAt()
//    입력 : TEST
//    결과 :
//          VGUV
//          L3EL

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            System.out.print((char) (temp + 2));
        }

        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            System.out.print((char) ((temp * 7) % 80 + 48));
        }
    }
}
