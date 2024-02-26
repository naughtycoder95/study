// 01_exam/index_es6.js
// TODO: num 이 3의 배수인지 판단해서 가져온 변수를 이용해서 출력하세요
// 출력 : 3의 배수입니다.
// TODO: import 하세요
import {three, notThree} from "./var_es6.js"

let num = 3;

// 3의 배수
if(num % 3 === 0) {
    // 3의 배수
    console.log(three);
} else {
    // 3의 배수가 아님
    console.log(notThree);
}