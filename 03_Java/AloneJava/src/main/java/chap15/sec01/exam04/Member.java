package chap15.sec01.exam04;

/**
 * packageName : chap15.sec01.exam04
 * fileName : Member
 * author : GGG
 * date : 2024-02-13
 * description : .equals() 함수
 * 요약 :
 *      1) String 자료형 : 문자열 (클래스 == 객체)
 *      2) 문자열 값 비교를 위해 .equals() 함수 사용 (== 사용안됨)
 *          - ==(비교연산자) : 스택방의 값을 비교
 *            일반자료형 : int, long 등 (값비교 됨)
 *            참조자료형 : 배열, 객체 등 (힙방주소가 비교 됨)
 *          - 예) "문자열" == "문자열2"     (안됨)
 *                "문자열".equals("문자열2") (o)
 *      3) 일반 클래스는 equals() 재정의 안되어 있어
 *         개발자가 직접 재정의 해야함
 *         - 대상 : 객체의 속성이 같은지 재정의하면됨
 *         - 코딩 : 자동화 기능 이용 - alt + insert
 *      4) Object : 조상 객체(클래스),
 *                  모든 자식클래스는 자동으로 상속받고 있음
 *                  (.equals(), .hashCode(), toString() 등)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class Member {
    //    클래스 3요소 : 속성(필드), 생성자, 함수(메소드)
    public String id;

    //  TODO: 생성자 1개: alt + insert(cmd + n)
    public Member(String id) {
        this.id = id;
    }

    //  TODO: equals() 재정의 : alt + insert(cmd + n)
//    1) Object : 자바 객체(클래스)의 조상(부모) 객체 : 예) 단군할아버지
//      - 함수/속성 등을 물려받아 사용할 수 있음
//      - equals()/toString()/hashCode() ...
    @Override
    public boolean equals(Object obj) {
//        코딩 : int) 매개변수 obj의 속성 == this.속성 => 같다
//            String) 매개변수 obj의 속성.equals(this.속성) => 같다

//      TODO: 복원 : Object -> Member 끄집어내기 : 강제 형변환
        if(obj instanceof Member) {
            Member member = (Member) obj;

            if(this.id.equals(member.id)) {
                return true;             // 같으면 true 내보내기
            }
        }

        return false;                // 틀리면 false 내보내기
    }
}