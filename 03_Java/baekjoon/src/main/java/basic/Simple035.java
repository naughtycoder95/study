package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple035
 * author : GGG
 * date : 2024-01-29
 * description : 10810 공 넣기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         GGG          최초 생성
 */
public class Simple035 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int basket = scan.nextInt();        // 바구니 갯수
        int ball = scan.nextInt();          // 공 던질 횟수
        int[] arrBasket = new int[basket];  // 바구니 배열
        for (int i = 0; i < ball; i++) {
            int start = scan.nextInt()-1;   // 시작 바구니
            int end = scan.nextInt();       // 끝 바구니
            int ballnum = scan.nextInt();   // 공 번호
//            각 바구니에 들어간 공 번호 구하기
            for (int j = start; j < end; j++) {
                arrBasket[j] = ballnum;
            }
        }
        for (int i = 0; i < basket; i++) {          // 바구니에 들어간 공 번호 확인하기
            System.out.print(arrBasket[i] + " ");
        }
    }
}
