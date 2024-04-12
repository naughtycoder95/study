// SimpleOrderList.vue // 주문 전체 조회 페이지(핵심:복잡) // vueInit
<template>
  <div>
    <!-- {/* dname start */} -->
    <div class="row mb-5 justify-content-center">
      <!-- {/* w-50 : 크기 조정, mx-auto : 중앙정렬(margin: 0 auto), justify-content-center */} -->
      <div class="col-12 w-50 input-group mb-3">
        <input type="text" 
                class="form-control" 
                placeholder="제목검색" 
                v-model="searchTitle"
        />
        <div class="input-group-append">
          <button class="btn btn-outline-secondary" 
                type="button"
                @click="retrieveSimpleCart"
            >
            검색
          </button>
        </div>
      </div>
    </div>
    <!-- {/* dname end */} -->

    <!-- {/* paging 시작 */} -->
    <div class="col-12 w-25 mb-3">
      1페이지당 개수 :
      <select
        class="form-select form-select-sm"
        v-model="pageSize"
        @change="pageSizeChange"
      >
        <option v-for="(data, index) in pageSizes" :key="index" :value="data">
          {{ data }}
        </option>
      </select>
    </div>

    <b-pagination
      class="col-12 mb-3"
      v-model="page"
      :total-rows="count"
      :per-page="pageSize"
      @click="retrieveSimpleCart"
    ></b-pagination>
    <!-- {/* paging 끝 */} -->

    <div class="row">
      <div v-for="(data,index) in simpleCart" 
            :key="index"
            class="card mb-3"
        >
        <!-- 반복문 : card -->
        <div class="row g-0 p-3">
          <div class="col-md-4 p-3 border">
            <img
              :src="data.imgPath"
              class="img-fluid rounded-start"
              alt="..."
              style="{ height: 15 + 'vh', width: 5 + 'vw' }"
            />
          </div>
          <div class="col-md-8">
            <div class="card-body">
              <h5 class="card-title">물품명     : {{data.title}}</h5>
              <h5 class="card-title">물품가격   : {{data.unitPrice * data.cartCount}}</h5>
              <h5 class="card-title">장바구니 개수 :{{data.cartCount}}</h5>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- {/* 배송지 시작 */} -->
    <div class="col-12 mx-auto">
      <div class="row g-3 align-items-center mb-3">
        <div class="col-3">
          <label htmlFor="deliveryAddr" class="col-form-label">
            배송주소
          </label>
        </div>

        <div class="col-9">
          <input
            type="text"
            id="deliveryAddr"
            required
            class="form-control"
            placeholder="배송지 주소"
            name="deliveryAddr"
            v-model="deliveryAddr"
          />
        </div>
      </div>

      <div class="row g-3 align-items-center mb-3">
        <div class="col-3">
          <label htmlFor="deliveryMsg" class="col-form-label">
            배송 메세지
          </label>
        </div>
        <div class="col-9">
          <input
            type="text"
            id="deliveryMsg"
            required
            class="form-control"
            placeholder="배송 메세지"
            name="deliveryMsg"
            v-model="deleveryMsg"
          />
        </div>
      </div>
    </div>

    <!-- {/* 배송지 끝 */} {/* 버튼 시작 */} -->
    <div class="row d-flex justify-content-end">
      <!-- {/* 취소 버튼 시작 */} -->
      <button type="button" 
                class="btn btn-danger w-25 me-3"
                @click="cancelOrder"
        >
        주문 취소
      </button>
      <!-- {/* 취소 버튼 끝 */} {/* 결재 버튼 시작 */} -->
      <button type="button" 
            class="btn btn-warning w-25"
            @click="goApproval"
        >
            결재
        </button>
      <!-- {/* 결재 버튼 끝 */} -->
    </div>
    <!-- {/* 버튼 끝 */} -->
  </div>
</template>
<script>
import SimpleCartService from "@/services/shop/simple-product/SimpleCartService";
import SimpleOrderService from "@/services/shop/simple-product/SimpleOrderService";

export default {
  // TODO: 데이터 바인딩 속성 정의
  data() {
    return {
      simpleCart: [], // 장바구니 객체배열
      searchTitle: "", // 검색어

      // 배송 입력 속성 정의
      deliveryAmount: 3000, // 기본 : 3000, 배송비
      deliveryAddr: "", // 배송지 주소
      deleveryMsg: "", // 배송 메세지

      // 공통 페이징 속성
      page: 1, // 현재페이지번호
      count: 0, // 전체 데이터개수
      pageSize: 3, // 화면에 보여질 개수

      pageSizes: [3, 6, 9], // 화면에 보여질 개수배열
    };
  },
  //   TODO: 함수 정의
  methods: {
    // TODO: 장바구니 전체 조회 : 화면 뜰때 실행
    async retrieveSimpleCart() {
      try {
        // TODO: 공통 장바구니 전체 조회 서비스 함수 실행
        // TODO: 비동기 코딩 : async ~ await
        let response = await SimpleCartService.getAll(
          this.searchTitle,
          this.page - 1,
          this.pageSize
        );
        const { simpleCart, totalItems } = response.data;
        this.simpleCart = simpleCart;
        this.count = totalItems;
        // 로깅
        console.log(response.data); // 웹브라우저 콘솔탭에 벡엔드 데이터 표시
      } catch (e) {
        console.log(e); // 웹브라우저 콘솔탭에 에러 표시
      }
    },
    // TODO: 주문 함수 : 1) 주문 테이블 + 주문상세 테이블 insert
    // TODO:            2) 결재 페이지로 이동
    async goApproval() {
        // 1) TODO: 주문날짜 : 현재날짜 
        let now = new Date(); // js 날짜 객체
        // 날짜포맷 : yyyy-mm-dd hh:mi:ss 형태
        // 년도 : now.getFullYear()
        // 월   : now.getMonth()
        // 일   : now.getDate()
        // 시   : now.getHours()
        // 분   : now.getMinutes()
        // 초   : now.getSeconds()
        let formatNow = `${now.getFullYear()}-${now.getMonth()}-${now.getDate()} ${now.getHours()}:${now.getMinutes()}:${now.getSeconds()}`;

        // 2) TODO: 장바구니의 상품별 금액 = 단가(unitPrice) * 개수(cartCount)
        //          모든 상품별 총금액
        // 배열변수에 사용하는 함수 : map, foreach, filter 등 + reduce
        // reduce => 매개변수의 값을 계속 누적시켜 합또는 차를 구할수 있는 함수
        // 누적합 알고리즘 : 누적변수 = 누적변수 + 배열값
        let totalPrice = this.simpleCart
                    .map((data)=> data.unitPrice * data.cartCount) // 상품별 금액 배열
                    // 사용법 : reduce((누적변수, 배열값) => 누적변수 + 배열값);
                    .reduce((acc, cur) => acc + cur);              // 총금액

        // 3) TODO: 주문상세 객체 정의 => 배열이 되어야함
        //       => 예) 주문번호(1) -> 주문상태(50001) : 주문(부모)
        //       =>     주문번호(1) -> 상품명(연필) , 상품이미지, 장바구니개수(5) 
        //       =>     주문번호(1) -> 상품명(샤프) , 상품이미지, 장바구니개수(1) 
        //       =>     주문번호(1) -> 상품명(지우개) , 상품이미지, 장바구니개수(2) 
        let simpleOrderDetail = {
            sono: null,                    // 주문번호(null : 시퀀스사용)
            spno: 0,                       // 상품번호
            productCount: 0                // 장바구니개수
        };
        // 주문상세 배열
        let simpleOrderDetailList = [];    // 주문상세 객체배열 정의

        // 위의 주문상세 배열 만들기
        // 반복문 : js의 향상된 for문 : forof
        for (const data of this.simpleCart) {
            simpleOrderDetail.spno = data.spno;              // 상품번호
            simpleOrderDetail.productCount = data.cartCount; // 상품개수
            
            // 주문상세배열에 위의 주문상세객체를 넣기
            // 사용법 : 배열변수.push(값); // 배열에 넣기 함수
            simpleOrderDetailList.push(simpleOrderDetail);    // 객체배열
        }

        // 4) TODO: 벡엔드(spring) insert 요청
        //    TODO: 비동기 코딩 async ~ await
        try {
          // TODO: 임시 주문 객체 : 주문상세객체배열 속성이 있음 
          let data = {
            simpleOrderDetailList: simpleOrderDetailList,   // 주문상세 객체배열(주문상세 테이블 insert)
            orderDate: formatNow,                           // 주문날짜
            // 주문상태(50001: 주문완료, 50002: 결재완료, 50011:결재취소) 
            orderStatus: 50001,                             // 주문상태
            productAmount: totalPrice,                      // 상품 총금액
            deliveryAmount: this.deliveryAmount,            // 배달비(3000 : 하드코딩)
            orderAmount:  totalPrice + this.deliveryAmount, // 주문금액 = 총금액 + 배달비
            deliveryAddr: this.deliveryAddr,                // 배달 주소
            deliveryMsg: this.deliveryMsg                   // 배달 메세지
          }
          // TODO: 공통 주문추가(create) 서비스 함수 실행
          let response = await SimpleOrderService.create(data);
          // 로깅
          console.log(response.data);
          // 결재 페이지로 이동 : 결재 api 사용하면 여기 코딩
          // => 주문번호(response.data.sono) 도 전송
          this.$router.push("/simple-approval/" + response.data.sono);
        } catch(e) {
          console.log(e); // 에러 출력
        }
    },
    // TODO: 주문 취소 : 장바구니 전체 페이지로 다시 이동
    cancelOrder() {
        this.$router.push("/simple-cart");
    },
    // TODO: 공통 페이징 함수 : select 태그
    pageSizeChange() {
      this.page = 1; // 현재페이지번호 : 1
      this.retrieveSimpleCart(); // 재조회
    },
  },
  //   TODO: 화면이 뜰때 장바구니 전체 조회
  mounted() {
    this.retrieveSimpleCart();
  },
};
</script>
<style></style>
