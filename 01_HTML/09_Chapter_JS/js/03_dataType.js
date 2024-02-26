// 03_dataType.js
// TODO: 자료형 정리
// TODO: 1) 문자열(String)   : "", '' 사용
// TODO: 2) 숫자(Number)     : 1,2 사용
// TODO: 3) 참/거짓(Boolean) : true/false 사용
// TODO: 4) 객체(Object)     : let cat={name:"나비"};
// TODO: 4-2) 배열(객체)     : let num=[1,2,3];
// TODO: 5) null 자료형      : 공간이 없음을 의미
// => null 사용 과거 코딩
// let char = null;
// 요즘 코딩
// let char = "";
// TODO: 6) undefined 자료형 : (js 만 있음, 다른언어 없음)
// TODO: 객체 정의 형태에서 나옴 : 에러로 나옴
let dog = {
    name: "삼순이",
    age: 2
}
console.log(dog.name); // "삼순이"
console.log(dog.age);  // 2
console.log(dog.code); // TODO: undefined 에러 발생