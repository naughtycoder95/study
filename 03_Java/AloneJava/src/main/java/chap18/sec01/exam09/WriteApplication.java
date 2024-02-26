package chap18.sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

/**
 * packageName : chap18.sec01.exam09
 * fileName : WriteApplication
 * author : GGG
 * date : 2024-02-19
 * description : 배열 일부 출력
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
                = new FileWriter("src/main/resources/test9.txt");

//        배열
        char[] array = {'A', 'B', 'C', 'D', 'E'};

        writer.write(array, 1, 3);   // BCD, 버퍼에 쓰기
        writer.flush();                    // 진짜 파일 쓰기
        writer.close();                    // 파일 닫기

    }
}