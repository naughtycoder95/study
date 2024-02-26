package basic02;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * packageName : basic02
 * fileName : Simple10
 * author : GGG
 * date : 2024-02-08
 * description : 1271 엄청난 부자2
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Simple10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}
