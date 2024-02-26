package basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple030
 * author : GGG
 * date : 2024-01-29
 * description : 10952 A+B - 5
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         GGG          최초 생성
 */
public class Simple030 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arraySum = new ArrayList<>();   // 배열(향상된) , 크기몰라도 사용가능
        while (true) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int sum = num1 + num2;
            if (num1 == 0 && num2 == 0) {
                break;
            }
            arraySum.add(sum);          // sum 배열값 넣기
//            System.out.println(sum);
        }

//      반복문 출력
        for (int i = 0; i < arraySum.size(); i++) {
            System.out.println(arraySum.get(i));
        }
    }
}
