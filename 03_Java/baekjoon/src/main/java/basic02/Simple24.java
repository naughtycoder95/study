package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple24
 * author : GGG
 * date : 2024-02-08
 * description : 홍익대학교
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Simple24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int var = year - 1946;
        System.out.println(var);
    }
}
