package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple064
 * author : kimtaewan
 * date : 2024-06-04
 * description : 2745 진법변환
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-04         kimtaewan          최초 생성
 */
public class Simple064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();   // 수
        int b = sc.nextInt();   // 진법

        long result = 0;    // 결과 저장할 변수
        int idx = 0;        // 제곱 변수
        int num = 0;        // 각 자리 숫자를 10진수로 변환할 변수

        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);

            if (c >= '0' && c <= '9') {
                num = c - '0';      //0~9 그대로 출력
            } else {
                num = c - 55;       //A~Z 숫자로 변경
            }

            result += num * Math.pow(b, idx++);
        }
        System.out.println(result);
    }
}
