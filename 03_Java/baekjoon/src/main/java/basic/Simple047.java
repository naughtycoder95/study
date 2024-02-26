package basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple047
 * author : GGG
 * date : 2024-01-31
 * description : 2675 문자열 반복
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class Simple047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> P = new ArrayList<>();            // 새로 만든 문자열 저장할 배열
        int T = scan.nextInt();                             // 테스트 횟수 입력받기

        for (int i = 0; i < T; i++) {                       // 테스트 횟수 만큼 반복 (행)
            int R = scan.nextInt();                         // 각 문자를 반복할 횟수 입력받기
            String S = scan.next();                         // 문자열 입력받기
            String result = "";                             // 반복한 문자를 문자열로 만들 저장공간

            for (int j = 0; j < S.length(); j++) {          // 각 문자 반복 (문자열 길이만큼 반복)
                for (int k = 0; k < R; k++) {               // 반복할 횟수만큼 반복
                    result = result + S.charAt(j);          // 반복한 문자를 문자열로 저장
                }
            }
            P.add(result);                                  // 새로 만든 문자열을 배열에 저장
        }

        for (int i = 0; i < P.size(); i++) {                // 새로 만든 문자열이 저장된 배열 출력
            System.out.println(P.get(i));
        }
    }
}
