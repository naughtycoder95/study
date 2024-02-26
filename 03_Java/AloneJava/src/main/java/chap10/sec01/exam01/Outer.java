package chap10.sec01.exam01;

/**
 * packageName : chap10.sec01.exam01
 * fileName : Outer
 * author : GGG
 * date : 2024-02-20
 * description : 중첩클래스 : 클래스 안에 클래스 (특수클래스)
 * 요약 :
 *      1) 중첩클래스 정의 :
 *          - 속성(필드) 위치에 만들기 : 일반/전역
 *          - 함수(메소드) 안에 만들기
 *      2) 중첩클래스 사용 :
 *          - 1) 외부 클래스 생성 : 외부클래스 변수 = new 생성자();
 *          - 2) 내부 클래스 생성 : 외부.내부클래스 변수2 = 변수.new 생성자();
 *          - 3) 전역은 바로 사용 : 외부.내부.속성, 외부.내부.함수()
 *          - 4) 로컬클래스      : 함수 호출 (내부 클래스 자동생성)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class Outer {
    //    클래스의 3요소 : 속성(필드), 생성자, 함수(메소드)
//      - 1) 속성(필드) 중첩클래스
//      - 2) 함수(메소드) 안에 중첩클래스
//    TODO: 1) 속성(필드) 중첩클래스
    public Outer() {
        System.out.println("Outer 클래스가 생성됨");
    }
    //    TODO: 1-1) 일반 속성(필드) 중첩클래스
    public class Attr {
        //        속성(필드), 생성자, 함수(메소드)
        int field1;
        public Attr() {
            System.out.println("Attr 중첩 클래스가 생성됨");
        }
        void method1() {}
    }

    //    TODO: 1-2) 전역 속성(필드) 중첩클래스
    static class Share {
        //        속성(필드), 생성자, 함수(메소드)
        int field1;
        static int field2;      // 전역 속성(필드)
        void method1(){};
        static void method2(){} // 전역 함수(메소드)
    }

    //    TODO: 2) 함수(메소드) 중첩 클래스 == 로컬(지역) 클래스
    void method() {
        class Local {
            //            속성(필드), 생성자, 함수(메소드)
            int field1;
            public Local() {
                System.out.println("Local 클래스가 생성됨");
            }
            void method1(){}
        }
        Local local = new Local();
        local.field1 = 3;
        local.method1();
    }
}






