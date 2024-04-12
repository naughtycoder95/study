// SimpleApprovalList.vue(참고) // 결재 페이지 // vueInit
<template>
  <div>
    <h1>SimpleApproval</h1>

    <div class="col-md-12">
      <!-- {/* table start */} -->
      <table class="table">
        <thead>
          <tr>
            <th scope="col">sono<br />&nbsp;</th>
            <th scope="col">order<br />Date</th>
            <th scope="col">order<br />Status</th>
            <th scope="col">product<br />Amount</th>
            <th scope="col">delivery<br />Amount</th>
            <th scope="col">order<br />Amount</th>
            <th scope="col">delivery<br />Addr</th>
            <th scope="col">delivery<br />Msg</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <!-- ? : 변수? => 변수가 null 이면 undefined 로 바꿔줌 : null 방지 방법 -->
            <td>{{ simpleOrder?.sono }}</td>
            <td>{{ simpleOrder?.orderDate }}</td>
            <td>{{ simpleOrder?.orderStatus }}</td>
            <td>{{ simpleOrder?.productAmount }}</td>
            <td>{{ simpleOrder?.deliveryAmount }}</td>
            <td>{{ simpleOrder?.orderAmount }}</td>
            <td>{{ simpleOrder?.deliveryAddr }}</td>
            <td>{{ simpleOrder?.deliveryMsg }}</td>
          </tr>
        </tbody>
      </table>
      <!-- {/* table end */} -->
    </div>

    <h1>관리자 패널</h1>

    <div class="row d-flex justify-content-end">
      <button
        type="button"
        class="btn btn-danger w-25 me-3"
        @click="cancelApproval"
      >
        결재취소
      </button>

      <button
        type="button"
        class="btn btn-warning w-25"
        @click="confirmApproval"
      >
        결재확정
      </button>
    </div>
  </div>
</template>
<script>
import SimpleOrderService from "@/services/shop/simple-product/SimpleOrderService";
import SimpleApprovalService from "@/services/shop/simple-product/SimpleApprovalService";
export default {
  // TODO: 데이터 바인딩 속성 정의
  data() {
    return {
      simpleOrder: null, // 주문 객체
      simpleApproval: null, // 결재 객체
      sono: this.$route.params.sono, // 주문번호
    };
  },
  // TODO: 함수 정의
  methods: {
    // TODO: 주문 상세조회 함수 : 화면이 뜰때 실행
    async retrieveSimpleOrder(sono) {
      // TODO: 공통 주문 상세조회 서비스 함수 실행
      try {
        let response = await SimpleOrderService.get(sono);
        this.simpleOrder = response.data;
        // 로깅
        console.log(response.data); // 웹브라우저 콘솔탭
      } catch (e) {
        console.log(e); // 웹브라우저 콘솔탭
      }
    },
    // TODO: 결재 확정 함수(*)     : 결재 버튼
    async confirmApproval() {
      // TODO: 1) 결재날짜 : 현재날짜
      let now = new Date();
      // 날짜포맷 : yyyy-mm-dd hh:mi:ss
      let formatNow = `${now.getFullYear()}-${now.getMonth()}-${now.getDate()} ${now.getHours()}:${now.getMinutes()}:${now.getSeconds()}`;
      // TODO: 2) 임시 객체 정의
      let data = {
        sano: null, // 결재번호
        sono: this.simpleOrder?.sono, // 주문번호
        approvalDate: formatNow, // 결재날짜
        approvalAmount: this.simpleOrder?.orderAmount, // 주문금액==결재금액
      };

      // TODO: 3) 결재 테이블에 insert 실행
      // TODO: 공통 결재 추가 서비스 함수 실행
      try {
        let response = await SimpleApprovalService.create(data);
        this.simpleApproval = response.data; // 결재된 객체
        // 로깅
        console.log(response.data);
        // alert 대화상자
        alert("결재가 완료되었습니다.");
        // 주문상태 : 50001(주문완료) -> 50002(결재완료)
        // 주문 상세조회 재조회
        this.retrieveSimpleOrder(this.$route.params.sono);
      } catch (e) {
        console.log(e);
      }
    },
    // TODO: 결재 취소 함수     : 결재취소 버튼
    cancelApproval() {},
  },
  // TODO: 화면이 뜰때 실행되는 함수
  mounted() {
    // TODO: 화면이 뜰때 주문 상세 조회 실행
    this.retrieveSimpleOrder(this.$route.params.sono);
  },
};
</script>
<style></style>
