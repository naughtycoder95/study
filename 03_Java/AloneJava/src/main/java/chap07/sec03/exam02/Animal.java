package chap07.sec03.exam02;

/**
 * packageName : chap07.sec03.exam02
 * fileName : Animal
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 추상클래스 #2, 추상함수, 부모클래스
 * 요약 :
 *      TODO: 추상함수 : {} 사용안함, 자료형 함수명();
 *         => {} : 실행블럭 , 함수의 실행블럭없이 이름만 정의하는 함수
 *         1) 추상함수는 추상클래스에서만 사용가능
 *         2) 목적 : 함수명 강제하기 위한 목적으로 사용(명칭 표준화)
 *         3) 활용 : 다형성을 이용하는 목적으로 활용
 *         4) 자식클래스에서는 반드시 함수 오버라이딩(재정의) 해서 사용해야함
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public abstract class Animal {
    public String kind;    // 종류

    //    함수 : 숨쉬다. breathe()
    public void breathe() {
        System.out.println("숨쉬다");
    }
    //   TODO: 추상함수 : {} 사용안함, 자료형 함수명();
//       => {} : 실행블럭 , 함수의 실행블럭없이 이름만 정의하는 함수
    public abstract void sound();
}