package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple63
 * author : GGG
 * date : 2024-02-16
 * description : 2563 색종이
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-16         GGG          최초 생성
 */
public class Simple063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();                    // 색종이 수
        int[][] square = new int[100][100];             // 도화지
        int sum = 0;                                    // 색종이 넓이 변수

        for (int i = 0; i < num; i++) {                 // 색종이가 있는 도화지 칸에 1 넣기
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    square[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {                 // 색종이가 있는 도화지칸 더하기
            for (int j = 0; j < 100; j++) {
                if (square[i][j] == 1) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
