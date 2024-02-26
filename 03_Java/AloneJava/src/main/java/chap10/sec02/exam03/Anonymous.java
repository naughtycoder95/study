package chap10.sec02.exam03;

/**
 * packageName : chap10.sec02.exam03
 * fileName : Anonymous
 * author : GGG
 * date : 2024-02-20
 * description : 익명클래스에서의 사용 주의
 * 요약 :
 *      1) 결론 : 함수(메소드) 안에 익명클래스에는 지역변수,매개변수가 상수로 변경됨
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class Anonymous {
    private int field;

    public void method(int arg1, int arg2) {
        int var = 0;                            // (지역)변수 => 상수로 변경됨
//        var = 2;                                // x
//        arg1 = 3;                               // x
//        arg2 = 3;                               // x
//        익명클래스
        Calculator calculator
                = new Calculator() {
            @Override
            public int sum() {
                int result = arg1 + arg2 + var;
                return result;
            }
        };
        System.out.println(calculator.sum());   // 함수 실행
    }
}