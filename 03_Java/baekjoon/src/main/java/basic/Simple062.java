package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple62
 * author : GGG
 * date : 2024-02-16
 * description : 10798 세로읽기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-16         GGG          최초 생성
 */
public class Simple062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] list = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String str = scanner.next();
            for (int j = 0; j < str.length(); j++) {
                list[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (list[j][i] == '\0') {           // '\0' = char 자료형 null 표기
                    continue;
                } else {
                    System.out.print(list[j][i]);
                }
            }
        }
    }
}
