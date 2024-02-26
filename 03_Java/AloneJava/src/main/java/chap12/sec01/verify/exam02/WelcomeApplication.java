package chap12.sec01.verify.exam02;

import java.util.Scanner;

/**
 * packageName : chap12.sec01.verify.exam02
 * fileName : WelcomeApplication
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
public class WelcomeApplication {
    public static void main(String[] args) {
//  TODO: 연습문제) 1734 : welcome!
//    입력 : anaki
//    출력 : welcome! anaki
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String welcome = "welcome!";
        System.out.println(welcome + " " + str);
    }
}
