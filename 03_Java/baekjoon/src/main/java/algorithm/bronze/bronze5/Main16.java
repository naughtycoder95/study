package algorithm.bronze.bronze5;

import java.util.Scanner;

/**
 * packageName : algorithm.bronze.bronze5
 * fileName : Main
 * author : kimtaewan
 * date : 2024-06-05
 * description : 28113 정보섬의 대중교통
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-05         kimtaewan          최초 생성
 */
public class Main16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (n <= b && a == b) {
            System.out.println("Anything");
        } else if (n <= b && a > b) {
            System.out.println("Subway");
        } else {
            System.out.println("Bus");
        }
    }
}
