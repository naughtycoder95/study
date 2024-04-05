// FileDbDetail.vue // vueInit
<template>
  <div class="col-6 mx-auto">
    <!-- {/* 이미지명(fileTitle) 입력 박스 시작 */} -->
    <div class="mb-3 col-md-12">
      <label htmlFor="fileTitle" class="form-label"> 이미지명 </label>
      <input
        type="text"
        class="form-control"
        id="fileTitle"
        required
        name="fileTitle"
        v-model="fileDb.fileTitle"
      />
    </div>
    <!-- {/* 이미지명 입력 박스 끝 */} -->

    <!-- {/* 이미지내용 입력 박스 시작 */} -->
    <div class="mb-3 col-md-12">
      <label htmlFor="fileContent" class="form-label"> 내용 </label>
      <input
        type="text"
        class="form-control"
        id="fileContent"
        required
        name="fileContent"
        v-model="fileDb.fileContent"
      />
    </div>

    <!-- {/* 이미지내용 입력 박스 끝 */} -->
    <div class="mb-3 col-md-12">
      <img :src="fileDb.fileUrl" class="card-img-top" alt="강의" />
    </div>

    <!-- {/* upload 선택상자/버튼 start */} -->
    <div class="input-group mb-3">
      <!-- {/* upload 선택상자/버튼 start */} -->
      <label class="btn btn-default p-0 mb-3">
        <!-- TODO: 파일선택상자 : v-model 사용안됨
                => ref="변수명"
         -->
        <input type="file" ref="file" @change="selectImage" />
      </label>

      <button class="btn btn-success mb-3" 
          @click="update">Update</button>
    </div>
    <!-- {/* upload 선택상자/버튼 end */} -->

    <!-- {/* upload 성공/실패 메세지 출력 시작 */} -->
    <div v-if="message" class="alert alert-success" role="alert">
      {{ message }}
    </div>
    <!-- {/* upload 성공/실패 메세지 출력 끝 */} -->
  </div>
</template>
<script>
// 에러 : ~ not resoleve : 파일 찾을 수 없음
import FileDbService from "@/services/advanced/FileDbService";
export default {
  // TODO: 데이터바인딩 속성 정의
  data() {
    return {
      currentImage: undefined, // 선택이미지
      message: "", // 성공메세지 변수

      fileDb: {
        // 웹매개변수(url) 전달방식 :
        // TODO: 사용법 : this.$router.params.uuid
        // TODO: 참조) router/index.js => path: /fileDb/:uuid
        // TODO: 2개의 변수명이 일치해야함 : uuid
        uuid: this.$route.params.uuid,
        fileTitle: "",
        fileContent: "",
        fileUrl: "",
      },
    };
  },
  // TODO: 함수 정의
  methods: {
    // TODO: 상세조회 함수(기본키:uuid)
    async get(uuid) {
      try {
        // TODO: 공통 상세조회함수: get()
        // TODO: 비동기 코딩 : async ~ await
        let response = await FileDbService.get(uuid);
        this.fileDb = response.data; // spring 결과 -> fileDB 저장
        // 로깅
        console.log(response.data);
      } catch (e) {
        console.log(e);
      }
    },
    // TODO: 파일선택상자에서 이미지를 선택할때 실행될함수
    selectImage() {
      // TODO: 파일선택상자에서 1st 선택한 이미지를 currentImage 변수에 저장
      this.currentImage = this.$refs.file.files[0];
      // 성공메세지 초기화
      this.message = "";
    },
    // TODO: 수정함수(update)
    async update() {
      // TODO: 공통 수정(update) 함수 실행 : update()
      try {
          // TODO: 공통 수정함수 실행
          // TODO: 비동기 코딩 : async ~ await
          let response = await FileDbService
                            .update(this.fileDb, this.currentImage);
          // 성공 메세지 출력
          this.message = response.data;
      } catch(e) {
        this.currentImage = undefined; // 초기화
        this.message = "에러 : " + e;  // 에러 출력
        console.log(e);
      }
    },
  },
  // TODO: 화면이 뜰때 자동실행 함수
  mounted() {
    this.get(this.$route.params.uuid); // 상세조회 실행
    this.message = ""; // 초기화
  },
};
</script>
<style></style>