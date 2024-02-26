package chap18.sec01.exam04;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * packageName : chap18.sec01.exam04
 * fileName : ReadApplication
 * author : GGG
 * date : 2024-02-19
 * description : 1 byte 씩 읽기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) throws Exception {
        InputStream inputStream
                = new FileInputStream("src/main/resources/test1.db");

//      파일읽기 : 1) 반복문 : 파일의 끝까지 실행 : 파일끝(-1)
//                2) 파일읽기
        while (true) {
            int data = inputStream.read(); // 읽은 byte 수 : 정수값

//            파일 끝 : -1 => 반복문 중단
            if(data == -1) break;
//            읽은 내용 출력
            System.out.println(data);
        }
//        파일 사용(읽기) 끝나면 닫기
        inputStream.close();
    }
}