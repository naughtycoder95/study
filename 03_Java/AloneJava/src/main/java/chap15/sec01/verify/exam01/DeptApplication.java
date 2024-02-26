package chap15.sec01.verify.exam01;

import java.util.List;

/**
 * packageName : chap15.sec01.verify.exam01
 * fileName : DeptApplication
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
public class DeptApplication {
    public static void main(String[] args) {
// TODO: 연습문제) 실행 클래스의 결과가 다음과 같도록 DeptDao 의 createDept() 함수에
//         List 의 자료를 추가하는 로직을 작성하세요.
//    결과 :
//      10 Sales       부산
//      20 Marketing   서울
//      30 Research    대전
        DeptDao deptDao = new DeptDao();
        List<Dept> deptList = deptDao.createDept(); // 자료 생성

//      향상된 for 문 == 고전 for 문 : for (int i = 0; i < ; i++) {}
//      TODO: for(자료형 변수 : 배열){실행문} // 배열끝까지 자동 증가
        for(Dept dept : deptList) {
            System.out.println(dept.getDno() + " " + dept.getDname()
                    + " " + dept.getLoc());
        }
    }
}