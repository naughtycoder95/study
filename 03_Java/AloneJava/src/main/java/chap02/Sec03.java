package chap02;

/**
 * packageName : chap02
 * fileName : Sec03
 * author : GGG
 * date : 2024-01-24
 * description : 자료형 변환
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         GGG          최초 생성
 */
public class Sec03 {
    public static void main(String[] args) {
//        main
//      TODO: 1) 자동 (자료)형변환
//        => 작은 자료형 -> 큰 자료형 = 큰자료형 : 자동 자료형 변환
//        byte bValue = 10;      // 1byte
//        int  iValue = bValue;  // 4byte
//        System.out.println(iValue);

//        int  iValue = 50;     // 4byte
//        long lValue = iValue; // 8byte
//        System.out.println(lValue);
//
//        float  fValue = 100.5f;  // 4byte
//        double dValue = fValue;  // 8byte
//        System.out.println(dValue);

//      char : 정수/문자 자료형 : 코딩테스트 문제
//      TODO: char <-> int 이용해서 문자/아스키코드 변환을 함
        char cValue = 'A';    // 1byte
        int iValue  = cValue; // 4byte
        System.out.println(iValue); // 정수 아스키코드가 출력됨

    }
}
