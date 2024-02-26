package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple053
 * author : GGG
 * date : 2024-01-31
 * description : 3003 킹, 퀸, 룩, 비숍, 나이트, 폰
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class Simple053 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] black = {1, 1, 2, 2, 2, 8};
        int[] white = new int[6];
        int[] piece = new int[6];

        for (int i = 0; i < black.length; i++) {
            int chess = scan.nextInt();
            white[i] = chess;
        }
        for (int i = 0; i < 6; i++) {
            if (black[i] < white[i]) {
                piece[i] = black[i] - white[i];
            } else if (black[i] > white[i]) {
                piece[i] = black[i] - white[i];
            } else {
                piece[i] = 0;
            }
        }
        for (int i = 0; i < piece.length; i++) {
            System.out.print(piece[i] + " ");
        }
    }
}
