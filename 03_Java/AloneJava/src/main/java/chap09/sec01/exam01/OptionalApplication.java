package chap09.exam01;

import javax.print.attribute.standard.MediaSize;
import java.util.Optional;

/**
 * packageName : chap09.exam01
 * fileName : OptionalApplication
 * author : GGG
 * date : 2024-02-19
 * description : Optional 클래스
 * 요약 :
 *      1) 자바의 문제점 : null 포인터 에러가 언제든지 발생할 수 있음
 *          => 파이썬 : null 포인터 에러 없음
 *          => 자바 최신버전 새로운 Optional 클래스 소개됨
 *              (널 에러 방지 클래스)
 *      2) Optional 클래스 : 래퍼클래스 종류
 *          예) int -> Integer 등(객체자료형, 래퍼클래스)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class OptionalApplication {
    public static void main(String[] args) {
//      TODO: 옵셔널에 값넣기 : Optional<자료형> 변수 = Optional.of(값);
//        <자료형> : 제네릭 : 넣는 값의 자료형을 제한하는 것
        Optional<String> str = Optional.of("abcde");

//      TODO: 옵셔널에서 다시 값을 꺼내기 : 변수.get()
        System.out.println(str.get());

//      TODO: 정수 넣기
        Optional<Integer> num = Optional.of(0);
//      TODO: 옵셔널에 값이 있는지 확인
        System.out.println(num.isPresent());      // 있으면 true

//      TODO: 빈 객체
        Optional optional = Optional.empty();     // 빈객체 저장됨
        System.out.println(optional.isPresent()); // false
//      TODO: 만약 빈객체이면 대체 문자열 출력하기
        System.out.println(optional.orElse("값없음")); // null 에러 방지
    }
}