package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple038
 * author : GGG
 * date : 2024-01-30
 * description : 3052 나머지
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean equal;                                  // 중복값 확인
        int[] arr = new int[10];                        // 배열
        int count = 0;                                  // 중복값 갯수 저장
        for (int i = 0; i < arr.length; i++) {
            int num = scan.nextInt();
            arr[i] = num % 42;                          // 42로 나눈 값을 배열에 저장
        }
        for (int i = 0; i < arr.length; i++) {          // 비교용 arr 1번
            equal = true;
            for (int j = i+1; j < arr.length; j++) {    // 비교용 arr 2번 (i + 1 = j)
                if (arr[i] == arr[j]){
                    equal = false;                      // 비교값이 중복되면 거짓
                    break;
                }
            }
            if (equal == true){                         // 비교값이 참 = 중복 아님
                count++;                                // 카운트
            }
        }
        System.out.println(count);
    }
}
