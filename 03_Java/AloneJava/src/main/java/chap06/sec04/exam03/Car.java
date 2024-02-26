package chap06.sec04.exam03;

/**
 * packageName : chap06.sec04.exam03
 * fileName : Car
 * author : GGG
 * date : 2024-02-05
 * description : TODO: 자동차 클래스
 * 요약 :
 *    TODO: 예제 :
 *      // gas 체크해서 차가 출발을 합니다.
 *         gas 있으면 "출발합니다" 출력하고,
 *        .run() 실행 // gas--; 감소시킴 반복문 종료
 *        다시 gas > 0 인지 확인해서 "gas를 주입할 필요가 없습니다"
 *        아니면 "gas"를 주입하세요"
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class Car {
    //   TODO: 3요소(*속성(필드), 생성자, 함수(메소드))
    int gas;

//  1) 함수(메소드)정의 : (설계)
//     (1) gas 저장할 함수 : setGas()
//     (2) 달리는 함수     : run()
//     (3) gas 확인 함수   : isLeftGas()

    //  TODO: (1) gas 저장할 함수 : setGas()
    void setGas(int gas) {
        this.gas = gas;
    }

    //  TODO: (2) gas(속성) 확인 함수   : isLeftGas()
    boolean isLeftGas() {
        if(gas == 0) {
            System.out.println("gas 없음");
            return false;
        } else {
            System.out.println("gas 있음");
            return true;
        }
    }

    //  TODO: 3) 달리는 함수     : run()
    void run() {
//      무한 루프(반복문)
        while (true) {
//          1) gas > 0 -> 달립니다. 출력, gas--;
            if(gas > 0) {
                System.out.println("달립니다");
                gas = gas - 1;         // 1감소
            } else {
//          2) 아니면   -> 멈춥니다. 출력
                System.out.println("멈춥니다.");
                break;
            }
        }
    }
}






