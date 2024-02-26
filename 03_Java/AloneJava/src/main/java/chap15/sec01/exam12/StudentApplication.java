package chap15.sec01.exam12;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName : chap15.sec01.exam12
 * fileName : StudentApplication
 * author : GGG
 * date : 2024-02-13
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class StudentApplication {
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        map.put("홍길동", new Student(1, "홍길동"));
        map.put("장길산", new Student(1, "장길산"));
        System.out.println(map);
    }
}
