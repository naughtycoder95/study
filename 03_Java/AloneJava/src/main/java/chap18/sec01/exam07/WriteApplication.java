package chap18.sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

/**
 * packageName : chap18.sec01.exam07
 * fileName : WriteApplication
 * author : GGG
 * date : 2024-02-19
 * description : 한 문자씩 출력하기
 * 요약 : 텍스트 파일 만드는 최상위 추상클래스
 *      1) Reader : 문자기반(char:2byte) 입력(읽기) 스트림, 최상위 추상클래스
 *          예) 자식클래스 : xxxReader
 *      2) Writer : 문자기반(char:2byte) 출력(쓰기) 스트림, 최상위 추상클래스
 *           예) 자식클래스 : xxxWriter
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class WriteApplication {
    public static void main(String[] args) throws Exception {
//        파일 쓰기용 열기
        Writer writer
                = new FileWriter("src/main/resources/test7.txt");

        char a = 'A';
        char b = 'B';
        char c = 'C';

//        한문자씩 버퍼에 쓰기
        writer.write(a);
        writer.write(b);
        writer.write(c);
//        진짜 파일에 쓰기
        writer.flush();
//        파일 닫기
        writer.close();
    }
}