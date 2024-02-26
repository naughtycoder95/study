package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple026
 * author : GGG
 * date : 2024-01-26
 * description : 11021 A+B - 7
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple026 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        int arr[] = new int[test];
        for (int i = 0; i < test; i++) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            arr[i] = num1 + num2;
        }
        for (int i = 0; i < test; i++) {
            System.out.println("Case #" + (i+1) + ": " + arr[i]);
        }
    }
}
