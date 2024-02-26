package chap05;

/**
 * packageName : chap05
 * fileName : Sec01
 * author : GGG
 * date : 2024-01-26
 * description : 참조 자료형 ? , 기본 자료형
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-26         GGG          최초 생성
 */
public class Sec01 {
    public static void main(String[] args) {
        String str1 = "신민철";
        String str2 = "신민철";

//      TODO: 문자열 비교(같은지) : 문자열.equals(문자열2) => true, 아니면 false
//           기본자료형 : int(정수), boolean(참/거짓), double(실수), char(문자1개)
//           문자열 자료형 : String (참조자료형)
//      TODO: 정리) 참조자료형 : 문자열, 객체, 배열 등    : 저장위치 : 힙방(힙메모리)
//                 기본자료형 : int, boolean, char 등 : 저장위치 : 스택방(스택메모리)
//                                                       (참고): 메소드방
//       equals 함수 : 힙방(메모리)의 값을 찾아서 비교
        if(str1.equals(str2) == true) {
            System.out.println("두 이름 같음");
        } else {
            System.out.println("두 이름 다름");
        }

//      기본자료형 비교 : 스택의 값을 찾아서 비교 : ==(비교: 스택의 값을 찾아 비교)
//      참조자료형 비교 : == 사용하면 방번호를 비교 (오류발생)
    }
}















