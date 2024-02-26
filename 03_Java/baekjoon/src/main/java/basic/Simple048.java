package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple048
 * author : GGG
 * date : 2024-01-31
 * description : 1152 단어의 개수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class Simple048 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();               // 문자열 입력받기 (next 사용 불가, nextline을 사용해야 한줄로 입력받음)
        String[] arr = str.split(" ");        // 공백 기준으로 문자열 자르기
        int count = 0;                              // 단어 갯수 저장공간
        for (int i = 0; i < arr.length; i++) {      // 자른 문자 갯수만큼 반복
            if (arr[i] != ""){                     // arr[i] 중에 공백(문자가 들어있지 않은[i])은 세지 않기
                count++;                            // 공백을 제외한 문자 배열 갯수만큼 카운트 세기
            }
        }
        System.out.println(count);
    }
}
