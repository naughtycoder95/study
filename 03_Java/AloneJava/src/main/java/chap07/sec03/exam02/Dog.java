package chap07.sec03.exam02;

/**
 * packageName : chap07.sec03.exam02
 * fileName : Dog
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 자식클래스 #2
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class Dog extends Animal {
    public Dog() {
        this.kind = "포유류";
    }
//    TODO: 추상함수가 있는 추상클래스 => 함수 재정의 필수
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
