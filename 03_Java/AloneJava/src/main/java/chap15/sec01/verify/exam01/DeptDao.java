package chap15.sec01.verify.exam01;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : chap15.sec01.verify.exam01
 * fileName : DeptDao
 * author : GGG
 * date : 2024-02-13
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class DeptDao {
    public List<Dept> createDept() {
        List<Dept> list = new ArrayList<>();
//        TODO: 이 안에 List 에 객체를 추가하는 코딩을 완성하세요
//           힌트 : .add(값) : 추가함수, 객체를 생성해서 배열에 넣기
//           객체(클래스)생성 : 클래스 변수 = new 생성자함수()
        list.add(new Dept(10, "Sales", "부산"));
        list.add(new Dept(20, "Marketing", "서울"));
        list.add(new Dept(30, "Research", "대전"));

        return list;
    }
}