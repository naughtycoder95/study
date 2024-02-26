package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : GGG
 * date : 2024-01-30
 * description : 10811 바구니 뒤집기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple039 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();                         // 바구니 갯수
        int change = scan.nextInt();                    // 바꿀 횟수
        int[] basket = new int[n];                      // 바구니 배열

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;                          // 바구니 번호
        }

        for (int i = 0; i < change; i++) {
            int start = scan.nextInt() - 1;             // 바꾸기 시작할 바구니 번호 (-1 = 인덱스 번호)
            int end = scan.nextInt() - 1;               // 바꾸기 끝낼 바구니 번호 (-1 = 인덱스 번호)

            for (; start < end; start++, end--) {       // 시작 번호가 끝 번호와 같을때까지 시작 번호++ & 끝 번호-- 반복
                int temp = basket[start];               // 시작 바구니 번호 저장
                basket[start] = basket[end];            // 시작 번호 -> 끝 번호 바꾸기
                basket[end] = temp;                     // 끝 번호-- -> temp에 저장한 시작 번호 바꾸기
            }
//            *for 대신 while을 사용할 경우*
//            while (start < end) {                     // 시작 번호가 끝 번호와 같아지기 전까지 반복
//                int temp = basket[start];             // 시작 바구니 번호 저장
//                basket[start] = basket[end];          // 시작 번호 -> 끝 번호 바꾸기
//                basket[end] = temp;                   // 끝 번호-- -> temp에 저장한 시작 번호 바꾸기
//                start++;                              // 시작 번호 계속 늘리기
//                end--;                                // 끝 번호 계속 줄이기
//            }
        }
        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}



