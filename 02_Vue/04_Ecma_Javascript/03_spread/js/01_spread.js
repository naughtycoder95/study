// 01_spread.js 
// TODO: 스프레드 연산자 : 배열 값 복사 
// TODO: ...배열변수 : 배열변수의 값이 복사됨
// 예제 1) 숫자 배열 복사
// let arr = [1,2,3,4,5];
// // 새로운 배열 : 1 ~ 9
// let arr2 = [...arr, 6,7,8,9];

// // 출력
// console.log(arr2); // 1 ~ 9

// 예제 2) 문자열 배열 복사
let str = "paper"; // 문자들의 배열
// 문자열 복사 배열
// let str2 = [...str];
// // 출력
// console.log(str2); // ["p", "a",...]

// 연습 : 배열 2개 붙이기
// let arr1 = [1,2,3];
// let arr2 = [4,5,6];

// // 출력 : console.log
// // [1,2,3,4,5,6]
// let arr3 = [...arr1,...arr2];
// // 출력
// console.log(arr3);

// TODO: 향상된 for문 (반복문) : for(초기값;조건식;증감식){실행문;}
// TODO: 대상 : 배열변수
// 예제 3) 1 ~ 6까지 출력하세요
let arr = [1,2,3,4,5,6];

// 과거 반복문
// for(let i=0; i<arr.length; i++) {
//     console.log(arr[i]);
// }
// TODO: 새 반복문(향상된 for문)
// TODO: 사용법 : for(let 변수명 of 배열명){실행문;}
// TODO: 변수명 : 배열의 값
for(let e of arr) {
    console.log(e); // 1,2,3,4,5,6,
}
