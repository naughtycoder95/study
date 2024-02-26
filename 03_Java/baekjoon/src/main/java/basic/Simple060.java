package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple060
 * author : GGG
 * date : 2024-02-02
 * description : 2738 행렬덧셈
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-02         GGG          최초 생성
 */
public class Simple060 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[][] A = new int[N][M];                      // A 행렬 변수
        int[][] B = new int[N][M];                      // B 행렬 변수
        int[][] sum = new int[N][M];                    // A + B 변수

        for (int i = 0; i < N; i++) {                   // A 행렬 값 저장
            for (int j = 0; j < M; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {                   // B 행렬 값 저장
            for (int j = 0; j < M; j++) {
                B[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {                   // A + B 값 저장
            for (int j = 0; j < M; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int i = 0; i < N; i++) {                   // A + B 값 출력
            for (int j = 0; j < M; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
