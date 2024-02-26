package chap07.verify.exam11;

/**
 * packageName : chap07.verify.exam11
 * fileName : CannonApplication
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
public class CannonApplication {
    public static void main(String[] args) {
//    문제 : 다형성을 이용한 예제, 아래 클래스를 보고 Weapon(부모클래스) 클래스와 Cannon(자식클래스) 클래스를 완성하세요.
//    결과 :
//          기본 무기의 살상 능력은 1
//          대포의 살상 능력은 10
        Weapon weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력은 " + weapon.fire());

        weapon = new Cannon();
        System.out.println("대포의 살상 능력은 " + weapon.fire());
    }
}
