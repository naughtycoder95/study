package chap06.sec04.verify.exam01;

/**
 * packageName : chap06.sec04.verify.exam01
 * fileName : Printer
 * author : GGG
 * date : 2024-02-05
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class Printer {
    //  TODO: 1 함수(메소드)
    void println(int value) {
        System.out.println("공유함수(int) :" + value);
    }
    void println(boolean value) {
        System.out.println("공유함수(boolean) :" + value);
    }
    void println(double value) {
        System.out.println("공유함수(double) :" + value);
    }
    void println(String value) {
        System.out.println("공유함수(String) :" + value);
    }
}