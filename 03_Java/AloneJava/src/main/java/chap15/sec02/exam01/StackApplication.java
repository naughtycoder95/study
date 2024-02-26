package chap15.sec02.exam01;

import java.util.Stack;

/**
 * packageName : chap15.sec02.exam01
 * fileName : StackApplication
 * author : GGG
 * date : 2024-02-13
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class StackApplication {
    public static void main(String[] args) {
//        TODO: 스택 클래스 생성 : Stack<자료형> 변수 = new Stack<>();
        Stack<Coin> stack = new Stack<>();

//        TODO: .push(값) : 스택 값 넣기
//        TODO: .push(new 생성자함수()) : 스택 값 넣기
        stack.push(new Coin(100));       // 1(맨 처음)
        stack.push(new Coin(50));        // 2
        stack.push(new Coin(20));        // 3
        stack.push(new Coin(10));        // 4(끝 값)

//        TODO: .pop() : 스택에서 값 꺼내기
        Coin coin = stack.pop();               // 10(끝 값)
        System.out.println(coin.getValue());   // getter 로 출력
        Coin coin2 = stack.pop();              // 20
        System.out.println(coin2.getValue());  // getter 로 출력

//        TODO: .peek() : 현재 스택의 맨위의 값 조회
        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.peek());
    }
}