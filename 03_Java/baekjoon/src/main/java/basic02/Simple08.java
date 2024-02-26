package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple08
 * author : GGG
 * date : 2024-02-07
 * description : 2420 사파리월드
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class Simple08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextInt();
        long M = scanner.nextInt();
        System.out.println(Math.abs(N-M));          // Math.abs => 절댓값 반환 함수
    }
}
