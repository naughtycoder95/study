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

  get(eno) {
    return http.get(`/basic/emp/${eno}`);
  }

  // TODO: 수정함수 : 사원번호(eno), 수정할객체(data)
  update(eno, data) {
    return http.put(`/basic/emp/${eno}`, data);
  }

  // TODO: 삭제함수 : 사원번호(eno)
  delete(eno) {
    return http.delete(`/basic/emp/deletion/${eno}`);
  }
}

export default new EmpService();
