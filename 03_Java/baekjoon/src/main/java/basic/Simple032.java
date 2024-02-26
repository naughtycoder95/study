package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple032
 * author : GGG
 * date : 2024-01-29
 * description : 10871 X보다 작은 수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         GGG          최초 생성
 */
public class Simple032 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();                  // 숫자 입력받을 횟수
        int compare = scan.nextInt();               // 비교대상 숫자
        for (int i = 0; i < test; i++) {
            int num = scan.nextInt();               // 숫자 입력받기
            if (num < compare){                     // 입력받은 숫자가 비교대상 숫자보다 작을 경우
                System.out.print(num + " ");        // 출력
            }
        }
    }
}
