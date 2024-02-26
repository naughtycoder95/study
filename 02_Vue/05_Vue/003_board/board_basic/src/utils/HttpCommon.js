// utis/HttpCommon.js : axios import 파일
// 모든 컴포넌트(.vue) 에서 공통으로 사용할 함수 정의
import axios from "axios"; // axios 임포트

// 내보내기 : 벡엔드 기본주소(도메인)  : 벡엔드 -> http://localhost:8080
// 예) 기본 인터넷주소(도메인)         : 네이버 -> http://www.naver.com
// TODO: 다른 컴포넌트에서 사용시 : /board => http://localhost:8080/board (조합됨)

export default axios.create({
// TODO: 기본 인터넷주소(도메인) 정의 : baseURL : "기본인터넷주소"
    baseURL: "http://localhost:8080",
// TODO: 통신 문서 규격(형태) : .html, .jpg, .json 등
    headers: {
        "Content-type": "application/json"
    }
})