package chap07.sec01.exam02;

/**
 * packageName : chap07.sec01.exam02
 * fileName : StudentApplication
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
public class StudentApplication {
    public static void main(String[] args) {
//        클래스 생성 : 클래스 변수 = new 생성자함수();
//        1) 매개변수 3개 자식생성자 호출 :
//            1-1) super() : 부모생성자 호출
//            1-2) 자식 속성에 값이 저장
        Student student = new Student("홍길동","1234567-12345678", 1);

        System.out.println(student.name);        // 부모속성
        System.out.println(student.ssn);         // 부모속성
        System.out.println(student.studentNo);   // 자식속성
    }
}