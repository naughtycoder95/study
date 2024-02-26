package chap15.sec01.exam12;

import java.util.Objects;

/**
 * packageName : chap15.sec01.exam12
 * fileName : Student
 * author : GGG
 * date : 2024-02-13
 * description : 학생 모델
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class Student {
    public int sno;      // 학번
    public String name;  // 이름
    //    생성자 : 2개
    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }
    //  TODO: equals(), toString(), hashCode() 재정의 : alt + insert
    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sno == student.sno && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name);
    }
}