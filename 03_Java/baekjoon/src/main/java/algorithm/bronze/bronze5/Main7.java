package algorithm.bronze.bronze5;

import java.util.Scanner;

/**
 * packageName : algorithm.bronze.bronze5
 * fileName : Main7
 * author : kimtaewan
 * date : 2024-06-04
 * description : 9498 시험 성적
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-04         kimtaewan          최초 생성
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 90) {
            System.out.println("A");
        } else if (n >= 80 && n < 90) {
            System.out.println("B");
        } else if (n >= 70 && n < 80) {
            System.out.println("C");
        } else if (n >= 60 && n < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
