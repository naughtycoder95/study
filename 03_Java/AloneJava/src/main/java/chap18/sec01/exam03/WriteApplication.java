package chap18.sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * packageName : chap18.sec01.exam03
 * fileName : WriteApplication
 * author : GGG
 * date : 2024-02-19
 * description : 배열 사용하기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class WriteApplication {
    public static void main(String[] args) throws Exception {
        OutputStream outputStream =
                new FileOutputStream("src/main/resources/test3.txt");

        byte[] array = {10, 20, 30, 40 ,50};

//        배열 중 일부만 파일에 쓰기 : 버퍼에 쓰기
//      TODO: 사용법 : write(배열, 시작인덱스, 길이);
        outputStream.write(array, 1, 3);  // 20, 30, 40

//        버퍼 내용 -> 파일 쓰기 : 성능 향상
        outputStream.flush();
//        파일 닫기
        outputStream.close();
    }
}