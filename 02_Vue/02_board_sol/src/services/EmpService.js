import http from '../utils/HttpCommon'

// springboot 연결하기 위한 메소드 정의
class EmpService {
    // 모든 회원 조회
    getAll() {
        return http.get("/emp.json");
    }
}

export default new EmpService()