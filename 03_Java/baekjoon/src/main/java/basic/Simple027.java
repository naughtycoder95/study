package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple027
 * author : GGG
 * date : 2024-01-26
 * description : 11022 A+B - 8
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Simple027 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        int arrSum[] = new int[test];
        int arrNum1[] = new int[test];
        int arrNum2[] = new int[test];
        for (int i = 0; i < test; i++) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            arrNum1[i] = num1;
            arrNum2[i] = num2;
            arrSum[i] = num1 + num2;
        }
        for (int i = 0; i < test; i++) {
            System.out.println("Case #" + (i+1) + ": " + arrNum1[i] + " + " + arrNum2[i] + " = " + arrSum[i]);
        }
    }
}