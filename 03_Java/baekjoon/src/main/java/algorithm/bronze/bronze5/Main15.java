package algorithm.bronze.bronze5;

import java.util.Scanner;

/**
 * packageName : algorithm.bronze.bronze5
 * fileName : Main15
 * author : kimtaewan
 * date : 2024-06-05
 * description : 15727 조별과제를 하려는데 조장이 사라졌다
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-05         kimtaewan          최초 생성
 */
public class Main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = n / 5;
        if (n % 5 != 0) {
            result += 1;
        }
        System.out.println(result);
    }
}
