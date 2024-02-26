package chap07.sec03.exam02;

/**
 * packageName : chap07.sec03.exam02
 * fileName : Cat
 * author : GGG
 * date : 2024-02-07
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class Cat extends Animal {
//    생성자 : 기본(매개변수 없는 생성자)

    public Cat() {
        this.kind = "포유류"; // 부모속성(필드)
    }
//    TODO: 추상함수가 포함된 추상클래스를 상속받으면 오버라이딩(재정의) 해야함
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
