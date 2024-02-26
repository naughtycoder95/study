package ref;

import java.util.ArrayList;
import java.util.Collections;

/**
 * packageName : ref
 * fileName : ArrayList
 * author : GGG
 * date : 2024-01-31
 * description : ArrayList : 향상된 배열
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class ArrayListExam {
    public static void main(String[] args) {
//        TODO: ArrayList 예제 (향상된 배열) : 컬렉션 프레임워크(챕터)
//          장점 : 1) 배열크기없이 배열 생성 가능 : 크기가 자동증가
//                2) 다양한 함수를 사용 가능 :
//                   => 1) 배열값들 중에 최대값/최소값 : 함수 max/min
//                   => 2) 배열값들 중에 어떤 값 찾기 : 함수 binarySeach
//          고전적 배열 단점 : int[] arr = new int[개수];
//      TODO: 사용법 : ArrayList<자료형> 변수명 = new ArrayList<>()
//           => <자료형> 의미 : 배열값으로 사용할 자료형을 제한 (제네릭)
//           => 정수 : <Integer>, 문자열 : <String>, 실수:<Double>
        ArrayList<Integer> arrayList = new ArrayList<>(); // 객체로 정의
//       1) 배열에 값넣기 :
//        인덱스번호 : 값
//            0     : 1
//            1     : 2
//            2     : 3
//     TODO: 사용법 : 변수.add(값); // 배열의값이 없으면 0번부터 값이 들어감
//             => 배열의 끝에 값이 추가됨
        arrayList.add(1);  // 0번 인덱스 : 1
        arrayList.add(2);  // 1번 인덱스 : 2
        arrayList.add(3);  // 2번 인덱스 : 3

        System.out.println(arrayList);  // [1,2,3]
//      TODO: 배열에 값을 1,2,3 넣고 출력하세요
//        결과 : 1 2 3
//     2) 배열에서 값을 가져오기
//      TODO: 사용법 : 변수.get(인덱스번호); // 배열값 가져오기
        int a = arrayList.get(0);  // 0번인덱스 : 배열값 가져오기
        int b = arrayList.get(1);  // 1번인덱스 : 배열값 가져오기
        int c = arrayList.get(2);  // 2번인덱스 : 배열값 가져오기

        System.out.println(a + " " + b + " " + c); // 1 2 3

//      3) 배열값 수정 0번인덱스: 1 -> 10 수정
//      TODO: 변수.set(인덱스번호, 값); // 인덱스번호에 해당하는 값 수정하기
        arrayList.set(0, 10);       // 0번인덱스 : 배열값 수정하기

        System.out.println(arrayList.get(0));  // 0번 인덱스 값 출력

//      TODO: 배열의 최대값/최소값 찾기
//        배열 : 10,2,3
        int max = Collections.max(arrayList); // 향상된 배열에서 최대값 찾아줌
        int min = Collections.min(arrayList); // 향상된 배열에서 최소값 찾아줌

        System.out.println(min + " " + max);
    }
}