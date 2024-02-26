package chap07.verify.exam05;

/**
 * packageName : chap07.verify.exam05
 * fileName : PenguinApplication
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
public class PenguinApplication {
    public static void main(String[] args) {
        // 문제 : 아래 실행 클래스를 보고 Penguin 객체를 코딩하세요
// 결과 : 뽀로로
//       남극
        Penguin pororo = new Penguin();

        pororo.setName("뽀로로");                   // Setter
        pororo.setHabitat("남극");                  // Setter

        System.out.println(pororo.getName());      // Getter , 뽀로로
        System.out.println(pororo.getHabitat());   // Getter , 남극
    }
}
