package chap12.sec01.verify.exam05;

import java.util.Scanner;

/**
 * packageName : chap12.sec01.verify.exam05
 * fileName : NaverApplication
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
public class NaverApplication {
    public static void main(String[] args) {
//        주어진 알파벳이 N 또는 n 이면 "Naver D2",
//        아니라면 "Naver Whale"을 따옴표를 제외하고 출력한다.
//        입력 : N
//        출력 : Naver D2
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        if (str.equals("N") || str.equals("n")) {
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }
    }
}
