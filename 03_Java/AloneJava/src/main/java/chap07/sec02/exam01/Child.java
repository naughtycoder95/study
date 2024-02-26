package chap07.sec02.exam01;

/**
 * packageName : chap07.sec02.exam01
 * fileName : Child
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 자식클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class Child extends Parent {
    //    method2() : 재정의(alt + insert/cmd+n) , method3() : 그냥 작성
    @Override
    public void method2() {
        System.out.println("자식함수 - method2");
    }

    public void method3() {
        System.out.println("자식함수 - method3");
    }
}