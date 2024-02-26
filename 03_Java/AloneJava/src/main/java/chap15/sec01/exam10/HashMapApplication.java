package chap15.sec01.exam10;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName : chap15.sec01.exam10
 * fileName : HashMapApplication
 * author : GGG
 * date : 2024-02-13
 * description : HashMap : (키, 값) 자료구조
 * 요약 :
 *      1) (키, 값) :
 *          - 키 : 중복된 데이터 없음(유일한 데이터)
 *          - 값 : 중복될 수 있음
 *          예) (1, "홍길동") => 함수(1) -> "홍길동" 출력됨
 *      2) Map : 인터페이스, 부모역할
 *      3) 자식클래스(구현클래스) : HashMap, HashTable 등
 *      4) 함수 :
 *          - 추가/수정 : .put(키, 값)
 *          - 삭제     : .remove(키)
 *          - 조회     : .get(키)
 *          - 크기     : .size()
 *          - 기타     : clear()[모두 삭제], isEmpty()[데이터 있는가?] 등
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class HashMapApplication {
    public static void main(String[] args) {
//    TODO: Map<키자료형, 값자료형> = new HashMap<>();
//       자료형을 특정할 수 없으면 Object 넣기
        Map<String, Object> map = new HashMap<>();

//    TODO: .put(키, 값) : 데이터 추가
        map.put("no", 1);
        map.put("name", "홍길동");
        System.out.println(map);             // {no=1, name=홍길동}

//    TODO: .size()     : Map 의 크기
        System.out.println(map.size());      // 2

//    TODO: .get(키)    : 키로 값조회
        System.out.println(map.get("no"));   // 1
        System.out.println(map.get("name")); // 홍길동

//    TODO: .put(키, 값) : 키로 값 수정 : 키로 값 추가(같음)
        map.put("no", 2);                    // 2
        System.out.println(map.get("no"));   // 2

//     TODO: .remove(키) : 키로 값삭제
        map.remove("no");
        System.out.println(map);             // {name=홍길동}
    }
}