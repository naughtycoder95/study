package chap09.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * packageName : chap09.exam03
 * fileName : StreamApplication
 * author : GGG
 * date : 2024-02-19
 * description : Stream 클래스
 * 요약 :
 *      1) 함수형 프로그래밍 패러다임
 *          - 역사 : 절차적프로그래밍 -> 구조적프로그래밍
 *                  -> 객체지향프로그래밍 -> 함수형 프로그래밍
 *          - 함수형 프로그래밍 기법들을 받아들임 :
 *              1) forEach , map , filter 등
 *          - 특징 : 자동 반복문 실행
 *      2) 사용법 :
 *          1) 정의부 :
 *          2) 가공  :
 *          3) 결과 내보내기 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class StreamApplication {
    public static void main(String[] args) {
//        TODO: 실습 예제
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ball");
        list.add("car");
        list.add("daddy");
        list.add("ear");
        list.add("fox");

//      TODO: 1) forEach 사용 : 단순 출력용
//      람다식(화살표함수) : s -> System.out.println(s)
        list.forEach(s -> System.out.println(s)); // 1번 코딩
        list.forEach(System.out::println);        // 2번 코딩

//      TODO: 2) map 사용 : 데이터 가공
//        예제: 배열의 값을 대문자로 바꾸어서 출력하기
//            (jquery)함수체이닝 : 객체변수.함수().함수().함수()
//         사용법 : 1) 정의부       : list.stream()
//                 2) 가공        : .map(s-> s.toUpperCase())
//                 3) 결과내보내기 : .collect(Collectors.toList());
        List<String> list2 = list.stream()
                .map(s-> s.toUpperCase())
                .collect(Collectors.toList());

        list2.forEach(s-> System.out.println(s)); // 대문자 배열 출력

//        TODO: 3) filter 사용 : 일부만 걸러내기
//          예제 : 배열값에서 문자길이가 3초과인 값만으로 새로운 배열 만들기
//         사용법 : 1) 정의부      : list.stream()
//                 2) 가공        : .filter(s -> s.length() > 3)
//                 3) 결과내보내기 : .collect(Collectors.toList());
        List<String> list3 = list.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());
        list3.forEach(s -> System.out.println(s)); // 3초과인 배열 출력

//        (참고) 결과내보내기 : Array 로 내보내기
        Object[] obj = list.stream()
                .filter(s -> s.length() > 3)
                .toArray();                  // 배열로 결과 내보내기

        for (Object o : obj) {
            System.out.println((String) o);
        }
    }
}