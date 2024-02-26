package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple045
 * author : GGG
 * date : 2024-01-30
 * description : 11720 숫자의 합
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();        // 입력될 숫자의 자릿수
        String str = scan.next();           // 문자열로 숫자 입력받기
        int sum = 0;                        // 총합 저장 공간
        for (int i = 0; i < length; i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));     // 문자열[i]를 숫자열로 변환
        }
        System.out.println(sum);
    }
}
