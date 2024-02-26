package chap07.verify.exam10;

/**
 * packageName : chap07.verify.exam10
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
        Animal animal = new Cat();
        animal.crying();            // 야옹!!

        animal = new Chicken();
        animal.crying();            // 꼬끼오!!!

        animal = new Cow();
        animal.crying();            // 음메!!!

        animal = new Dog();
        animal.crying();            // 멍멍!!!

        animal = new Mouse();
        animal.crying();             // 찍찍!!!
    }
}
