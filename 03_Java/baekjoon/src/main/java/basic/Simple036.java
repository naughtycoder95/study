package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple036
 * author : GGG
 * date : 2024-01-29
 * description : 10813 공 바꾸기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         GGG          최초 생성
 */
public class Simple036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int basket = scan.nextInt();        // 바구니 갯수
        int change = scan.nextInt();        // 교환 횟수
        int[] arrBasket = new int[basket];  // 바구니 배열

        for (int i = 0; i < basket; i++) {  // 바구니가 index[0]부터 시작
            arrBasket[i] = i+1;             // 공 번호 = index + 1
        }

        for (int i = 0; i < change; i++) {
            int first = scan.nextInt()-1;       // 교환 바구니 1번 (index는 [0]부터 시작하니 -1)
            int second = scan.nextInt()-1;      // 교환 바구니 2번 (index는 [0]부터 시작하니 -1)
            // swap : temp(빈공간)에 바뀌기 전 first값 저장
            int temp =  arrBasket[first];
            arrBasket[first] = arrBasket[second];        //   교환된 1번 바구니
            arrBasket[second] = temp;                    //   교환된 2번 바구니
        }

        for (int i = 0; i < basket; i++) {
            System.out.print(arrBasket[i] + " ");        // 공 꺼내기
        }
    }
}
