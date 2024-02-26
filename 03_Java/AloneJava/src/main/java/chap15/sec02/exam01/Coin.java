package chap15.sec02.exam01;

/**
 * packageName : chap15.sec02.exam01
 * fileName : Coin
 * author : GGG
 * date : 2024-02-13
 * description : 모델 클래스, Stack(스택) 예제
 * 요약 : TODO:
 *         1) 스택 특징 : 맨 끝에 들어온 데이터가 맨 처음으로 나감 (후입선출, LIFO(Last In First Out))
 *            예) 문자열 거꾸로 출력하기 등 코딩
 *         2) 스택 자료구조 함수 :
 *              - 스택에 자료 넣기 : .push(값)
 *              - 스택의 마지막 자료 꺼내기 : .pop() -> 꺼낸후엔 스택에서 제거됨
 *              - 스택의 마지막 값 조회 : peek()
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class Coin {
    private int value;   // 동전값
    //    생성자 : 1개
    public Coin(int value) {
        this.value = value;
    }

    //    setter/getter 함수
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                '}';
    }
}