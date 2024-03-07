package basic02;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple36
 * author : kimtaewan
 * date : 3/7/24
 * description : 14581 팬들에게 둘러싸인 홍준
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 3/7/24         kimtaewan          최초 생성
 */
public class Simple36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        String imoticon = ":fan::fan::fan:\n" +
                ":fan::" + id + "::fan:\n" +
                ":fan::fan::fan:";
        System.out.println(imoticon);
    }
}
