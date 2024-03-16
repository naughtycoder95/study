package org.example.modelexam.service.exam01;

import org.example.modelexam.dao.MemberDao;
import org.example.modelexam.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : org.example.modelexam.service.exam01
 * fileName : MemberService
 * author : GGG
 * date : 2024-03-13
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-13         GGG          최초 생성
 */
@Service
public class MemberService {
//    연습 1:
//    MemberService 클래스를 만들고 findAll() 함수를 정의한다.
//     ( MemberDao : DB 조회/수정/삭제/추가 함수가 있는 클래스 )
//    MemberController 클래스를 만들어서 getMemberAll() 함수를 정의하고,
//    샘플데이터 뷰로(jsp : exam01/member/member_all.jsp) 전송해 보세요.
//     url : /member
//     jsp : exam01/member/member_all.jsp

    @Autowired
    MemberDao memberDao; // DB 조회/수정/삭제/추가 함수 있는 클래스

    /**
     * 전체 조회 : 멤버 클래스
     * @return 멤버 배열
     */
    public List<Member> findAll() {
//        TODO: 멤버 전체 조회
        List<Member> list = memberDao.selectAll();

        return list;
    }

//  todo: 연습 2)
//    MemberService 클래스를 만들고 findById() 함수를 정의한다.
//    MemberController 클래스를 만들어서 getMemberId() 함수를 정의하고,
//    샘플데이터 뷰로(jsp : member_id.jsp) 전송해 보세요.
//    url : /member/{eno}
//    jsp : exam01/member/member_id.jsp
//    url test : http://localhost:8000/exam01/member/7369
    public Member findById(long eno) {
//        TODO: DB 상세조회(1건 == 객체 1개)
        Member member = memberDao.selectById(eno);

        return member;
    }

//  todo: 연습 3)
//    MemberService 클래스를 만들고 save() 함수를 정의한다.
//    MemberController 클래스를 만들어서 addMember()
//    addMember()
//    - url : /member/addition
//    - jsp : exam01/member/add_member.jsp
    /**
     * 회원 저장 함수
     * @param member
     * @return
     */
    public List<Member> save(Member member) {

        List<Member> list = null;

//      todo: ui(frontend) -> insert (사원번호가 없으면)
        if(member.getEno() == null) {
//          todo: 새로운 사원번호 생성
            int count = memberDao.selectAll().size(); // 전체 건수
            int newEno = count + 8000;
            member.setEno(newEno); // 새로운 사원번호 저장

            //      todo: db 저장
            list = memberDao.insert(member);
        } else {
//            사원번호 있음 : 정보를 수정
            list = memberDao.update(member);
        }

        return list;
    }

//    삭제시 조건식에(기본키(사원번호)) 해당되는 것만 삭제
    public boolean removeById(int eno) {
//        TODO: DB 삭제 실행
//          => return : 삭제된 건수
        int count = memberDao.deleteById(eno);
//        TODO: count > 0 이면 삭제잘됐음, 아니면 삭제 안됐음
        return (count > 0)? true : false;
    }

}
