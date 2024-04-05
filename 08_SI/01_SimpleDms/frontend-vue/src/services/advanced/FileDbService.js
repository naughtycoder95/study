// FileDbService.js
// 공통 CRUD 함수 : spring 통신
import http from "@/utils/http-common";

class FileDbService {
  // 속성, 생성자, 함수(o)
  // TODO: 전체 조회(select) : get 방식 -> @GetMapping
  getAll(fileTitle, page, size) {
    return http.get(
      `/advanced/fileDb?fileTitle=${fileTitle}&page=${page}&size=${size}`
    );
  }

  // TODO: 추가 함수(insert) : post 방식 -> @PostMapping
  // TODO: 1) 문서형태   : multipart/form-data
  // TODO: 2) 파일업로드 : 오로지 form 태그 == FormData 객체만 전송 가능
  create(fileDb, image) {
    let formData = new FormData(); // form 객체
    // TODO: 사용법 : form 객체에 추가 : append("키", 값);
    formData.append("fileTitle", fileDb.fileTitle); // 제목
    formData.append("fileContent", fileDb.fileContent); // 내용
    formData.append("image", image); // 이미지

    return http.post("/advanced/fileDb/upload", formData, {
      headers: {
        "Content-Type": "multipart/form-data",
      },
    });
  }

  // TODO: 상세조회 함수
  // 조회(select) -> get 방식 -> @GetMapping
  get(uuid) {
    return http.get(`/advanced/fileDb/get/${uuid}`);
  }
  // TODO: 수정 함수
  // TODO: 수정(update) -> put 방식 -> @PutMapping
  // TODO: 1) 문서형태   : multipart/form-data
  // TODO: 2) 파일업로드 : 오로지 form 태그 == FormData 객체만 전송 가능
  update(fileDb, image){
    // 1) FormData 객체 생성
    let formData = new FormData(); 

    // 2) form 객체변수에 값 추가 : append("키", 값);
    formData.append("fileTitle", fileDb.fileTitle);
    formData.append("fileContent", fileDb.fileContent);
    formData.append("image", image);

    // 3) 벡엔드 통신 : put 방식 -> put()
    return http.put(`/advanced/fileDb/${fileDb.uuid}`, formData, {
      headers: {
        "Content-Type": "multipart/form-data",
      },
    });
  }

  // TODO: 삭제 함수 : 기본키(uuid)
  // TODO: 삭제(delete) -> delete 방식->@DeleteMapping
  delete(uuid){
    return http.delete(`/advanced/fileDb/deletion/${uuid}`);
  }
}

export default new FileDbService();