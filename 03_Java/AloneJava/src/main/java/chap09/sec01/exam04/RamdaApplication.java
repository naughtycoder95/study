package chap09.exam04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * packageName : chap09.exam04
 * fileName : RamdaApplication
 * author : GGG
 * date : 2024-02-19
 * description : (참고) 람다식(화살표함수), 함수형 인터페이스
 * 요약 :
 * 1) 사용처 :
 * - 스트림에서 사용
 * - 함수형 인터페이스
 * - 익명클래스 : 중첩클래스 챕터
 * 2) 함수형 인터페이스 :
 * - 목적 : 자바의 함수는 매개변수나 return 값으로 함수를 사용할 수 없음
 * 그래서, 만든 것인 함수형 인터페이스(매개변수나 return 값 사용가능)
 * - 예) js : 함수의 매개변수나 return 값으로 함수를 사용할 수 있음
 * 3) 함수형 인터페이스 구조
 * Runnable 인터페이스 : 매개변수(X), 반환값(X) ex) void run()
 * Supplier 인터페이스 : 매개변수도(X), 반환값(O) EX) T get()
 * Consumer 인터페이스 : 매개변수(O), 반환값(X) ex) void accect(T t)
 * Function 인터페이스 : 일반적인 함수, 매개변수(O), 반환값(O) ex) T apply(T t)
 * Predicate 인터페이스 : 매개변수(O), 반환값 이 boolean(참/거짓) ex) boolean test(T t)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class RamdaApplication {

    //   TODO: 전역함수 넣기
//    1~100까지 중 10개의 랜덤 숫자 넣기
//    T : Type 의미하고 어떤 자료형이던 들어올수 있다는 의미, 대표 T 라고 함
    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());     // s.get() : 매개함수의 값을 조회하는 함수
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
//        1) Supplier 인터페이스 : 매개변수도(X), 반환값(O) EX) T get()
//        TODO: js 화살표 함수 정의와 동일 == 람다식
//          예) (x,y) -> x+y; , () -> System.out.println("안녕");
//        TODO: 1) 자바 API에서 제공하는 함수형 인터페이스 사용 예제
        Supplier<Integer> s = () -> (int)(Math.random()*100) + 1;

        List<Integer> list = new ArrayList<>();
//        전역함수 실행
        makeRandomList(s, list);       // 1 ~ 100까지 숫자중 10개를 화면에 출력
//        TODO: 2) 함수형 인터페이스를 직접 코딩 예제
//        MyMath m = new Child();
        MyMath m = () -> (int)(Math.random()*100) + 1;
        System.out.println(m.myMath()); // 1 ~ 100까지 숫자중 1개를 화면에 출력
    }
}

// 함수형 인터페이스 정의
interface MyMath {
    int myMath();   // 추상함수 : {} 없는 함수
}

class Child implements MyMath {
    // alt +insert : 함수(메소드)재정의 (메소드 구현)
    @Override
    public int myMath() {
        return (int)(Math.random()*100) + 1;
    }
}





