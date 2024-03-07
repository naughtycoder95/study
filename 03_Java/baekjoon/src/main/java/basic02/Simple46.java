package basic02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple47
 * author : kimtaewan
 * date : 2024-03-07
 * description : 2752 세수정렬
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07         kimtaewan          최초 생성
 */
public class Simple46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
