package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple058
 * author : GGG
 * date : 2024-02-02
 * description : 1316 그룹 단어 체커
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-02         GGG          최초 생성
 */
public class Simple058 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();                                                 // 제시할 문자열의 수
        int count = N;                                                          // 제시된 문자열의 수
        for (int i = 0; i < N; i++) {                                           // 제시된 수만큼 반복
            String word = scan.next();                                          // 문자열 입력받기
            if (word.length() > 2) {                                            // 문자열 길이가 2보다 클 경우만 확인함
                Loop1:                                                          // 반복문 라벨링
                for (int j = 0; j < word.length(); j++) {                       // 문자열 길이만큼 반복
                    if (j > 0 && j < word.length() - 1) {                       // j가 첫 문자가 아니고 끝 문자보다 앞일때
                        if (word.charAt(j) != word.charAt(j + 1)) {             // j가 다음에 나올 문자와 다를때
                            for (int k = 0; k < j; k++) {                       // j 앞 문자 까지 반복
                                if (word.charAt(j + 1) == word.charAt(k)) {     // j 다음 글자를 j 앞 문자들과 중복인지 확인
                                    count--;                                    // 중복일 경우 제시된 수 -1
                                    break Loop1;                                // 바깥 반복문 종료하고 다음 문자열 확인
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
