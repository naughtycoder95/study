package chap18.sec03.exam02;

import java.util.Scanner;

/**
 * packageName : chap18.sec03.exam02
 * fileName : ScannerApplication
 * author : GGG
 * date : 2024-02-19
 * description : 편리한 입력
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class ScannerApplication {
    public static void main(String[] args) {
//        System.in(키보드입력)
        Scanner scanner
                = new Scanner(System.in);

        int num = scanner.nextInt();     // 정수 : 1
        System.out.println(num);

        long num2 = scanner.nextLong();  // 정수 : 2
        System.out.println(num2);

        double num3 = scanner.nextDouble(); // 실수 : 3.1
        System.out.println(num3);

        String str = scanner.next();        // 1단어 : 안녕 홍길동
        String str2 = scanner.next();       // 1단어 :
        System.out.println(str);
        System.out.println(str2);

//      (참고) nextLine() vs next() 계열 함수를 같이 사용하면 입력 오류가 발생함
//        String str3 = scanner.nextLine();   // 1줄 입력
    }
}