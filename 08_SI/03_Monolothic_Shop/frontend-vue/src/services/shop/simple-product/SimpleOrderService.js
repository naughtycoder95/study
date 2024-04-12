// SimpleOrderService.js
// 주문 공통 CRUD 함수
import http from "@/utils/http-common";

class SimpleOrderService {
    // TODO: 주문 저장함수
    create(data) {
        return http.post("/shop/simple-order", data);
    }
    // TODO: 주문 상세조회
    get(sono) {
        return http.get(`/shop/simple-order/${sono}`);
    }
}

export default new SimpleOrderService();