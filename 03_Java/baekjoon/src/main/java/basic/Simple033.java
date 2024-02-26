package basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple033
 * author : GGG
 * date : 2024-01-29
 * description : 10818 최소, 최대
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         GGG          최초 생성
 */
public class Simple033 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();                 // 배열 갯수
        int[] arr = new int[test];                 // 배열
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();               // 배열값
        }
        int max = arr[0];                          // 최댓값 (초기값 0 가능)
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {                    // 최댓값 구하기
                max = arr[i];
            }
        }
        int min = arr[0];                          // 최소값 (초기값 0 불가)
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {                    // 최소값 구하기 (초기값이 0일 경우 arr[i]보다 큰 수가 하나도 없어서 비교 불가)
                min = arr[i];
            }
        }
        System.out.print(min + " " + max);
    }
}
