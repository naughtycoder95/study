package chap07.verify.exam08;

/**
 * packageName : chap07.verify.exam08
 * fileName : Calculator
 * author : GGG
 * date : 2024-02-07
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public abstract class Calculator {
//    두 정수의 합을 구하여 리턴
    public abstract int add(int a, int b);

//    두 정수의 차를 구하여 리턴
    public abstract int subtract(int a, int b);

//    배열에 저장된 정수의 평균을 구해 실수로 리턴
    public abstract double average(int[] a);
}
