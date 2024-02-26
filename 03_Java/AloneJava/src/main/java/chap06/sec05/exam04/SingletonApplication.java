package chap06.sec05.exam04;

/**
 * packageName : chap06.sec05.exam04
 * fileName : SingletonApplication
 * author : GGG
 * date : 2024-02-05
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class SingletonApplication {
    public static void main(String[] args) {
//        1) 싱글톤 객체 2개 확인 : 같은지? (스택방주소) ==
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if(singleton == singleton2) {
            System.out.println("같은 객체임");
        } else {
            System.out.println("다른 객체임");
        }
    }
}