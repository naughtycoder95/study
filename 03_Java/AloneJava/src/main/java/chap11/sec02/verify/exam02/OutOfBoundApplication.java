package chap11.sec02.verify.exam02;

/**
 * packageName : chap11.sec02.verify.exam02
 * fileName : OutOfBoundApplication
 * author : GGG
 * date : 2024-02-14
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class OutOfBoundApplication {
    public static void main(String[] args) {
        // TODO: 연습문제) 아래 예러(에외)를 발생시키는 프로그램이 있다.
//     try ~ catch 구문을 사용해서 개선하세요.
//    결과 :
//        운영자가 확인중에 있습니다.
        try {
            String data1 = args[0];
            String data2 = args[1];

            System.out.println(data1);
            System.out.println(data2);
        } catch (Exception e) {
            System.out.println("운영자가 확인중에 있습니다.");
        }
    }
}
