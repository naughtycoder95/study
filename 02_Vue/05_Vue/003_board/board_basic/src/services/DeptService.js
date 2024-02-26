// DeptService.js : axios 함수들 정의
// HttpCommon.js (axios 임포트 되어 있음)
import http from "../utils/HttpCommon";

// axios 공통 함수 정의 
// es6 사용법 : class => 객체 정의(함수정의, 속성)
// TODO :복습 사용법 : class 객체명 { 함수(){} }
class DeptService {
    // 부서 조회 함수 
    // json 데이터(파일) 읽기(조회) : get("url")
    getAll() {
        // dept.json : 객체배열(결과)
        return http.get("/dept.json");
    }
}

export default new DeptService();