package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple034
 * author : GGG
 * date : 2024-01-29
 * description :2562 최댓값
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         GGG          최초 생성
 */
public class Simple034 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[9];                     // 자연수 9개 배열
        int max = 0;                                // 최댓값 저장공간
        int count = 0;                              // 자릿수 카운트 저장공간
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();                // 배열에 값 저장하기
            if (max < arr[i]){                      // 최댓값 구하기
                max = arr[i];
                count = i+1;                        // 최댓값 구하는 동안 반복된 횟수 = 자릿수 (인덱스 번호는 0부터여서 +1)
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
