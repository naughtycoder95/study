package chap12.sec01.verify.exam04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.list;

/**
 * packageName : chap12.sec01.verify.exam04
 * fileName : UpperApplication
 * author : GGG
 * date : 2024-02-15
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class UpperApplication {
    public static void main(String[] args) {
//        대소문자 바꾸기 : 문자열.toLowerCase(), toUpperCase()
//        힌트 : 반복문, char temp = 문자열.charAt(i) => String.valueOf(temp)
//        입력 : WrongAnswer
//        출력 : wRONGaNSWER

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

//        TODO: 풀이 1
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String temp = String.valueOf(str.charAt(i));
            if (temp.equals(temp.toUpperCase())) {
                list.add(temp.toLowerCase());
            } else if (temp.equals(temp.toLowerCase())) {
                list.add(temp.toUpperCase());
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

//        TODO: 풀이 2
//        for (int i = 0; i < str.length(); i++) {
//            String temp = String.valueOf(str.charAt(i)); // W
//
//            if(temp.equals(temp.toLowerCase()) == true) {
//                System.out.print(temp.toUpperCase()); // 대문자 바꾸기 RONG
//            } else {
//                System.out.print(temp.toLowerCase()); // 소문자 바꾸기 wa
//            }
//        }

    }
}