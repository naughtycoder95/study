// CustomerList.vue // vueInit
<template>
  <div>
    <!-- 연습) 부트스트랩 테이블에 cutomer.json 데이터를 반복문을 이용해서 출력하세요 -->
    <!-- TODO: 테이블 : ctrl + alt + l -->
    <table class="table">
      <!-- TODO: 테이블 제목 -->
      <thead>
        <tr>
          <!-- TODO: 1열 : th 태그(굵은글씨) -->
          <th scope="col">고객번호(cid)</th>
          <th scope="col">고객명(fullName)</th>
          <th scope="col">이메일(email)</th>
          <th scope="col">전화번호(phone)</th>
        </tr>
      </thead>
      <!-- TODO: 테이블 본문 -->
      <!-- TODO: 사용법 : v-for="(data, index) in 배열" :key="index" -->
      <tbody>
        <!-- TODO: 1행 : tr 태그 -->
        <tr v-for="(data, index) in customer" :key="index">
          <!-- TODO: 1열 : td 태그 -->
          <td>{{ data.cid }}</td>
          <td>{{ data.fullName }}</td>
          <td>{{ data.email }}</td>
          <td>{{ data.phone }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>
<script>
// js 코딩
// TODO: 1) CustomerService.js 에 임포트 (why? getAll() 함수사용)
// TODO: 2) 빈 배열 속성 준비 : customer 배열 정의 (why? 결과를 담기위해)
// TODO: 3) getAll() 함수를 실행할 뷰 함수(methods) 정의 : retrieveCustomer()
// TODO: 4) mounted() 함수 정의 : 화면이 뜰때 retrieveCustomer() 자동실행하게 함
import CustomerService from "../services/CustomerService";

export default {
    data() {
        return {
            customer: [] // 빈배열 준비
        }
    },
    methods: {
        async retrieveCustomer() {
            // TODO: (연습) getAll() 함수 실행 : 비동기 코딩 해야함
            try {
                // 실행문 
                let response = await CustomerService.getAll(); // 프라미스 함수
                // 콘솔 출력 
                // TODO: response.data == json 파일(데이터)
                console.log(response.data);
                // 바인딩 속성 저장 : customer : []
                this.customer = response.data.customer;
            } catch(e) {
                console.log(e);
            }
        }
    },
    mounted() {
        this.retrieveCustomer();
    },
};
</script>
<style lang=""></style>
