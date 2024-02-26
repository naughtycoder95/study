package chap11.sec02.exam03;

/**
 * packageName : chap11.sec02.exam03
 * fileName : CatchByCatchApplication
 * author : GGG
 * date : 2024-02-15
 * description : try / catch 연속으로 2개 있는 예제
 * 요약 : TODO:
 *          1) Exception 클래스 : 자바 예외(에러)를 위한 부모클래스,
 *              아래에 다양한 예외(에러)를 다루는 자식클래스들이 많음
 *              예) ArrayIndexOutOfBoundsException,
 *                  NumberFormatException, 등
 *          2) try {} 에서 에러가 발생하면 그 라인에 바로 catch 블럭{}으로
 *              강제 이동됨 (밑에 라인이 실행되지 않음)
 *          3) catch 블럭이 여러개 있더라도 오직 1개만 실행됨
 *          4) finally 블럭 : 마지막에 무조건 실행됨
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class CatchByCatchApplication {
    public static void main(String[] args) {
        try {
            String data1 = args[0];     // Out Of Bound 에러
            String data2 = args[1];

            System.out.println(data1);  // 에러 발생 #1 (catch 블럭이동)
            System.out.println(data2);

            String data3 = "100";   // 문자열
            String data4 = "a100";  // 문자열

//      TODO: Integer.parseInt(문자열) : 숫자 변환 함수
            int value1 = Integer.parseInt(data3); // #2
            int value2 = Integer.parseInt(data4);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개변수의 수가 부족합니다.");
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } catch (Exception e) {
            System.out.println("에러가 발생했습니다.");
        } finally {
            System.out.println("다시 실행하세요");
        }
    }
}