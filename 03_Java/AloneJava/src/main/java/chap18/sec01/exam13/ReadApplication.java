package chap18.sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

/**
 * packageName : chap18.sec01.exam13
 * fileName : ReadApplication
 * author : GGG
 * date : 2024-02-19
 * description : 파일 읽어서 배열의 특정 위치에 저장
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) throws Exception {
        Reader reader =
                new FileReader("src/main/resources/test9.txt");

//        배열
        char[] buffer = new char[5];  // 초기값 : \u0000

//      파일에서 읽은 문자를 특정위치에 쓰기
//        TODO: reader.read(배열, 시작인덱스, 길이)
        int num = reader.read(buffer, 2, 3);

//        출력
        for (int i = 0; i < buffer.length; i++) {
            System.out.println(buffer[i]);
        }
        reader.close();                           // 파일 닫기
    }
}