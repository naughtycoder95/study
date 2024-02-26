package chap08.sec02.exam01;

/**
 * packageName : chap08.sec02.exam01
 * fileName : Tire
 * author : GGG
 * date : 2024-02-08
 * description : TODO: 인터페이스 : 부모역할
 * 요약 :
 *      TODO: 인터페이스의 다형성
 *          1) 인터페이스는 단독으로 생성이 불가하고 무조건 자식클래스를 넣어서 사용해야함 (상속)
 *          2) 자식클래스에서 추상함수를 재정의 해야함
 *          3) 인터페이스를 사용하면 자동적으로 다형성이 이루어짐
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public interface Tire {
//    추상함수
    public void roll();
}
