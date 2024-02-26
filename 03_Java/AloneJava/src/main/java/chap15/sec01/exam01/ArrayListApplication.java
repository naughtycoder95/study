package chap15.sec01.exam01;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : chap15.sec01.exam01
 * fileName : ArrayListApplication
 * author : GGG
 * date : 2024-02-08
 * description : TODO: 컬렉션 프레임워크 : ArrayList
 * 요약 :
 *      TODO: 컬렉션 프레임워크 : 자바에서 사용되는 자료구조를 통칭함
 *          자료구조 : 여러가지 값을 저장하는 구조 예) 배열
 *         ArrayList : 향상된 배열
 *             1) 장점 :
 *                   1-1) 배열과달리 자동으로 크기가 증가됨 :
 *                       배열크기를 지정할 필요없음
 *                       예) int[] arr = new int[3];
 *                   1-2) 배열 추가 및 삭제, 수정이 모두 함수로 제공되어
 *                        가독성이 좋음
 *             2) 사용법 : List<자료형> 변수 = new ArrayList<>();      // 추천
 *                        ArrayList<자료형> 변수 = new ArrayList<>();
 *             3) List : 인터페이스 , 부모역할 , 자식클래스가 있음(ArrayList, Vector, LinkedList )
 *             4) 사용법 : 추가/수정/삭제/배열값 조회
 *                  - 추가: 변수.add(값)
 *                  - 수정: 변수.set(인덱스번호, 값)
 *                  - 삭제: 변수.remove(인덱스번호)
 *                  - 조회: 변수.get(인덱스번호)
 *                  - 배열크기 : 변수.size()
 *             *) List 계열 : 특징) 중간에 삭제/추가되면 자동으로 한칸씩 당겨지거나/밀림
 *             * 총정리)  List(배열)     |   Set(집합)      | Map(키,값)
 *             특징 : 순서있음,중복저장   | 순서없음,중복안됨  | 키:유일, 값:중복허용
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class ArrayListApplication {
    public static void main(String[] args) {
//      TODO: 자동 import 단축키 : alt + enter => 클래스 가져오기
//        ArrayList : 향상된 배열
//        사용법: List<자료형> 변수 = new ArrayList<>()
//          <자료형> : 제네릭 : 목적? 자료형을 제한함(잘못 넣으면 에러발생)
        List<String> list = new ArrayList<>();

//      TODO: 추가
//       사용법 : 변수.add(값);
        list.add("Java");
        list.add("JDBC");
        list.add("JSP");
//        출력
        System.out.println(list); // [Java, JDBC, JSP]

//      TODO: 수정
//       사용법 : 변수.set(인덱스번호, 값);
        list.set(0, "자바");
        System.out.println(list); // [자바, JDBC, JSP]

//      TODO: 삭제
//       사용법 : 변수.remove(인덱스번호);
        list.remove(0);
        System.out.println(list);  // [JDBC, JSP]

//      TODO: 값을 조작하기(반복문) : JDBC JSP
//        1) 배열값 조회 : 사용법) 변수명.get(인덱스번호)
//        2) 배열크기    : 사용법) 변수명.size(); // (==arr.length)
//        3) 기타 : .isEmpty()[값이 있는가?], .clear()[모든 값 제거]
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // 배열값 가져오기 함수
        }
    }
}