package chap06.sec04.verify.exam01;

/**
 * packageName : chap06.sec04.verify.exam01
 * fileName : PrinterApplication
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
public class PrinterApplication {
    public static void main(String[] args) {
        // TODO: 실행클래스 코딩/결과 보고 Printer 클래스 설계하세요
// 결과 :
//    공유함수(int) :10
//    공유함수(boolean) :true
//    공유함수(double) :5.7
//    공유함수(String) :홍길동
        Printer printer = new Printer();

//      실행  : return 있는 함수 :
//      int result = printer.println(10);
//      실행2 : return 없는 함수 :
//      printer.println(10);

        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}