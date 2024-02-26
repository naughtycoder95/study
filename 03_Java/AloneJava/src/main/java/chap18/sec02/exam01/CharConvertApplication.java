package chap18.sec02.exam01;

import java.io.*;

/**
 * packageName : chap18.sec02.exam01
 * fileName : CharConvertApplication
 * author : GGG
 * date : 2024-02-19
 * description : 보조스트림
 * 요약 :
 *      1) 보조스트림 : 다른 스트림과 결합되어 편리한 기능을 제공하는 클래스
 *      2) 결합 : 데코레이션 패턴 이용
 *          사용법 : new 보조스트림(new 기본스트림);
 *          예) 문자변환, 성능향상 등
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class CharConvertApplication {

    //    쓰기용 전역함수 : write(String str){}
    public static void write(String str) throws Exception {
        //        열기 : 1byte 쓰기용
        FileOutputStream fileOutputStream
                = new FileOutputStream("src/main/resources/test1.txt");

//        보조스트림 이용 -> 문자기반 파일로 변경가능
        Writer writer = new OutputStreamWriter(fileOutputStream);
//        버퍼 출력
        writer.write(str); // 매개변수를 버퍼에 쓰기
        writer.flush();    // 파일 쓰기
        writer.close();    // 파일 닫기
    }

    //    읽기 전역 함수
    public static String read() throws Exception {
//        읽기용 열기 : 1byte 파일
        FileInputStream fileInputStream =
                new FileInputStream("src/main/resources/test1.txt");

//        보조스트림 : new InputStreamReader(new 기본스트림)
//        이진파일 -> 문자기반 열기로 변환
        Reader reader = new InputStreamReader(fileInputStream);

//        성능향상 배열 준비
        char[] buffer = new char[100];
        int readCharNum = reader.read(buffer); // 100문자 읽기 -> buffer 저장
        reader.close(); // 파일 닫기

//      (참고) char[] => 문자열로(String) 변환
        String data = new String(buffer, 0, readCharNum);

        return data;
    }

    public static void main(String[] args) throws Exception {

    }
}