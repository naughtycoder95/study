package chap18.sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

/**
 * packageName : chap18.sec01.exam12
 * fileName : ReadApplication
 * author : GGG
 * date : 2024-02-19
 * description : 배열 사용 읽기 : 성능 향상
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) throws Exception {
        Reader reader
                = new FileReader("src/main/resources/test8.txt");

//      배열
        char[] buffer = new char[100];

        while (true) {
            int num = reader.read(buffer); // 최대 100문자씩 읽기
//            반복문 종료 : 파일끝(-1)
            if(num == -1) break;
            // 화면출력 : buffer(파일내용), num(읽은 문자수)
            for (int i = 0; i < num; i++) {
                System.out.println(buffer[i]);
            }
        }
        reader.close();                     // 파일 닫기
    }
}