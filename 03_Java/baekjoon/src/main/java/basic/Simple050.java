package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple050
 * author : GGG
 * date : 2024-01-31
 * description : 5622 다이얼
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class Simple050 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String abc = scan.next();                                           // 문자 입력받기
        int num = 0;                                                        // 총합 저장변수

        for (int i = 0; i < abc.length(); i++) {                            // 입력받은 문자 길이만큼 반복
            if (abc.charAt(i) >= 'A' && abc.charAt(i) <= 'C') {             // 문자열 인덱스로 변환해서 비교
                num = num + 2 + 1;
            } else if (abc.charAt(i) >= 'D' && abc.charAt(i) <= 'F') {
                num = num + 2 + 2;
            } else if (abc.charAt(i) >= 'G' && abc.charAt(i) <= 'I') {
                num = num + 2 + 3;
            } else if (abc.charAt(i) >= 'J' && abc.charAt(i) <= 'L') {
                num = num + 2 + 4;
            } else if (abc.charAt(i) >= 'M' && abc.charAt(i) <= 'O') {
                num = num + 2 + 5;
            } else if (abc.charAt(i) >= 'P' && abc.charAt(i) <= 'S') {
                num = num + 2 + 6;
            } else if (abc.charAt(i) >= 'T' && abc.charAt(i) <= 'V') {
                num = num + 2 + 7;
            } else if (abc.charAt(i) >= 'W' && abc.charAt(i) <= 'Z') {
                num = num + 2 + 8;
            }

//        *if 대신 switch을 사용할 경우*
//            switch (abc.charAt(i)) {
//                case 'A' : case 'B': case 'C' :
//                    num = num + 2 + 1;
//                    break;
//
//                case 'D' : case 'E': case 'F' :
//                    num = num + 2 + 2;
//                    break;
//
//                case 'G' : case 'H': case 'I' :
//                    num = num + 2 + 3;
//                    break;
//
//                case 'J' : case 'K': case 'L' :
//                    num = num + 2 + 4;
//                    break;
//
//                case 'M' : case 'N': case 'O' :
//                    num = num + 2 + 5;
//                    break;
//
//                case 'P' : case 'Q': case 'R' : case 'S' :
//                    num = num + 2 + 6;
//                    break;
//
//                case 'T' : case 'U': case 'V' :
//                    num = num + 2 + 7;
//                    break;
//
//                case 'W' : case 'X': case 'Y' : case 'Z' :
//                    num = num + 2 + 8;
//                    break;
//            }
        }
        System.out.println(num);
    }
}
