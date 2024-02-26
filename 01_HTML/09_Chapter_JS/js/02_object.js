// 02_object.js
// TODO: java, js, python => 객체지향 언어
// TODO: 객체 : 실생활에서 보이는 모든 것들을 객체
// 예) 사람, 사물, 책상, 컴퓨터, 학원 등
// TODO: 객체 사용법
// TODO: 1) 객체속성 : 객체의 특징 
// 객체 정의
// let 객체변수 = {
//     속성명 : 값,
//     속성명2: 값2,
//     ...
// }

// 객체 속성 사용
// 객체변수.속성명; // 객체변수의 속성값이 출력됨

// 예제 ) 안지영 이라는 사람의 속성을 나열하고 객체로 만드세요.
// 객체 정의
// let person = {
//     name: "안지영",
//     email: "an@naver.com",
//     age: 24
// }
// // 객체 출력
// console.log("name", person.name);   // 안지영
// console.log("email", person.email); // an@naver.com
// console.log("age", person.age);     // 24

// 연습문제 1) 
//  객체 정의 하고 객체 출력하기
// 고양이에 대한 특징을 console.log 을 이용해서 화면에 출력하세요
// 속성 :
//     이름: 나비
//     색깔: 황토색
//     무게: 10kg
//  코드번호: 1234
//  전화번호: 010-1234-5678
// TODO: 언어 (4개월) - 1개월(팀프로젝트(쇼핑몰)) - 1개월(팀프로젝트(롯데정보통신 사내커뮤니티사이트))
// 객체 정의
let cat = {
    name: "나비",
    color: "황토색",
    weight: "10kg",
    code: 1234,
    phone: "010-1234-5678"
}
// 객체 속성 출력
// console.log(cat.name);   // "나비"
// console.log(cat.color);  // "황토색"
// console.log(cat.weight); // "10kg"
// console.log(cat.code);   // 1234
// console.log(cat.phone);  // "010-1234-5678"

// TODO: 객체를 모두 출력
console.log(cat); // 모든 속성이 출력됨
