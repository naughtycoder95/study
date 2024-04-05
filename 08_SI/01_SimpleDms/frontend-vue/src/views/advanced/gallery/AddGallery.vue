// AddGallery.vue // 연습) 프론트/벡엔드 저장기능을 추가하세요 // AddFileDb.vue
참고하세요 // vueInit
<template>
  <div>
    <div class="col-6 mx-auto">
      <!-- {/* 이미지명(fileTitle) 입력 박스 시작 */} -->
      <div class="row g-3 align-items-center mb-3">
        <div class="col-3">
          <label htmlFor="galleryTitle" class="form-label"> 이미지명 </label>
        </div>

        <div class="col-9">
          <input
            type="text"
            class="form-control"
            id="galleryTitle"
            name="galleryTitle"
            v-model="gallery.galleryTitle"
          />
        </div>
      </div>
      <!-- {/* 이미지명 입력 박스 끝 */} -->

      <div class="input-group mb-3">
        <input type="file" ref="file" @change="selectImage" />

        <button
          class="btn btn-outline-secondary"
          type="button"
          id="inputGroupFileAddon04"
          @click="create"
        >
          Upload
        </button>
      </div>
      <!-- {/* upload 선택상자/버튼 end */} -->

      <!-- {/* upload 성공/실패 메세지 출력 시작 */} -->
      <div v-if="message" class="alert alert-success" role="alert">
        {{ message }}
      </div>
      <!-- {/* upload 성공/실패 메세지 출력 끝 */} -->
    </div>
  </div>
</template>
<script>
import GalleryService from '@/services/advanced/GalleryService';
export default {
  // TODO: 데이터 바인딩 속성 정의
  data() {
    return {
      currentImage: undefined, // 현재이미지
      message: "",             // 성공메세지 변수
      gallery: {
        uuid: null,            // 기본키
        galleryTitle: "",      // 제목
        galleryFileUrl: "",    // 다운로드 url
      }, // 파일 객체
    };
  },
  methods: {
    // TODO: 파일 선택상자에서 이미지 선택하면 변수에 저장하는 함수
    selectImage() {
      this.currentImage = this.$refs.file.files[0];
      this.message = "";
    },
    // TODO: insert(추가:파일업로드) 함수
    async create() {
      try {
        let response = await GalleryService.create(
          this.gallery,
          this.currentImage
        );
        console.log(response);
        this.message = response.data;
      } catch (e) {
        this.currentImage = undefined;
        this.message = "";
        console.log(e);
      }
    },
  },
};
</script>
<style></style>