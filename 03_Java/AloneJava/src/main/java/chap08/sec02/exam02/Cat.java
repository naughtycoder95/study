package chap08.sec02.exam02;

/**
 * packageName : chap08.sec02.exam02
 * fileName : Cat
 * author : GGG
 * date : 2024-02-08
 * description : 자식클래스 #1
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class Cat implements Soundable {
    @Override
    public String sound() {
        return "야옹";
    }
}
