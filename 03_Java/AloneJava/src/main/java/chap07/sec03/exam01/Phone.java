package chap07.sec03.exam01;

/**
 * packageName : chap07.sec03.exam01
 * fileName : Phone
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 추상클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public abstract class Phone {
    //   3요소 : 속성(필드), 생성자함수, 함수(메소드)
    public String owner;

    //    생성자 : 1개 : alt + insert(cmd + n)
    public Phone(String owner) {
        this.owner = owner;
    }

    //    함수 : 전원켜기
    public void turnOn() {
        System.out.println("전원켜기");
    }
    //    함수 : 전원끄기
    public void turnOff() {
        System.out.println("전원끄기");
    }

}