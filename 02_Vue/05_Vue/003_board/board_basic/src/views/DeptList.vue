// DeptList.vue // vueInit
<template>
  <div>
    <!-- TODO: 테이블 : ctrl + alt + l -->
    <table class="table">
        <!-- TODO: 테이블 제목 -->
      <thead>
        <tr>
            <!-- TODO: 1열 : th 태그(굵은글씨) -->
          <th scope="col">부서번호(dno)</th>
          <th scope="col">부서명(dname)</th>
          <th scope="col">부서위치(loc)</th>
        </tr>
      </thead>
      <!-- TODO: 테이블 본문 -->
      <!-- TODO: 사용법 : v-for="(data, index) in 배열" :key="index" -->
      <tbody v-for="(data, index) in dept" :key="index">
        <!-- TODO: 1행 : tr 태그 -->
        <tr>
          <!-- TODO: 1열 : td 태그 -->
          <td>{{ data.dno }}</td>
          <td>{{ data.dname }}</td>
          <td>{{ data.loc }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>
<script>
// js 코딩
// axios 함수정의가 있는 js 파일 import : DeptService.js
// TODO: 공통 조회함수 : getAll() : dept.json 파일을 읽어서 객체배열을 가져오는 함수
import DeptService from "@/services/DeptService";

export default {
  data() {
    return {
      dept: []  // TODO: 부서배열
    }
  },
  // TODO: vue 에서 생명주기 함수 : 
  // 1) 뷰 생성될때(화면이 뜰때) 실행되는 함수(자동실행) : mounted(){}
  mounted() {
    // 화면이 뜰때 부서조회 실행
    this.retrieveDepts();
  },
  methods: {
    // TODO: 부서 조회 함수 : 프론트 <-> 벡엔드 통신함수
    // TODO: 복습(비동기코딩) : async 함수명() { await 프라미스함수() }
    async retrieveDepts() {
      // TODO: 에러처리 : try{실행문} catch(변수){console.log(변수);}
      // TODO: 실행문에 에러가 발생하면 catch 안에 console.log 가 실행됨
      try {
        let response = await DeptService.getAll(); // 프라미스 함수()
        // 콘솔 출력 : response.data
        console.log(response.data);

        // 바인딩 속성 dept 에 저장
        // TODO: response.data == json 파일(데이터) : dept.json
        this.dept = response.data.dept;
      } catch(e) {
        console.log(e);
      }
    }
  },
};
</script>
<style lang=""></style>
