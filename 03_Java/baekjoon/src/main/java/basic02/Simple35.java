package basic02;

import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple35
 * author : GGG
 * date : 2024-02-16
 * description : 17256 달달함이 흘러넘쳐
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-16         GGG          최초 생성
 */
public class Simple35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int az = sc.nextInt();
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        int cz = sc.nextInt();

        System.out.println(cx-az);
        System.out.println(cy/ay);
        System.out.println(cz-ax);
    }
}
