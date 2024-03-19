package org.example.jpaexam.service.basic;

import org.example.jpaexam.model.entity.basic.Dept;
import org.example.jpaexam.model.entity.basic.Emp;
import org.example.jpaexam.repository.basic.DeptRepository;
import org.example.jpaexam.repository.basic.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : org.example.jpaexam.service.basic
 * fileName : EmpService
 * author : kimtaewan
 * date : 2024-03-19
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-19         kimtaewan          최초 생성
 */
@Service
public class EmpService {

    //    DB CRUD 클래스 받기 : JPA 제공 함수 사용 가능
    @Autowired
    EmpRepository empRepository;

    /**
     * 전체 조회 : 페이징 없음
     *
     * @return 부서 배열
     */
    public List<Emp> findAll() {
        List<Emp> list = empRepository.findAll();
        return list;
    }
}