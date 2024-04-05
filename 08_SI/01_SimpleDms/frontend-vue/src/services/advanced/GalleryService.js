// GalleryService.js
// CRUD 공통 함수 : spring 전송
import http from "@/utils/http-common";

class GalleryService {
  // 속성, 생성자, 함수(o)
  // TODO: 전체 조회(select) : get 방식 -> @GetMapping
  getAll(galleryTitle, page, size) {
    return http.get(
      `/advanced/gallery?galleryTitle=${galleryTitle}&page=${page}&size=${size}`
    );
  }

  // TODO: 공통 insert 함수
  // TODO: 1) 문서형태   : multipart/form-data
  // TODO: 2) 파일업로드 : 오로지 form 태그 == FormData 객체만 전송 가능
  create(gallery, image) {
    let formData = new FormData(); // form 객체
    formData.append("galleryTitle", gallery.galleryTitle); // 제목
    formData.append("image", image);                       // 이미지

    return http.post("/advanced/gallery/upload", formData, {
      headers: {
        "Content-Type": "multipart/form-data",
      },
    });
  }

  // TODO: 상세조회 함수
  get(uuid) {
    return http.get(`/advanced/gallery/get/${uuid}`);
  }

  // TODO: 수정함수
  update(gallery, image){
    // 1) FormData 객체 생성
    let formData = new FormData(); 

    // 2) form 객체변수에 값 추가 : append("키", 값);
    // TODO: form 객체 -> 쿼리스트링방식 : @RequestParam
    formData.append("galleryTitle", gallery.galleryTitle);
    formData.append("image", image);

    // 3) 벡엔드 통신 : put 방식 -> put()
    return http.put(`/advanced/gallery/${gallery.uuid}`, formData, {
      headers: {
        "Content-Type": "multipart/form-data",
      },
    });
  }

  // TODO: 공통 삭제함수
  delete(uuid){
    return http.delete(`/advanced/gallery/deletion/${uuid}`);
  }
}

export default new GalleryService();