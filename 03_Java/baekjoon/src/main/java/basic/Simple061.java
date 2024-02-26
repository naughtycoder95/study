package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple61
 * author : GGG
 * date : 2024-02-16
 * description : 2566 최댓값
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-16         GGG          최초 생성
 */
public class Simple061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[9][9];                // 행렬 저장 변수
        int max = 0;                                // 최댓값 저장 변수
        int x = 0;                                  // 행 번호 저장 변수
        int y = 0;                                  // 열 번호 저장 변수

        for (int i = 0; i < 9; i++) {               // 행렬 값 저장
            for (int j = 0; j < 9; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 9; i++) {               // 최댓값 & 행렬번호 저장
            for (int j = 0; j < 9; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                } else if (max == 0) {              // 최댓값이 0일때 행렬의 모든 값은 0이므로 가장 첫번째 행렬번호 저장
                    x = 1;
                    y = 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
