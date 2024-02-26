// var_es6.js
// TODO: 모듈화 : 다른 js 에서 변수/함수를 가져다 사용하는 것, (코딩 효율화)

// const : 상수 , let : 변수
// TODO: 상수
const odd = "홀수입니다.";
const even = "짝수입니다.";

// TODO: 함수(화살표)
const hello = () => console.log("안녕하세요");

// TODO: export : 내보내기(다른 js에서 사용하도록 허락)
// TODO: 사용법 : export {변수명, 상수명, 함수명 ...}
// TODO: 사용법 2 : export default 변수명; // 1개만 내보내기 할때
export {odd, even, hello};