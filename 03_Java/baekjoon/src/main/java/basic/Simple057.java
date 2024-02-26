package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple057
 * author : GGG
 * date : 2024-02-01
 * description : 2941 크로아티아 알파벳
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         GGG          최초 생성
 */
public class Simple057 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String croatia = scan.next();
        int count = 0;

        for (int i = 0; i < croatia.length(); i++) {            // 글자수만큼 카운트할 반복문

            if(croatia.charAt(i) == 'c') {			            // croatia.charAt(i)가 c일때
                if(i < croatia.length() - 1) {                  // i가 croatia.length() - ('c'에 더해질 문자수)보다 작아야함
                    if(croatia.charAt(i + 1) == '=') {		    // 'c'다음이 '=' 일때 i를 늘려서 '=' 건너뛰기
                        i++;
                    } else if(croatia.charAt(i + 1) == '-') {   // 'c'다음이 '-' 일때 i를 늘려서 '-' 건너뛰기
                        i++;
                    }
                }
            }

            else if(croatia.charAt(i) == 'd') {                 // croatia.charAt(i)가 d일때
                if(i < croatia.length() - 1) {                  // i가 croatia.length() - ('d'에 더해질 문자수)보다 작아야함
                    if (croatia.charAt(i + 1) == '-') {         // 'd'다음이 '-' 일때 i를 늘려서 '-' 건너뛰기
                        i++;
                    }
                    else if(croatia.charAt(i + 1) == 'z') {     // 'd'다음이 'z' 일때
                        if(i < croatia.length() - 2) {          // i가 croatia.length() - ('d'에 더해질 문자수)보다 작아야함
                            if(croatia.charAt(i + 2) == '=') {  // 'z'다음이 '=' 일때 i를 늘려서 'z', '=' 건너뛰기
                                i += 2;
                            }
                        }
                    }
                }
            }

            else if(croatia.charAt(i) == 'l') {                 // croatia.charAt(i)가 l일때
                if(i < croatia.length() - 1) {                  // i가 croatia.length() - ('l'에 더해질 문자수)보다 작아야함
                    if(croatia.charAt(i + 1) == 'j') {	        // 'l'다음이 'j' 일때 i를 늘려서 'j' 건너뛰기
                        i++;
                    }
                }
            }

            else if(croatia.charAt(i) == 'n') {                 // croatia.charAt(i)가 n일때
                if(i < croatia.length() - 1) {                  // i가 croatia.length() - ('n'에 더해질 문자수)보다 작아야함
                    if(croatia.charAt(i + 1) == 'j') {	        // 'n'다음이 'j' 일때 i를 늘려서 'j' 건너뛰기
                        i++;
                    }
                }
            }

            else if(croatia.charAt(i) == 's') {                 // croatia.charAt(i)가 s일때
                if(i < croatia.length() - 1) {                  // i가 croatia.length() - ('s'에 더해질 문자수)보다 작아야함
                    if(croatia.charAt(i + 1) == '=') {	        // 's'다음이 '=' 일때 i를 늘려서 '=' 건너뛰기
                        i++;
                    }
                }
            }

            else if(croatia.charAt(i) == 'z') {                 // croatia.charAt(i)가 z일때
                if(i < croatia.length() - 1) {                  // i가 croatia.length() - ('z'에 더해질 문자수)보다 작아야함
                    if(croatia.charAt(i + 1) == '=') {	        // 'z'다음이 '=' 일때 i를 늘려서 '=' 건너뛰기
                        i++;
                    }
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
