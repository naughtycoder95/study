package chap18.sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

/**
 * packageName : chap18.sec01.exam10
 * fileName : WriteApplication
 * author : GGG
 * date : 2024-02-19
 * description : 문자열을(String) 파일에 쓰기
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
                = new FileWriter("src/main/resources/test10.txt");

//        문자열
        String str = "ABC";

        writer.write(str);  // 버퍼 쓰기
        writer.flush();     // 파일 쓰기
        writer.close();     // 파일 닫기
    }
}