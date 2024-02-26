package chap11.sec02.exam02;

/**
 * packageName : chap11.sec02.exam02
 * fileName : TryCatch2Applicaton
 * author : GGG
 * date : 2024-02-14
 * description : try/catch/catch
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class TryCatch2Application {
    public static void main(String[] args) {
//        Null 에러
//      TODO: 에러(예외) 처리 : try/catch
        try {
            String data = null;
            System.out.println(data.toString()); // 에러
        } catch (Exception e) {
            System.out.println("1번째 에러가 발생햇습니다.");
        }

        try {
            String data1 = args[0];     // Out Of Bound 에러
            String data2 = args[1];

            System.out.println(data1);  // 에러 발생
            System.out.println(data2);
        } catch (Exception e) {
            System.out.println("2번째 에러가 발생했습니다.");
        }
    }
}