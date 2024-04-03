// EmpList.vue(연습) // 전체 조회 페이지(사원) // 1) router/index.js : /emp 메뉴
url 등록 // 2) services/basic/DeptService.js : 공통 전체조회 함수 // 3)
emp/EmpList.vue : 전체 조회 페이지 // 4) 벡엔드 : 모델 ~ 컨트롤러 전체 조회 함수

// 연습 2) 페이지번호 함수, 페이지크기변경함수, 검색함수 html 연결하기
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
          placeholder="사원명 검색"
          v-model="searchEname"
        />

        <button class="btn btn-outline-secondary" 
              type="button"
              @click="retrieveEmp"
        >
          검색
        </button>
      </div>
    </div>

    <!-- 페이징 번호(공통) -->
    <div class="row">
      <!-- TODO: 1페이지당 화면에 보일 개수 조정(select태그) -->
      <div class="col-12 w-25 mb-3">
        1페이지당 개수 :
        <!-- 복습 : select 태그 -> v-model="pageSize" : 화면에 보일 초기값이 지정 -->
        <select class="form-select form-select-sm" 
              v-model="pageSize"
              @change="pageSizeChange"
        >
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
        @click="retrieveEmp"
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
              <th scope="col">eno</th>
              <th scope="col">ename</th>
              <th scope="col">job</th>
              <th scope="col">manager</th>
              <th scope="col">hiredate</th>
              <th scope="col">salary</th>
              <th scope="col">commission</th>
              <th scope="col">dno</th>
              <th scope="col">action</th>
            </tr>
          </thead>
          <!-- TODO: 테이블 본문 (반복문) -->
          <tbody>
            <!-- TODO: 사용법 : v-for="(data,index) in 배열" :key="index" -->
            <tr v-for="(data, index) in emp" :key="index">
              <td>{{ data.eno }}</td>
              <td>{{ data.ename }}</td>
              <td>{{ data.job }}</td>
              <td>{{ data.manager }}</td>
              <td>{{ data.hiredate }}</td>
              <td>{{ data.salary }}</td>
              <td>{{ data.commission }}</td>
              <td>{{ data.dno }}</td>
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
<script>
import EmpService from "@/services/basic/EmpService";

export default {
  data() {
    return {
      emp: [], // spring 에서 전송
      searchEname: "",

      // 공통 속성(현재페이지, 전체데이터개수,1페이지당개수)
      page: 1, // 현재페이지번호
      count: 0, // 전체데이터개수
      pageSize: 3, // 1페이지당개수(select태그)

      pageSizes: [3, 6, 9], //1페이지당개수 배열(select태그-option)
    };
  },
  methods: {
    // 공통 함수 : 페이징 관련 함수들
    // TODO: 페이지번호 변경 클릭시 실행될 함수
    pageNoChange(value) {
      // this.속성 => data() 안에 속성들 접근
      this.page = value; // 1) 현재페이지 변경
      this.retrieveEmp(); // 2) 재조회 요청
    },
    // TODO: select 박스 변경시 실행될 함수
    pageSizeChange() {
      this.page = 1; // 2) 현재 페이지번호 초기화(1)
      this.retrieveEmp(); // 3) 재조회 요청
    },
    // TODO: spring(벡엔드) 전체조회 요청함수(핵심)
    async retrieveEmp() {
      try {
        // TODO: 1) 공통 전체조회 함수 실행
        let response = await EmpService.getAll(
          this.searchEname, // 검색어
          this.page - 1, // 현재페이지번호-1
          this.pageSize // 1페이지당개수(size)
        );
        const { emp, totalItems } = response.data; // 사원배열(벡엔드 전송)
        this.emp = emp;          // 사원배열(벡엔드 전송)
        this.count = totalItems; // 전체페이지수(벡엔드 전송)
        console.log(response.data);
      } catch (e) {
        console.log(e);
      }
    },
  },
  mounted() {
    this.retrieveEmp();  // 전체 조회 함수 실행
  }
};
</script>
<style></style>
