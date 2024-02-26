package chap15.sec01.exam08;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName : chap15.sec01.exam08
 * fileName : HashSetApplication
 * author : GGG
 * date : 2024-02-13
 * description : HashSet 자료구조
 * 요약 :
 *      1) Set : 인터페이스, 부모역할
 *      2) 자식클래스(구현클래스) : HashSet, LinkedHashSet, TreeSet 등
 *      3) 목적 : 집합을 구현한 자료구조
 *          - 집합 : 인덱스 번호 없음, 순서도 없음, 중복된 데이터도 안들어감(특징)
 *                  예) {a, b, c, c, c} => {a, b, c}
 *      4) 활용 : 중복 데이터 제거용
 *          List 데이터 넣기 -> Set 변환(중복제거) -> List 복원
 *      5) 함수 :
 *              - 추가 : .add(값)
 *              - 제거 : .remove(값)
 *              - 크기 : .size()
 *              - 기타 : .isEmpty()[데이터 있는가?], .clear()[모두 삭제] 등
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class HashSetApplication {
    public static void main(String[] args) {
//        클래스 생성 : 클래스 변수 = new 생성자함수();
        Set<String> set = new HashSet<>();

//        TODO: 추가 : .add(값)
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        System.out.println(set);

//        TODO: 자료 출력 : Java JSP JDBC
//         향상된 for문 사용 : for (자료형 변수 : 배열) {실행문;}
//          => why? Set 자료구조는 index 번호 없음(집합에는 없음)
        for (String e : set) {
            System.out.print(e + " ");
        }

//        TODO: set.size() : 집합(Set) 안에 자료개수 가져오기
        System.out.println(set.size());

//        TODO: .remove(값) : 삭제하기
        set.remove("JDBC");
        System.out.println(set);
    }
}
