package chap10.sec02.exam01;

/**
 * packageName : chap10.sec02
 * fileName : Anonymous
 * author : GGG
 * date : 2024-02-20
 * description : 익명 클래스
 * 요약 :
 *      1) 익명 클래스 : 이름 없는 클래스,
 *                  특정 위치에서 1번만 사용, 1회용 클래스
 *      2) 사용법 : new 부모생성자() {} => {} : 익명클래스이고, 부모를 상속받은 이름없는 자식클래스임
 *         부모클래스 변수 = new 부모생성자() {
 *         @Override
 *         void 재정의함수() {
 *             실행문
 *         }
 *     };
 *      3) 특징 : 생성자 없음, 속성(필드)와 함수(메소드)만 있음
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class Anonymous {
//    속성(필드), 생성자, 함수(메소드)
//    TODO: 1) 속성(필드) : 아래 부모클래스의 함수를 재정의
    Person person = new Person() {
        //        TODO: 익명 클래스는 생성자빼고 속성, 함수 정의 가능
//         => 익명(이름없는) 클래스 : 부모를 상속받은 이름없는 자식 클래스
        void work() {
            System.out.println("출근합니다.");
        }
        //        alt + insert : 메소드 재정의
        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
        }
    };

//   TODO: 2) 함수안에서 사용하기
    void method1() {
//        (지역)변수 : 함수재정의 하고 싶음 => 자식클래스 정의하고 싶지않음
//            => 익명클래스 사용을 고려
        Person person2 = new Person() {
            void walk() {
                System.out.println("산책합니다.");
            }
//            함수재정의
            @Override
            void wake() {
                System.out.println("5시에 일어납니다.");
                walk();
            }
        };
        person2.wake();                // 다형성에 의해 자식클래스의 함수가 실행됨
    }

    //   TODO: 3) 함수의 매개변수로 사용하기
    void method2(Person person) {
        person.wake();
    }
}