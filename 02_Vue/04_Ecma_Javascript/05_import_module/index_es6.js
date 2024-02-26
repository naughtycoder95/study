// index_es6.js
// TODO: 다른 js(import)
// TODO: import : 다른 js 에서 가져다가 사용하는 것
// TODO: export : 다른 js 에서 가져다가 사용하는 것을 허락하는것
// TODO: 사용법 : import {변수명,상수명,함수명...} from "파일명.js";
// TODO: 사용법 2 : import 변수명 from "파일명.js";
import {odd, even, hello} from "./var_es6.js";

// 예제 : 값이 홀/짝인지 판단
let num = 3;

if(num % 2 === 0) {
    // 짝수
    console.log(even);
} else {
    // 홀수
    console.log(odd);
}