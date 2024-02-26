package chap15.sec01.verify.exam02;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : chap15.sec01.verify.exam02
 * fileName : EmpDao
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
public class EmpDao {
    public List<Emp> createEmp() {
//        객체(클래스) 생성해서 list 배열에 넣기 : .add(new 생성자함수());
        List<Emp> list = new ArrayList<>();
        list.add(new Emp(1, "Scott", 3000, 500, 10));
        list.add(new Emp(2, "Mark", 3500, 0, 20));
        list.add(new Emp(3, "Smith", 5000, 1000, 30));

        return list;
    }
}