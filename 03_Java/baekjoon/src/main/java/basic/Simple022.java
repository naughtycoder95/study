package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple022
 * author : GGG
 * date : 2024-01-26
 * description : 10950 A+B - 3
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();         // 배열 갯수 입력받기
        int arr[] = new int[T];         // 배열 갯수 정의
        for (int i = 0; i < T; i++) {
            int num1 = scan.nextInt();  // 배열1 입력받기
            int num2 = scan.nextInt();  // 배열2 입력받기
            arr[i] = num1 + num2;       // 합 배열 만들기
        }
        for (int i = 0; i < T; i++) {
            System.out.println(arr[i]);
        }
    }
}
