package chap11.sec02.exam01;

/**
 * packageName : chap11.sec02.exam01
 * fileName : TryCatchFunallyApplication
 * author : GGG
 * date : 2024-02-14
 * description : 자바 에러(예외) 처리 기본
 * 요약 :
 *      1) why? 서비스가 실행중에 에러가 발행해서 빨간줄이 보이면 사용자는 서비스의 품질을 의심
 *      2) 유도 : 에러가 발생하면 정중한 메세지를 화면에 보이게 유도
 *      3) 서비스 품질 향상
 *      TODO: try/catch 구문
 *          1) try{} : try 블럭에 실행문을 넣고 만약 에러가 발생하면 강제적으로 catch(){} 블럭으로 이동됨
 *          2) catch(에러객체 변수){} : 이동된 에러내역을 확인/출력할 수 있음, 정중한 메세지도 출력
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class TryCatchFinallyApplication {
    public static void main(String[] args) {
//        TODO: try/catch 구문
//        String2 클래스는 자바에 없음 => ClassNotFound 에러
        try {
            Class clazz = Class.forName("String2");     // 에러 발생
        } catch (Exception e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
}
