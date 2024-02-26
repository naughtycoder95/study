package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple031
 * author : GGG
 * date : 2024-01-29
 * description : 10807 개수 세기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         GGG          최초 생성
 */
public class Simple031 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();      // 배열의 갯수
        int[] arrNum = new int[test];   // 배열
        int two = 0;                    // 찾은 수의 갯수를 저장할 값

//        배열에 입력값 저장하기
        for (int i = 0; i < arrNum.length; i++) {
            int num = scan.nextInt();
            arrNum[i] = num;
        }

//        배열에서 찾고싶은 수의 갯수 계산하기
        int count = scan.nextInt();
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] == count) {
                two++;
            }
        }
        System.out.println(two);
    }
}
