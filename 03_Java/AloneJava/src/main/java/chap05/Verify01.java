package chap05;

/**
 * packageName : chap05
 * fileName : Verify01
 * author : GGG
 * date : 2024-01-29
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         GGG          최초 생성
 */
public class Verify01 {
    public static void main(String[] args) {
//        연습1) 1 ~ 10 까지 배열을 정의하고 출력하세요
//        출력 : 1 2 3 4 5 6 7 8 9 10
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//            System.out.print(arr[i] + " ");
//        }

//        연습2) 주어진 배열에서 최대값 구하기
//        int[] array = {1, 5, 3, 8, 2};
//        int max = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i]){
//                max = array[i];
//            }
//        }
//        System.out.println(max);

        //      연습 3) 2중 for문을 이용해서 주어지 배열의 전체 항목의 합과 평균을 구해보세요.
////    결과 :
////        sum : 881
////        avg : 88.1
        int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        double avg = (double) sum / (double) count;
        System.out.println(avg);
    }
}
