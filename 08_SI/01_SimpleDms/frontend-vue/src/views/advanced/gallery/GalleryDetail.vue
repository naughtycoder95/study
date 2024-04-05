// GalleryDetail.vue // vueInit // 연습 2) 프론트/벡엔드 수정페이지 에 상세조회
기능을 완성하세요 // FileDbDetail.vue 참고하세요 // 연습 3) 프론트/벡엔드
수정페이지 에 수정 기능을 완성하세요 // FileDbDetail.vue 참고하세요
<template>
  <div class="col-6 mx-auto">
    <!-- {/* 이미지명(galleryTitle) 입력 박스 시작 */} -->
    <div class="mb-3 col-md-12">
      <label htmlFor="galleryTitle" class="form-label"> 이미지명 </label>
      <input
        type="text"
        class="form-control"
        id="galleryTitle"
        required
        name="galleryTitle"
        v-model="gallery.galleryTitle"
      />
    </div>
    <!-- {/* 이미지명 입력 박스 끝 */} -->

    <!-- {/* 이미지내용 입력 박스 끝 */} -->
    <div class="mb-3 col-md-12">
      <img :src="gallery.galleryFileUrl" class="card-img-top" alt="강의" />
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

      <button class="btn btn-success mb-3" @click="update">Update</button>
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
// 에러 : ~ not define => 파일을 찾을 수 없습니다.
// 에러 : ~ not resolve => 파일을 찾을 수 없습니다.
import GalleryService from "@/services/advanced/GalleryService";
export default {
  // TODO: 데이터바인딩 속성 정의
  data() {
    return {
      currentImage: undefined, // 선택이미지
      message: "", // 성공메세지 변수

      gallery: {
        uuid: this.$route.params.uuid,
        galleryTitle: "",
        galleryFileUrl: "",
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
        let response = await GalleryService.get(uuid);
        this.gallery = response.data; // spring 결과 -> gallery 저장
        // 로깅
        console.log(response.data);
      } catch (e) {
        console.log(e);
      }
    },
    // TODO: 파일선택상자에서 이미지를 선택할때 실행될함수
    selectImage() {
      this.currentImage = this.$refs.file.files[0];
      this.message = "";
    },
    // TODO: 수정함수(update)
    async update() {
      // TODO: 공통 수정(update) 함수 실행 : update()
      try {
          // TODO: 공통 수정함수 실행
          // TODO: 비동기 코딩 : async ~ await
          let response = await GalleryService
                            .update(this.gallery, this.currentImage);
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