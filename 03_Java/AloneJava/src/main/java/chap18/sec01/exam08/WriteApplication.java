package chap18.sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

/**
 * packageName : chap18.sec01.exam08
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
        Writer writer
                = new FileWriter("src/main/resources/test8.txt");

        char[] array = {'A', 'B', 'C'};

        writer.write(array); // 버퍼에 쓰기
        writer.flush();      // 파일에 쓰기
        writer.close();      // 파일 닫기

    }
}