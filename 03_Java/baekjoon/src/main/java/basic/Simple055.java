package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple055
 * author : GGG
 * date : 2024-02-01
 * description : 10988 팰린드롬인지 확인하기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         GGG          최초 생성
 */
public class Simple055 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

//        int check = 0;
//        int compare = 0;
//        for (int i = 0; i < str.length(); i++) {          // 중복 검사
//            for (int j = 0; j < i; j++) {
//                if (str.charAt(i) == str.charAt(j)) {     // 중복 갯수 카운트
//                    check++;
//                }
//            }
//        }
//        if (str.length() % 2 == 1) {                      // 입력받은 문자열이 홀수일때
//            compare = (str.length() - 1) / 2;
//        } else {                                          // 입력받은 문자열이 짝수일때
//            compare = str.length() / 2;
//        }
//        if (check == compare) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }


        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result = result + str.charAt(i);
        }
        if (str.equals(result)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
