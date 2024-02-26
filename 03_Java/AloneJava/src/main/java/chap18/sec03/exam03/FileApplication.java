package chap18.sec03.exam03;

import java.io.File;

/**
 * packageName : chap18.sec03.exam03
 * fileName : File
 * author : GGG
 * date : 2024-02-19
 * description : (참고) File 클래스
 * 요약 :
 *      1) 파일생성 , 폴더 생성 , 폴더 안에 정보 보기 등
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class FileApplication {
    public static void main(String[] args) throws Exception {
        File dir = new File("src/main/resources/images");
        File file = new File("src/main/resources/file1.txt");
//        폴더 만들기 : 변수.mkdir()
        dir.mkdir();
//        파일 만들기 : 변수.createNewFile();
        file.createNewFile();

//        폴더 내 정보보기 : 폴더, 파일 등
        File temp = new File("src/main/resources/");
        File[] contents = temp.listFiles();  // 폴더내 정보를 배열로 가져옴

        System.out.println(contents[0].getName()); // file1.txt : 파일
        System.out.println(contents[1].getName()); // images    : 폴더

    }
}