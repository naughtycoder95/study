// EmpService.js
import http from "@/utils/http-common";

class EmpService {
    // TODO: 전체 조회
    getAll(ename, page, size) {
        return http.get(`/basic/emp?ename=${ename}&page=${page}&size=${size}`);
    }

    create(data) {
        return http.post("/basic/emp", data);
    }
}

export default new EmpService();