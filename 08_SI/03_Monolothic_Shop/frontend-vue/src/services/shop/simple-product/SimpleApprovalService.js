// SimpleApprovalService.js
// 주문 공통 CRUD 함수
import http from "@/utils/http-common";

class SimpleApprovalService {
    // TODO: 결재 저장함수
    create(data) {
        return http.post("/shop/simple-approval", data);
    }
}

export default new SimpleApprovalService();