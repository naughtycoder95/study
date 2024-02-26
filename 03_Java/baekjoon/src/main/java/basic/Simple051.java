package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple051
 * author : GGG
 * date : 2024-01-31
 * description : 11718 그대로 출력하기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class Simple051 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {                    // 입력값이 없으면 정지, 입력값이 있을때만 실행
            String str = scan.nextLine();
            System.out.println(str);
        }
    }
}
