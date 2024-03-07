package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : SImple44
 * author : kimtaewan
 * date : 2024-03-07
 * description : 10808 알파벳 개수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07         kimtaewan          최초 생성
 */
public class Simple43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int[] arr = new int[26];                    // 알파벳 배열
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 97]++;                // 아스키 코드로 계산
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
