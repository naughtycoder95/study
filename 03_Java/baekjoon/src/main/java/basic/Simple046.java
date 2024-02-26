package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple046
 * author : GGG
 * date : 2024-01-30
 * description : 10809 알파벳 찾기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[26];                    // 알파벳 위치 표시 배열
        for (int i = 0; i < 26; i++) {
            num[i] = -1;                            // 배열 초기값 -1
        }
        String S = scan.next();
        for (int i = 0; i < S.length(); i++) {      // S 문자열 길이만큼 반복
            char abc = S.charAt(i);                 // abc 에 S[i] 알파벳 저장

//          [abc - 'a'] (아스키 코드로 인덱스 번호 계산) == -1 (이미 위치가 저장되어 -1이 아닌 위치에 저장되면 안됨)
            if (num[abc - 'a'] == -1) {
                num[abc - 'a'] = i;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
