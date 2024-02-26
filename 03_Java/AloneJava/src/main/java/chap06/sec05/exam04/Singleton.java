package chap06.sec05.exam04;

/**
 * packageName : chap06.sec05.exam04
 * fileName : Singleton
 * author : GGG
 * date : 2024-02-05
 * description : TODO: 전역 클래스(객체) : Singleton(싱글톤)
 *                 특징 : 오직 1개만 객체가 생성됨
 *                    다른 객체들은 생성된 객체를 공유함
 *                    예) 채번 : 1씩 증가값 -> 싱글톤 속성에 저장
 *                      => 다른 객체들이 현재 증가된 값을 조회하면
 *                         모두 같은 값을 조회할 수 있음
 * 요약 :
 *      TODO: 1) 자바 -> 2) 벡엔드 프레임워크 : Spring
 *       디자인 패턴 : 26가지 패턴(설계형태)
 *       => 코딩테스트 대비 : 실전연습 (브론즈 계열)
 *          -> 알고리즘(스택, 큐, 탐색(깊이, 너비) 등) : 실버계열
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class Singleton {
//    알고리즘 : 1) 다른 객체가 생성하지 못하도록 막기
//              2) 1개만 미리 객체를 생성
//              3) 다른 객체는 만들어진 객체를 받아서 사용
//    TODO: 접근제한자 : public (공공) vs private (사적 : 나만 사용)

    //     2) 1개만 미리 객체를 생성
    private static Singleton singleton = new Singleton();

    //    1) 다른 객체가 생성하지 못하도록 막기
//      클래스 생성 : 클래스명 변수 = new 생성자함수(); // 사용못하게 함
    private Singleton(){}

    //    3) 다른 객체는 만들어진 객체를 받아서 사용 : 전역함수로 정의
    static Singleton getInstance() {
        return singleton;
    }
}