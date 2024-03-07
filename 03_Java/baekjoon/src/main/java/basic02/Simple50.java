package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple50
 * author : kimtaewan
 * date : 2024-03-07
 * description : 1264 모음의 개수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07         kimtaewan          최초 생성
 */
public class Simple50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 255; i++) {
            String str = scanner.nextLine();
            if (str.equals("#")) {
                break;
            }
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                str = str.toLowerCase();
                if (str.charAt(j) == 'a') {
                    count++;
                } else if (str.charAt(j) == 'e') {
                    count++;
                } else if (str.charAt(j) == 'i') {
                    count++;
                } else if (str.charAt(j) == 'o') {
                    count++;
                } else if (str.charAt(j) == 'u') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
