package chap08.sec03.exam01.korea;

/**
 * packageName : chap08.sec03.exam01.korea
 * fileName : Korean
 * author : GGG
 * date : 2024-02-08
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Korean extends Person{
    //    출력함수
    public void printKorean() {
        System.out.println(address); // protected (사용가능)
        System.out.println(name);    // default (사용가능)
//        System.out.println(no);      // private (사용불가)
    }

    //    print() 함수 재정의 : alt + insert
    @Override
    public void print() {
        super.print();
    }
}








