// CustomerService.js : axios 공통함수 정의
import http from "@/utils/HttpCommon"

// 객체 정의 : 1) let 변수 = {속성:값, 함수:function(){}}
// es6 class 객체 정의 : 2) class 객체명{함수명(){}}
class CustomerService {
    // 함수정의 : getAll()
    getAll() {
        // TODO: axios .get() : json 파일 읽어서 가져오는 함수
        return http.get("/customer.json");
    }
}
// class 객체 사용 : new CustomerService()
export default new CustomerService();

// 객체의 속성, 함수 사용 : 예) 객체.속성명, 객체.함수명(), CustomerService.getAll()