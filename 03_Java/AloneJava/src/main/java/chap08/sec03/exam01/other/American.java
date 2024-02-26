package chap08.sec03.exam01.other;

import chap08.sec03.exam01.korea.Person;

/**
 * packageName : chap08.sec03.exam01.other
 * fileName : American
 * author : GGG
 * date : 2024-02-08
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class American extends Person {
    //    함수
    public void printAmerican() {
        System.out.println(address); // protected (사용가능)
//        System.out.println(name);    // default (사용불가)
    }
}
