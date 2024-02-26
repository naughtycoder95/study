package chap15.sec03.exam02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * packageName : chap15.sec03.exam02
 * fileName : CollectionsApplication
 * author : GGG
 * date : 2024-02-14
 * description : Collections(자료구조 : List, Set, Map)에 유용한 함수들 소개
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class CollectionsApplication {
    public static void main(String[] args) {
//        TODO:
        List<Integer> list = new ArrayList<>();

//        TODO: list 에 값 넣기
//          사용법 : Collections.addAll(향상된 배열, 값, 값2, ...)
        Collections.addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);

//        TODO: 2) list 값들을 오른쪽으로 회전시키기
//          사용법 : Collections.rotate(향상된 배열, 이동시킬 칸 수);
        Collections.rotate(list, 2);
        System.out.println(list);

//        TODO: 3) list 에 특정 값을 교환하기
//          사용법 : Collections.swap(향상된 배열, 바꿀 인덱스 번호 1, 바꿀 인덱스 번호 2);
        Collections.swap(list, 0, 1);
        System.out.println(list);

//        TODO: 4) list 를 정렬(오름/내림)
//          팀정렬 : 삽입정렬 + 합병정렬 (속도 : 퀵정렬과 같음)
//          사용법 :
//                4-1) 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

//                4-2) 오름차순 정렬
        Collections.sort(list);
        System.out.println(list);

//        TODO: 5) list 에 이진탐색 하기
//          1) 조건 : 오름차순 정렬 후 탐색
//          사용법 : 변수 = Collections.binarySearch(향상된 배열, 찾을 값)
//                  변수 = 찾은 인덱스 번호가 리턴됨
        int index = Collections.binarySearch(list, 3);
        System.out.println(index);

//        TODO: 6) list 에서 max/min 찾기
//              6-1) max(최대값) :
        System.out.println(Collections.max(list));
//              6-2) min(최소값) :
        System.out.println(Collections.min(list));
    }
}
