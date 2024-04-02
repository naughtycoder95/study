// DeptList.vue // vue 템플릿 단축키 : vueInit // html 작성 부분
<template>
  <div>
    <!-- 검색어 -->
    <div class="row mb-5 mt-5 justify-content-center">
      <!-- 입력박스 -->
      <!-- w-50 : w(width)-퍼센트 (25, 50, 75, 100) -->
      <div class="col-12 w-50 input-group mb-3">
        <input
          type="text"
          class="form-control"
          placeholder="부서명 검색"
          v-model="searchDname"
        />

        <button class="btn btn-outline-secondary" type="button">Button</button>
      </div>
    </div>

    <!-- 페이징 번호 -->
    <div class="row">
      <!-- TODO: 1페이지당 화면에 보일 개수 조정(select태그) -->
      <div class="col-12 w-25 mb-3">
        1페이지당 개수 :
        <!-- 복습 : select 태그 -> v-model="pageSize" : 화면에 보일 초기값이 지정 -->
        <select class="form-select form-select-sm" v-model="pageSize">
          <!-- TODO: vue 반복문 실행 -->
          <option v-for="(data, index) in pageSizes" :key="index" :value="data">
            {{ data }}
          </option>
        </select>
      </div>
      <!-- 페이지 번호 : b-pagination태그 -->
      <!-- 현재페이지(page), 1페이지당개수(pageSize)
           전체데이터개수(count)
       -->
      <!-- TODO: 사용법 
                  <b-pagination
                        v-model="현재페이지번호"       
                        :total-rows="전체데이터개수"
                        :per-page="1페이지당개수"
                    ></b-pagination>
        -->
      <b-pagination
        class="col-12 mb-3"
        v-model="page"
        :total-rows="count"
        :per-page="pageSize"
      ></b-pagination>
    </div>

    <!-- 테이블 -->
    <div class="row">
      <div class="col-12">
        <!-- 테이블 디자인 -->
        <table class="table">
          <!-- 테이블 제목 -->
          <thead>
            <tr>
              <th scope="col">dno</th>
              <th scope="col">dname</th>
              <th scope="col">loc</th>
              <th scope="col">action</th>
            </tr>
          </thead>
          <!-- TODO: 테이블 본문 (반복문) -->
          <tbody>
            <!-- TODO: 사용법 : v-for="(data,index) in 배열" :key="index" -->
            <tr v-for="(data, index) in dept"  :key="index">
              <td>{{ data.dname }}</td>
              <td>{{ data.loc }}</td>
              <!-- 수정페이지 링크버튼 -->
              <td>
                <span class="badge text-bg-success">수정</span>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</template>

// js 작성 부분
<script>
// TODO: 공통 crud 함수 import
import DeptService from "@/services/basic/DeptService";

export default {
  // TODO: data binding 속성 정의
  data() {
    return {
      dept: [], // spring 전송할 변수(속성)
      searchDname: "", // 부서명검색 변수(속성)(input태그)

      // 공통 속성(현재페이지, 전체데이터개수,1페이지당개수)
      page: 1, // 현재페이지번호
      count: 0, // 전체데이터개수
      pageSize: 3, // 1페이지당개수(select태그)

      pageSizes: [3, 6, 9], //1페이지당개수 배열(select태그-option)
    };
  },
  // TODO: vue 함수 정의 : 클릭/더블클릭 등
  methods: {
    // 공통 함수 : 페이징 관련 함수들
    // TODO: 페이지번호 변경 클릭시 실행될 함수
    pageNoChange(value) {
      // this.속성 => data() 안에 속성들 접근
      this.page = value; // 1) 현재페이지 변경
      this.retrieveDept(); // 2) 재조회 요청
    },
    // TODO: select 박스 변경시 실행될 함수
    pageSizeChange() {
      this.page = 1; // 2) 현재 페이지번호 초기화(1)
      this.retrieveDept(); // 3) 재조회 요청
    },
    // TODO: spring(벡엔드) 전체조회 요청함수(핵심)
    // TODO: 전체조회 함수 : 비동기 함수
    // TODO: 사용법 : async 함수명() { 변수 = await 함수명2(); console.log(변수) }
    async retrieveDept() {
      try {
        // TODO: 1) 공통 전체조회 함수 실행
        let response = await DeptService.getAll(
          this.searchDname, // 검색어
          this.page - 1, // 현재페이지번호-1
          this.pageSize // 1페이지당개수(size)
        );
        // TODO: 복습 : 2) 객체분할 할당
        const { dept, totalItems } = response.data; // 부서배열(벡엔드 전송)
        // TODO: 3) 바인딩변수(속성)에 저장
        this.dept = dept; // 부서배열(벡엔드 전송)
        this.count = totalItems; // 전체페이지수(벡엔드 전송)
        // TODO: 4) 프론트 로깅 : console.log
        console.log(response.data);
      } catch (e) {
        console.log(e);
      }
    },
  },
  //   TODO: 화면에 뜰때 자동 실행되는 함수
  mounted() {
    // TODO: 최초 화면이 뜰때 전체조회 실행
    this.retrieveDept();
  },
};
</script>

// css 작성 부분
<style></style>