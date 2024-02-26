package chap18.sec02.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * packageName : chap18.sec02.exam02
 * fileName : ReadLineApplication
 * author : GGG
 * date : 2024-02-19
 * description : 성능향상 보조스트림
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class ReadLineApplication {
    public static void main(String[] args) throws Exception {
//        문자기반(텍스트파일) 읽기용 열기 :
        Reader reader =
                new FileReader("src/main/resources/lang.txt");

//        Reader 클래스의 기본 버퍼크기는 작음 => 매우큰 보조스트림 사용
//        장점 : 성능향상 , 사용법 : new 보조스트림(기본스트림변수)
        BufferedReader bufferedReader
                = new BufferedReader(reader);

//        1) 열기 2) 반복문 : [파일끝(-1)], 1라인씩 읽기 함수=>끝(null)
        while (true) {
            String data = bufferedReader.readLine();
//            파일끝 : null
            if(data == null) break;
//            화면 출력
            System.out.println(data);
        }
        bufferedReader.close();          // 파일 닫기
    }
}