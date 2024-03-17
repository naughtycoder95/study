package org.example.modelexam.service.exam01;

import org.example.modelexam.dao.DeptDao;
import org.example.modelexam.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : org.example.modelexam.service.exam01
 * fileName : DeptService
 * author : GGG
 * date : 2024-03-13
 * description : 부서 조회 예제
 * 요약 :
 *    TODO:
 *      spring 코딩 : MVC 디자인 패턴에 의해 코딩함
 *      1) C(Controller) : 화면 + 모델을 연결시켜주는 역할, url 이 있고 jsp 로 결과를 보내줌
 *      2) M(Model)     : 데이터 저장/수정/삭제/추가 하는 곳
 *          entity      : 데이터를 저장하는곳 , DB 테이블과 똑같이 생김
 *          service     : 데이터 조회/수정/삭제/추가 하는 함수를 정의하는 곳
 *                        업무 로직을 담당하는 코딩이 작성됨
 *      3) 최종 코딩 :  1) service 함수를 정의
 *                    2) controller 에서 그 service 함수를 호출해서 결과를 jsp 로 전송함
 *      4) 테이블의 컬럼이 모델 클래스 의 속성(필드)와 같음 (컬럼 == 속성(필드))
 *         - 테이블의 1행이 모델 클래스(객체) 1개와 같음 (테이블 1행 == 객체 1개)
 *         - 테이블의 데이터 객체배열과 같음  (테이블 데이터 == 객체배열)
 *      5) 어노테이션 :
 *          - @Service   : 업무 로직을 담당하는 클래스 위에 붙여서 사용하는 어노테이션
 *              DB 조회/수정/삭제/추가 하는 함수를 정의하는 곳
 *              => 스프링 서버(컨테이너)가 실행될때 @Service 붙은 클래스는 미리 객체 생성해둠
 *                  (클래스 변수 = new 생성자함수())
 *              => IOC : (제어의 역전) , 스프링이 객체생성권을 가지고 있음(개발자 없음)
 *              => 개발할때 개발자는 미리 생성해둔 객체를 받아서 사용 사용
 *              예) 스프링이 객체를 만들어 주는 어노테이션 예시 :
 *                  - @Service
 *                  - @Component, @Repository, @Mapper 등
 *          - @Autowired : 미리 생성해둔 객체를 받는 어노테이션
 *              => DI : (의존성 주입)
 *              => 1) 변수         : 아래 예제는 변수위에 @Autowired 붙여서 그이름로 객체가져옴
 *              => 2) 생성자        : 생성자 붙일수 있음
 *              => 3) Setter 함수  : Setter 함수에도 붙일 수있음
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-13         GGG          최초 생성
 */
@Service
public class DeptService {

    @Autowired
    DeptDao deptDao; // DB 조회/수정/삭제/추가 함수가 있는 클래스

    /**
     * 전체 조회
     * @return : 부서 객체 배열
     */
    public List<Dept> findAll() {
//        DB 전체 조회 : 부서 테이블
        List<Dept> list = deptDao.selectAll();

        return list;
    }

    /**
     * DB 상세조회 : 1건(객체1개)
     * @param dno(부서번호)
     * @return 부서 객체
     */
    public Dept findById(long dno) {
//        TODO: DB 상세조회(1건==객체1개) 함수 호출
//          상세조회 : 기본키로 조회하는 것을 의미
        Dept dept = deptDao.selectById(dno);

        return dept;
    }

    /**
     * 부서 정보 저장 함수
     * @param dept(새로운 부서 객체)
     * @return 부서 배열(새로운 부서 포함된 배열)
     */
    public List<Dept> save(Dept dept) {
//      TODO: 프론트 전달 값 : dname(부서명), loc(부서위치)
//        [참고] dno(부서번호) : 자동생성(DB : 시퀀스)
//        3) dept 의 setter 함수(속성 수정/저장함수)
//           - dept.setDno(50)
//        4) DB 에 저장
//           - deptDao.insert(dept);
        List<Dept> list = null;
        if(dept.getDno() == null) {
//         TODO: 부서 추가(insert)
//        1) dept 객체의 dno 가 null 이면 자동생성
//        2) dept 부서 테이블의 전체 건수 구한후 : 4건(10 ~ 40)
//            List/ArrayList 배열크기 함수 : .size()
            int count = deptDao.selectAll().size();
//        3) 새로운 번호 : (크기 + 1) * 10
            int newNum = (count + 1) * 10;
//        4) dept 의 setter 함수(속성 수정/저장함수)
            dept.setDno(newNum);
            //      TODO: DB 저장함수 (insert 함수)
            list = deptDao.insert(dept);
        }
        else {
//            TODO: 부서 수정(update)
            list = deptDao.update(dept);
        }
        return list;
    }

    /**
     * 부서번호(dno) 로 삭제하는 함수
     * @param dno(부서번호)
     * @return 참/거짓
     */
    public boolean removeById(int dno) {

//        TODO: DB 삭제 함수 실행
//         => 삭제후 return 값은 삭제한 개수가 나옴
        int count = deptDao.deleteById(dno);

        return (count > 0)? true : false;
    }
}
