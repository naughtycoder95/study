// 20_js_func.js
// TODO: js 의 유용한 함수 소개
// TODO: 1) 배열 함수
// TODO: (1) .push() : 배열의 끝에 값추가
// let num = [1,2,3]; // 배열정의 
// num.push(4);
// console.log(num); // 1,2,3,4

// TODO: (2) .pop() : 배열의 끝에 값삭제
// num.pop();
// console.log(num); // 1,2

// TODO: 2) 수학 함수
// TODO: .toFixed() : 소수점 자르기
// TODO: 사용법 : 변수.toFixed(자리수);
// let x = 12.4763;
// console.log(x.toFixed(2)) // 3번째 자리부터 버림

// TODO: Math.max(숫자, 숫자2,...) : 최대값 구하기
// let num = 1;
// let num2 = 2;
// console.log(Math.max(num, num2)); // 2

// TODO: Math.min(숫자, 숫자2,...) : 최소값 구하기
// let num = 1;
// let num2 = 2;
// console.log(Math.min(num, num2)); // 1

// TODO: 3) 날짜 함수 : Date()
// 날짜 : 현재 년/월/일 , 시/분/초
let date = new Date(); // Date 객체 생성방법

// 출력 : 날짜
let year  = date.getFullYear();  // 현재 년도
let month = date.getMonth() + 1; // 현재 월(0 ~ 11) + 1
let day   = date.getDate()       // 현재 일

console.log("year", year);
console.log("month", month);
console.log("day", day);

// 출력 : 시간
let hour   = date.getHours();   // 현재 시
let minute = date.getMinutes(); // 현재 분
let second = date.getSeconds(); // 현재 초

console.log("hour", hour);
console.log("minute", minute);
console.log("second", second);