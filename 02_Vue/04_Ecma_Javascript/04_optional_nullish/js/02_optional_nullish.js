// 02_optional_nullish.js
// TODO: 옵셔널 널리쉬(optional nullish)

// 예제 : user 속성을 출력하세요
let user = null;

// 과거코딩 : 속성을 출력(개발자 착각)
// if( user != null) {
//     console.log(`user 는 ${user.address}`);
// }
// TODO: 코딩 간략화(효율성)
// TODO: 사용법 : 객체명?.속성 
// TODO: 객체가 null 일경우 undefined 로 강제로 변경(null에러방지)
console.log(`user 는 ${user?.address}`);