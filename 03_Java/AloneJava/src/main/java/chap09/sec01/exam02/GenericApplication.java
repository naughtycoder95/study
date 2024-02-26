package chap09.exam02;

import java.util.ArrayList;

/**
 * packageName : chap09.exam02
 * fileName : GenericApplication
 * author : GGG
 * date : 2024-02-19
 * description : (참고) 제네릭
 * 요약 :
 *      1) 목적 : 변수에 저장시 자료형을 제한할 목적으로 사용함
 *      2) 사용법 : <자료형>
 *          예) List<Integer>, Optional<String>
 *      3) 참고) 특수 사용법
 *          - <? extends 클래스> : 클래스의 자식클래스만 들어올 수 있음
 *          - <? super 클래스>   : 클래스의 부모클래스만 들어올 수 있음
 *          - <?>               : 모든 클래스가 들어올 수 있음(제네릭 안쓴것과 같음)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class GenericApplication {

    //    TODO: 전역함수들
    public static void printAll(ArrayList<Product> list) {
        for(Object p : list) {
            System.out.println(p);
        }
    }

    public static void printAll2(ArrayList<? extends Tv> list) {
        for(Object p : list) {
            System.out.println(p);
        }
    }

    public static void printAll3(ArrayList<? super Product> list) {
        for(Object p : list) {
            System.out.println(p);
        }
    }

    public static void printAll4(ArrayList<?> list) {
        for(Object p : list) {
            System.out.println(p);
        }
    }


    public static void main(String[] args) {
//        TODO: 제네릭 사용 :
        ArrayList<Product> list = new ArrayList<>(); // Product 클래스만 가능
        ArrayList<Tv> list2 = new ArrayList<>();     // Tv 클래스만 가능

        list.add(new Audio());                       // 가능(자식클래스)
        list.add(new Tv());                          // 가능

        list2.add(new Tv());
//        list2.add(new Product());                   // 불가능(부모클래스 안됨)

//      복원 : 배열에서 꺼내서 자식클래스에 넣기
        Audio audio = (Audio) list.get(0);            // 강제형변환
        Tv tv       = (Tv) list.get(1);               // 강제형변환

//        TODO: (참고) 전역함수의 매개변수 넣기 예제
//          printAll(ArrayList<Product> list),
        printAll(list);                               // 가능
//        TODO: printAll2(ArrayList<? extends Tv> list),
//            <? extends Tv> : Tv 클래스의 자식클래스만 들어올 수 있음
//        printAll2(list);                              // 불가능(Product)
        printAll2(list2);                             // 가능(Tv)
//        TODO: printAll3(ArrayList<? super Product> list),
//            <? super Product> : Product 클래스의 부모클래스만 들어올 수 있음
        printAll3(list);                              // 가능(Product)
//        printAll3(list2);                             // 불가능(Tv)
//        TODO: printAll4(ArrayList<?> list)
//            <?>               : 모든 클래스가 들어올 수 있음(제네릭 안쓴것과 같음)
        printAll4(list);                              // 가능(Product)
        printAll4(list2);                             // 가능(Tv)
    }
}

class Product {}               // 부모
class Audio extends Product {} // 자식 #1
class Tv extends Product {}    // 자식 #2