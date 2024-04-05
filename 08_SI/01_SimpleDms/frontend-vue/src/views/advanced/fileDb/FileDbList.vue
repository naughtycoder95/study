// FileDbList.vue // vueInit
<template>
  <!--  여기 -->
  <div>
    <div class="col-md-8">
      <!-- {/* 검색어 start */} -->
      <div class="input-group mb-3">
        <input
          type="text"
          class="form-control"
          placeholder="제목 검색"
          v-model="searchTitle"
        />
        <div class="input-group-append">
          <button
            class="btn btn-outline-secondary"
            type="button"
            @click="retrieveFileDb"
          >
            Search
          </button>
        </div>
      </div>
      <!-- {/* 검색어 end */} -->
    </div>

    <div class="col-md-12 mt-3">
      <h4>FileDb List</h4>
      <!-- {/* page start */} -->
      <div class="mb-3">
        1페이지당 개수:
        <select v-model="pageSize" @change="pageSizeChange">
          <option v-for="(data, index) in pageSizes" :key="index" :value="data">
            {{ data }}
          </option>
        </select>
      </div>

      <!-- b-pagination : 부트스트랩 - 페이지 번호 컨트롤 -->
      <!-- total-rows : 전체 데이터 개수 -->
      <!-- per-page : 1페이지 당 개수 -->
      <!-- click : retrieveFileDb(), 페이지 번호 변경 시 실행되는 이벤트 -->
      <b-pagination
        class="col-12 mb-3"
        v-model="page"
        :total-rows="count"
        :per-page="pageSize"
        @click="retrieveFileDb"
      ></b-pagination>
      <!-- {/* page end */} -->

      <!-- {/* 쇼핑카트 이미지 start */} -->
      <div class="row">
        <!-- TODO: v-for 반복문 실행 -->
        <div v-for="(data, index) in fileDb" :key="index" class="col-sm-6">
          <div class="card">
            <!-- 카드 이미지(data.fileUrl) -->
            <img :src="data.fileUrl" class="card-img-top" alt="강의" />
            <!-- 본문 : 제목 + 내용 -->
            <div class="card-body">
              <!-- 제목 -->
              <h5 class="card-title">{{ data.fileTitle }}</h5>
              <!-- 내용 -->
              <p class="card-text">{{ data.fileContent }}</p>
              <router-link :to="'/fileDb/' + data.uuid">
                <span class="badge bg-warning">수정</span>
              </router-link>
              <a
                style="
                   {
                    color: inherit;
                  }
                "
                class="ms-2"
                @click="deleteFileDb(data.uuid)"
              >
                <span class="badge bg-danger">삭제</span>
              </a>
            </div>
          </div>
        </div>
      </div>
      <!-- {/* 쇼핑카트 이미지 end */} -->
    </div>
  </div>
</template>
<script>
import FileDbService from "@/services/advanced/FileDbService";

export default {
  // TODO: 데이터바인딩 속성 정의
  data() {
    return {
      fileDb: [], // spring 전송 파일 배열
      searchTitle: "", // 제목 검색 변수(input 태그)

      // 공통 속성(페이징)
      page: 1, // 현재페이지번호
      count: 0, // 전체데이터개수
      pageSize: 3, // 1페이지당개수(select태그)

      pageSizes: [3, 6, 9], //1페이지당개수 배열(select태그-option)
    };
  },
  //   TODO: 함수 정의
  methods: {
    // TODO: 파일 전체 조회 함수
    async retrieveFileDb() {
      try {
        // TODO: 공통 전체 조회 함수 : getAll()
        // TODO: 비동기 코딩 : async ~ await
        let response = await FileDbService.getAll(
          this.searchTitle, // 제목 검색어
          this.page - 1, // 현재페이지번호
          this.pageSize // 1페이지당 개수
        );
        const { fileDb, totalItems } = response.data;
        this.fileDb = fileDb; // 파일 배열
        this.count = totalItems; // 전체 데이터 개수
        // 로깅
        console.log(response.data);
      } catch (e) {
        console.log(e);
      }
    },
    // TODO: 삭제 함수
    async deleteFileDb(uuid) {
      try {
        // TODO: 공통 삭제 함수 실행 : delete()
        // TODO: 비동기 코딩 : async ~ await
        let response = await FileDbService.delete(uuid);
        // 로깅
        console.log(response.data);
        // 전체조회 페이지 -> 삭제 후 재조회
        this.retrieveFileDb();
      } catch (e) {
        console.log(e);
      }
    },
    // TODO: 공통함수(페이징)
    // TODO: select 박스 변경시 실행될 함수
    // TODO: select 태그 연결
    pageSizeChange() {
      this.page = 1; // 2) 현재 페이지번호 초기화(1)
      this.retrieveFileDb(); // 3) 재조회 요청
    },
  },
  //   TODO: 화면이 뜰때 자동 실행 함수
  mounted() {
    //   TODO: 화면이 뜰때 전체조회
    this.retrieveFileDb();
  },
};
</script>
<style></style>