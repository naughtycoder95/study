package chap14.sec01.exam03;

/**
 * packageName : chap14.sec01.exam03
 * fileName : User1
 * author : GGG
 * date : 2024-02-20
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class User1 extends Thread {
    private Calculator calculator;

    //    setter 함수 : alt + insert
    public void setCalculator(Calculator calculator) {
//        setName() : 쓰레드 이름 부여 함수
        this.setName("User1");
        this.calculator = calculator;
    }

    //    함수재정의 : run() : alt + insert
    @Override
    public void run() {
//        calculator 함수 중에 setMemory() 실행
        calculator.setMemory(50);
    }
}