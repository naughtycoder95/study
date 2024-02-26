package chap15.sec02.exam03;

import java.util.Stack;

/**
 * packageName : chap15.sec02.exam03
 * fileName : StackApplication
 * author : GGG
 * date : 2024-02-14
 * description : Stack 2 : 일반자료형 예제
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class StackApplication {
    public static void main(String[] args) {
//        스택 생성 : Stack<자료형> stack = new Stack<>();
//          => 제네릭 : <객체자료형> => 객체자료형(래퍼클래스)
//          => 래퍼클래스 : int -> Integer, long -> Long 등
        Stack<Integer> stack = new Stack<>();

//        TODO: 값 넣기 : 1 2 3 4
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

//        TODO: 값 꺼내서 출력하기 : 4 3 2 1
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
