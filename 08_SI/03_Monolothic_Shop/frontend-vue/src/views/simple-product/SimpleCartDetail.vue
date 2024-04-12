// SimpleCartDetail.vue // 장바구니 상세화면 // vueInit
<template>
  <div class="mt-5">
    <div v-if="simpleProduct" class="card mb-3">
      <div class="row g-0">
        <div class="col-md-4">
          <!-- 상품 상세조회 이미지 -->
          <img
            :src="simpleProduct.imgPath"
            class="img-fluid rounded-start"
            alt="..."
          />
        </div>
        <div class="col-md-8">
          <div class="card-body">
            <!-- 상품명 -->
            <h5 class="card-title">{{ simpleProduct.title }}</h5>
            <!-- 단가 -->
            <h5 class="card-title">₩ {{ simpleProduct.unitPrice }}</h5>
            <p class="card-text">
              영원한 아이콘인 {{ simpleProduct.title }} 으로 스타일링 해보세요.
              <br />
              또한, 4계절을 함께 할 {{ simpleProduct.title }} 으로 여러분의 OOTD
              를 표현해 보세요.
            </p>

            <div
              class="btn-group col"
              role="group"
              aria-label="Basic outlined example"
            >
              <!-- 장바구니 개수 감소 버튼  -->
              <button
                type="button"
                class="btn btn-outline-secondary opacity-50"
                @click="decreaseCount"
              >
                -
              </button>
              <!-- 장바구니 개수 표시 : 버튼제목 -->
              <button type="button" class="btn btn-outline-dark" disabled>
                {{ cartCount }}
              </button>
              <!-- 장바구니 개수 증가 버튼 -->
              <button
                type="button"
                class="btn btn-outline-secondary opacity-50"
                @click="increaseCount"
              >
                +
              </button>
            </div>
            <!-- 장바구니 담기 버튼 -->
            <div class="mt-3">
              <button
                type="submit"
                @click="saveSimpleCart"
                class="btn btn-primary w-25"
              >
                장바구니 담기
              </button>
              <!-- 장바구니 가기 버튼 -->
              <button
                type="submit"
                @click="goSimpleCart"
                class="btn btn-success w-25 ms-2"
              >
                장바구니 가기
              </button>
            </div>
            <!-- 주문하기 버튼 -->
            <div class="mt-3">
              <button
                type="button"
                @click="goOrder"
                class="btn btn-warning w-25"
              >
                주문하기
              </button>
            </div>

            <p v-if="message" class="alert alert-success mt-3 text-center">
              {{ message }}
            </p>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import SimpleProductService from "@/services/shop/simple-product/SimpleProductService";
import SimpleCartService from "@/services/shop/simple-product/SimpleCartService";

export default {
  // TODO: 데이터 바인딩 속성 정의
  data() {
    return {
      simpleProduct: null, // 상품객체
      message: "", // 장바구니 추가 성공메세지(화면에 출력)
      cartCount: 0, // 장바구니 개수
    };
  },
  // TODO: 함수 정의
  methods: {
    // TODO: 상품 상세조회 : 상품번호(spno)
    async getSimpleProduct(spno) {
      // TODO: 공통 상품 상세조회 서비스 실행
      // TODO: 비동기 코딩 : async ~ await
      try {
        let response = await SimpleProductService.get(spno);
        this.simpleProduct = response.data; // spring 전송 객체 넣기
        // 로깅
        console.log(response.data);
      } catch (e) {
        console.log(e); // 콘솔에 에러 출력
      }
    },
    // TODO: 장바구니 담기(저장)
    async saveSimpleCart() {
      try {
        // 임시 객체
        let data = {
          spno: this.simpleProduct.spno, // 상품번호
          cartCount: this.cartCount, // 장바구니 개수
        };

        // TODO: 공통 저장 서비스 함수 실행
        // TODO: async ~ await
        let response = await SimpleCartService.create(data);
        // 로깅
        console.log(response.data);
        // 장바구니 담기 성공 메세지 출력
        this.message = "장바구니에 잘 담겼습니다.";
      } catch (e) {
        console.log(e);
      }
    },
    // TODO: 장바구니 전체 조회페이지 이동함수
    goSimpleCart() {
        this.$router.push("/simple-cart");
    },
    // TODO: 장바구니 개수 증가 함수
    increaseCount() {
      this.cartCount += 1;
    },
    // TODO: 장바구니 개수 감소 함수
    decreaseCount() {
      if (this.cartCount > 0) {
        this.cartCount -= 1;
      }
    },
    // TODO: 주문하기 페이지로 이동 함수(참고)
    goOrder() {},
  },
  // TODO: 화면이 뜰때 자동 실행 함수
  mounted() {
    // TODO: 화면이 뜰때 상품 상세조회 : 상품번호(spno)
    this.getSimpleProduct(this.$route.params.spno);
  },
};
</script>
<style></style>
