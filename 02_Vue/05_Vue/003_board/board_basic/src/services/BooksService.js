// BooksService.js
import http from "../utils/HttpCommon";

// class 객체 정의 : es6 사용법
class BooksService {
    // axios get 함수 정의
    getAll() {
        return http.get("/books.json");
    }
}
// class 객체 사용 : new BooksService()
// TODO: 중요) 객체.함수명(), 객체.속성명
export default new BooksService();