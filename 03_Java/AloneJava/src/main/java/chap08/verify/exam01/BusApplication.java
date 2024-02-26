package chap08.verify.exam01;

/**
 * packageName : chap08.verify.exam01
 * fileName : BusApplication
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
public class BusApplication {
    public static void main(String[] args) {
//        TODO: 연습문제) 아래 결과를 보고 Bus 클래스를 완성하세요.
//          결과 :
//               버스가 달립니다.
        Vehicle vehicle = new Bus();

        vehicle.run(); // 버스가 달립니다.

//        TODO: 1) 상속 : 다형성 -> 부모클래스 <= 자식클래스        : 자동(자료)형변환
//                 복원 : 자식클래스 <= (자식클래스) 부모클래스     : 강제 형변환
//              2) 다형성 -> 인터페이스 <= 자식클래스              : 자동(자료)형변환
//                 복원 : 자식클래스 <= (자식클래스) 인터페이스     : 강제 형변환
        Bus bus = (Bus) vehicle;
    }
}
