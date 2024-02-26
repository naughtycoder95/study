// 01_arrow_basic.js
// TODO: 화살표 함수(*)
// TODO: 1) 함수 선언식
// 예제 : 덧셈 함수를 정의하세요
// 사용법 : function 함수명(){}
// 함수 정의
function mySum(a, b) {
    return a + b;
}
// // 함수 사용
// mySum(3,4); // 7

// TODO: 2) 함수 표현식
// 사용법 : let 함수명 = function(){}
// let mySum = function(a, b) {
//     return a + b;
// }

// TODO: 함수 호이스팅 : 함수선언식을 정의하면 항상 제일 위쪽으로 웹브라우저가 강제로 옮김(현상)(*)

// TODO: 3) 화살표 함수 : 함수 코딩 효율화(간략 표기)
// let mySum = (a, b) => a + b; // 1줄

// 연습 1) : 함수(표현식) -> 화살표 함수 고치기
// let myPow = (x, y) => x * y; // 1줄(행)

// 연습 2) : 함수 -> 화살표 함수 고치기
// 함수 선언식 -> 함수 표현식 -> 화살표함수
// function double(n) {
//     return n*2;
// }

// 2) 함수 표현식 -> 화살표함수
// let double = (n) => n*2; // 1줄(행)

// 예제 2) 합계 구하는 함수 (2줄이상)
// function mySum2(a, b) {
//     let result = a + b;

//     return result;
// }
// TODO: 함수 -> 화살표 함수 고치기
// let mySum2 = (a, b) => {
//     let result = a + b;
//     return result;
// }

// 예제 3) 안녕하세요 라고 출력되는 함수
// function Hello() {
//     console.log("안녕하세요");
// }
// 함수표현식
// let Hello = () => console.log("안녕하세요"); // 1줄(행)

// 연습 3: 함수 -> 화살표
// function fun2() {
//   let call = prompt("이름이 뭐니~?", "");
//   return alert(call + "~! 반갑다~!");
// }
// 함수표현식 -> 화살표 함수
let fun2 = () => {
    let call = prompt("이름이 뭐니~?", "");
    alert(call + "~! 반갑다~!");
}