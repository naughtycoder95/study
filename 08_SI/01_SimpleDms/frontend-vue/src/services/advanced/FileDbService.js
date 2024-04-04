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
}

export default new FileDbService();
