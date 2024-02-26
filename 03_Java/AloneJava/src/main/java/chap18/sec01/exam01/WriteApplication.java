package chap18.sec01.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * packageName : chap18.sec01.exam01
 * fileName : WriteApplication
 * author : GGG
 * date : 2024-02-16
 * description : 기본 입출력 스트림(InputStream/OutputStream)
 * 요약 :
 *      1) 디자인 패턴 : 데코레이션(장식) 패턴
 *      2) InputStream  : 입력용 (대상: 키보드, 파일 )
 *          - 1byte 기반 입력, 최상위(부모) 추상 클래스
 *          - 예) 자식클래스 : DataInputStream, BufferedInputStream 등
 *      3) OutputStream : 출력용 (대상: 모니터, 파일 )
 *          - 1byte 기반 출력, 최상위(부모) 추상 클래스
 *          - 예) 자식클래스 : DataOutputStream, BufferedOutputStream 등
 *      4) 이진파일(바이너리파일) vs 문자파일
 *          - 이진파일(바이너리파일) : 2진수 또는 16진수 등으로 되어있음
 *              예) 이미지파일, 동영상파일 등
 *          문자파일 : 텍스트로 되어있음 (메모장 등)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-16         GGG          최초 생성
 */
public class WriteApplication {
    public static void main(String[] args) throws Exception {
//        TODO: 입출력 순서
//              1) 파일 열기 : 있으면 열리고, 없으면 만들어짐(생성)
//              2) 글자 쓰기 : 이진파일은 안보임
//              3) 파일 닫기

//        1) 파일 쓰기용으로 열기 : 그레이들(빌드) 프로젝트 기본 경로 : src
        OutputStream outputStream = new FileOutputStream("src/main/resources/test1.db");

//        값을 변수에 저장
        byte a = 10;
        byte b = 20;
        byte c = 30;

//        2) 저장값을 파일에 쓰기 : 10, 20, 30
//           파일 입출력 : 속도가 굉장히 느림
//              => 횟수를 줄이기 위해 버퍼라는 공간에 미리 넣어두고 한번에 실행
        outputStream.write(a);      // 버퍼 공간에 저장
        outputStream.write(b);
        outputStream.write(c);

        outputStream.flush();       // 버퍼에 저장된 작업들 실행

//        3) 사용 후 파일 닫기
        outputStream.close();
    }
}