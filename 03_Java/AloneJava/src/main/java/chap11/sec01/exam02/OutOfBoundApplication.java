package chap11.sec01.exam02;

/**
 * packageName : chap11.sec01.exam02
 * fileName : OutOfBoundApplication
 * author : GGG
 * date : 2024-02-14
 * description : Out Of Bound 에러(예외)
 * 요약 :
 *      1) Array Out Of Bound : 잘못된 index 번호에 접근했을때 발생
 *          예) int[] arr = new int[5];
 *              arr[10] = 10;
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class OutOfBoundApplication {
    public static void main(String[] args) {
//        java OutOfBoundApplication : 실행 방법
//        java OutOfBoundApplication 값 값2 ...

//        java OutOfBoundApplication 실행 => args[0], args[1] 없음
        String data1 = args[0];     // Out Of Bound 에러
        String data2 = args[1];

        System.out.println(data1);  // 에러 발생
        System.out.println(data2);
    }
}