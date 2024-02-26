package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple029
 * author : GGG
 * date : 2024-01-26
 * description : 2439 별 찍기 - 2
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple029 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for(int i = 1; i <= N; i++) {		// 행 반복
            for(int j = 1; j <= N - i; j++){	// 공백 반복
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){	// 별 반복
                System.out.print("*");
            }
            System.out.println();		// 줄 바꿈
        }
    }
}
