package chap07.sec03.exam02;

/**
 * packageName : chap07.sec03.exam02
 * fileName : AnimalApplication
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
public class AnimalApplication {
    public static void main(String[] args) {
//        Dog, Cat 클래스 생성 : 클래스 변수 = new 생성자함수();
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();         // 멍멍
        cat.sound();         // 야옹

//      TODO: 다형성 활용 예시 : Animal(부모), Dog(자식), Cat(자식)
//        복습 : 부모클래스 변수 = new 자식생성자();
        Animal animal;
//        강아지 넣기
        animal = new Dog();   // 다형성
//        함수재정의 실행 : sound()
        animal.sound();       // 멍멍
//        고양이 넣기
        animal = new Cat();    // 다형성
        animal.sound();        // 야옹
    }
}