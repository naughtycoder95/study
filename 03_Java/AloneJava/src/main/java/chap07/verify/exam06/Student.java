package chap07.verify.exam06;

/**
 * packageName : chap07.verify.exam06
 * fileName : Student
 * author : GGG
 * date : 2024-02-06
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class Student extends Person {
    String id;

    //    생성자 : 매개변수 1개
    public Student(String name) {
        super(name);
    }

    //    setter/ getter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}