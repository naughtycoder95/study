package chap08.sec02.exam02;

/**
 * packageName : chap08.sec02.exam02
 * fileName : SoundableApplication
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
public class SoundableApplication {

//    전역함수 : static 함수(){}
//    TODO: 인터페이스의 다형성 #2 (함수의 매개변수 이용)
    static void print(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
//        전역함수 사용법 : 클래스명.함수명(); // 자신의 클래스 내의 전역함수는 클래스명 생략가능
        Cat cat = new Cat();
        Dog dog = new Dog();
        print(cat);
        print(dog); // return 없는 함수
    }
}
