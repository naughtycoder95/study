package chap18.sec01.exam06;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * packageName : chap18.sec01.exam06
 * fileName : ReadApplication
 * author : GGG
 * date : 2024-02-19
 * description : 일부만(지정된 길이만큼) 읽기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) throws Exception {
//        파일 읽기(입력용) :
        InputStream inputStream
                = new FileInputStream("src/main/resources/test3.txt");

//        버퍼 배열 : 속도 향상
        byte[] buffer = new byte[5]; // 정수배열 초기값 : 0

//        파일을 읽어서 buffer 의 특정 인덱스 위치에 저장
//        test3.txt : 20 30 40
//        TODO: 사용법 : inputStream.read(배열, 시작인덱스번호, 길이)
        int data = inputStream.read(buffer, 2, 3);

//        버퍼 배열의 내용 출력
        for (int i = 0; i < buffer.length; i++) {
            System.out.println(buffer[i]);
        }
//        파일 사용이 끝나면 닫기
        inputStream.close();

    }
}