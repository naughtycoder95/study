// EmpService.js
import http from "@/utils/http-common";
import AuthHeader from "../auth/AuthHeader";

class EmpService {
  // TODO: 전체 조회
  getAll(ename, page, size) {
    return http.get(`/basic/emp?ename=${ename}&page=${page}&size=${size}`,{
      headers: AuthHeader()
    });
  }

  create(data) {
    return http.post("/basic/emp", data,{
      headers: AuthHeader()
    });
  }

  get(eno) {
    return http.get(`/basic/emp/${eno}`,{
      headers: AuthHeader()
    });
  }

  // TODO: 수정함수 : 사원번호(eno), 수정할객체(data)
  update(eno, data) {
    return http.put(`/basic/emp/${eno}`, data,{
      headers: AuthHeader()
    });
  }

  // TODO: 삭제함수 : 사원번호(eno)
  delete(eno) {
    return http.delete(`/basic/emp/deletion/${eno}`,{
      headers: AuthHeader()
    });
  }
}

export default new EmpService();