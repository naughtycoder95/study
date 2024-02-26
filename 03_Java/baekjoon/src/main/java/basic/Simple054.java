package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple054
 * author : GGG
 * date : 2024-01-31
 * description : 2444 별 찍기 - 7
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class Simple054 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

//        TODO: 규칙 1) (2 × N - 1)행이 만들어짐
//              규칙 2) 공백이 (N - 1)개부터 0개까지 각 행마다 1개씩 줄어듦
//              규칙 3) 별이 1개부터 N행까지 각 행마다 2개씩 늘어남 (1, 3, 5, 7, 9 ...)
//              규칙 4) 공백이 0개가 되면 다시 (N - 1)개가 될때까지 각 행마다 1개씩 늘어남
//              규칙 5) 별이 (2 × N - 1)개가 되면 1개가 될때까지 각 행마다 2개씩 줄어듦

//        TODO: N행까지 별이 늘어나면서 출력하는 반복문 1개를 만들고 (N-1)행까지 별이 줄어들면서 출력하는 반복문을 만든다
//          힌트 : 바깥 반복문만 늘어날때 정방향, 줄어들때 역방향으로 반복시키고 안쪽 반복문은 동일하게 사용

//        N행까지 별이 늘어나면서 출력되게 만들기
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {         // 규칙 2
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {     // 규칙 3
                System.out.print("*");
            }
            System.out.println();
        }

//        (N - 1)행까지 별이 줄어들면서 출력되게 만들기
        for (int i = N - 1; i >= 0; i--) {            // 역순 반복
//            33행 ~ 39행 똑같음
            for (int j = 0; j < N - i; j++) {         // 규칙 4
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {     // 규칙 5
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
