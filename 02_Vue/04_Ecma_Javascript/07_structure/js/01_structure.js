// 01_structure.js
// TODO: 구조분해 할당 : 코딩 효율성
// 예제 : 가독성 향상
// let arr = [1,2];
// let firstNum = arr[0]; //1st 숫자
// let secondNum = arr[1]; //2nd 숫자

// console.log(firstNum, secondNum);

// TODO: 1) 변경 (구조분해 할당 기능)
// TODO: 사용법 : let [변수명, 변수명2] = [값,값2];
// TODO: 배열의 값이 순서대로 변수에 저장됨 예) 변수명=값, 변수명2=값2 
// let [firstNum, secondNum] = [1,2];
// console.log(firstNum, secondNum);

// 연습문제 1) 배열 구조분해 할당 문제
// 아래와 같이 배열이 있습니다. 구조분해 할당 이용해서 출력하세요
// 출력 : hello node react
let [first, second, third] = ["hello", "node", "react"];
console.log(first, second, third);

// TODO: 2) 객체 변경(구조분해 할당 기능)
// 예제 2)
// 객체정의 : let 객체명 = {속성;값,...};
// let candy = {
//     name: "캔디",
//     count: 5
// }
// // 객체속성 : 객체명.속성명
// console.log(candy.name, candy.count);

// TODO: 변경
// TODO: 사용법 : let {변수명, 변수명2} = {속성명: 값, 속성명2: 값2};
// TODO: 변수명 = 값, 변수명2 = 값2 (단, 변수명==속성명, 변수명2 == 속성명2)
let {name, count} = {name: "캔디", count: 5};
console.log(name, count);

// 연습문제 2) 객체 구조분해 할당 문제
// 아래와 같이 객체가 있습니다. 구조분해 할당 이용해서 출력하세요
let dept = {
    no : 1,
    dname : "Sales",
    loc : "부산"
}
// let {no, dname, loc} = dept;
let {no, dname, loc} = {no : 1,dname : "Sales",loc : "부산"};
console.log(no, dname, loc);