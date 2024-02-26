// 04_filter.js
// TODO: filter(거르다) 함수 : 개수가 작은 새로운 배열을 만듬
// TODO: 특징 : 1) 자동 반복
// TODO:       2) break 사용 못함
// TODO:       3) return 문 사용
// 예제 : 3보다 큰 새로운 배열을 만드세요
// let num = [1,2,3,4,5];
// filter 함수 사용
// TODO: 사용법 : let 변수 = 배열변수.filter((매개변수) => 조건식);
// let result = num.filter((value) => value > 3);
// // 출력
// console.log(result);

// 연습문제 1) filter 함수 사용해서 조작하세요
// 결과 : [1, 2]
// 조건 : value < 3
let numbers = [1,2,3,4,5];
let result = numbers.filter((value) => value < 3);
console.log(result); // 출력

// 연습문제 2) filter 함수 사용해서 조작하세요
// 결과 : [3]
// 조건 : value > 2 && value < 4
let num = [1,2,3,4,5];