package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple056
 * author : GGG
 * date : 2024-02-01
 * description : 1157 단어 공부
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         GGG          최초 생성
 */
public class Simple056 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next().toUpperCase();                // 입력받는 문자 대문자로 변환

        char[] abc = new char[26];                              // 알파벳 배열 만들기
        char a = 'A';
        for (int i = 0; i < abc.length; i++) {
            abc[i] = a;
            a++;
        }

        int[] count = new int[26];                              // 카운트 배열 만들기
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        int num = 0;                                            // 인덱스 번호 저장변수
        for (int i = 0; i < word.length(); i++) {               // 입력되는 문자의 각 알파벳 갯수를 카운트 배열에 저장
            for (int j = 0; j < abc.length; j++) {
                if (word.charAt(i) == abc[j]) {
                    num = j;
                    count[num] += 1;
                }
            }
        }

        int max = 0;                                            // 최대값 저장변수
        for (int i = 0; i < 26; i++) {                          // 카운트 배열에서 최댓값 구하기
            if (max < count[i]){
                max = count[i];
            }
        }

        int overlap = 0;                                        // 카운트 배열에서 중복되는 최댓값 갯수 저장변수
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < i; j++) {
                if (max == count[j] && max == count[i]){
                    overlap++;
                }
            }
        }

        if (overlap > 0){                               // 최대값이 중복인 경우 "?" 출력
            System.out.println("?");
        } else {                                        // 최대값이 1개인 경우
            for (int i = 0; i < 26; i++) {              // 최대값인 count의 [i]를 찾아서 abc의 [i]를 출력
                if (max == count[i]){
                    System.out.println(abc[i]);
                }
            }
        }
    }
}
