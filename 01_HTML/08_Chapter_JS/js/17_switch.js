// 17_switch.js
// TODO: if문과 유사하게 사용하는 switch문
// 예제 ) X 가 1일 경우 "x의 값은 1입니다."
// X 가 2일 경우 "x의 값은 2입니다."
// X 가 1도2 도 아닐경우 "x의 값은 1 또는 2가 아닙니다."
// 입력 : 2
// 출력 : x의 값은 2입니다.
// TODO: if문 풀이
// let num = Number(prompt("숫자를 입력하세요"));

// if (num === 1) {
//   alert("x의 값은 1입니다.");
// } else if (num === 2) {
//   alert("x의 값은 2입니다.");
// } else {
//   alert("x의 값은 1 또는 2가 아닙니다.");
// }

// TODO: switch 문 풀이
// TODO: 사용법 : 변수가 값이면 실행문이 실행되고,
// TODO:          변수가 값2이면 실행문2가 실행되고,
// TODO:          변수가 모두 아니면 실행문3가 실행됨
// switch(변수) {
//     case 값:
//         실행문;
//         break;
//     case 값2:
//         실행문2;
//         break;
//     default:
//         실행문3;
//         break;
// }
// let num = Number(prompt("숫자 1개"));

// 조건문
// switch(num) {
//     case 1:
//         alert("X의 값은 1입니다.");
//         break;
//     case 2:
//         alert("X의 값은 2입니다.");
//         break;
//     default:
//         alert("X의 값은 1 또는 2가 아닙니다.");
//         break;
// }

// TODO: 3항 연산자 :(조건문)
// TODO: 활용 : 간단한 조건문에 사용
// TODO: 예제 3) 입력값이 a이면 a 출력 아니면 b을 출력하세요
// TODO: 사용법 : let 변수 = (조건식)? 값 : 값2;
// TODO:    조건식을 판단해서 참이면 값이 변수에 저장되고,
// TODO:    거짓이면 값2가 변수에 저장됨
let char = prompt("문자 1개");

// 조건문 : 3항연산자 사용
let result = (char === "a")? "a" : "b";

// 결과 출력
alert(result); // a