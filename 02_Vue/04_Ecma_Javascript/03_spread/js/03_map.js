// 03_map.js
// TODO: map 함수 : 용도: 새로운 배열을 만들때 사용
// TODO: 특징 : 1) 자동으로 반복문 실행
// TODO: 특징 : 2) return 이 있음 
// TODO: 특징 : 3) break 사용 못함
// 예제 1) 숫자 배열에서 제곱수를 구하는 새로운 배열을 만드세요. 
// let num = [1,2,3,4,5];
// let result; // 제곱수 저장할 변수

// 일반 반복문
// for(let i=0; i<num.length; i++) {
//     result[i] = num[i] * num[i];
// }

// map 함수 사용
// TODO: 사용법 : let 변수명 = 배열변수.map((매개변수) => 매개변수 * 매개변수);
// let result = num.map((value) => value * value);
// // 출력
// console.log(result);  // [1,4,9, 16, 25]

// 연습 2) 아래 주어진 배열을 map 이용해서 조작하세요
// 결과 : [2, 4, 6]
// 힌트 : value + value
let num = [1,2,3];
let result = num.map((value) => value + value); // [2, 4, 6]
console.log(result); // 출력
