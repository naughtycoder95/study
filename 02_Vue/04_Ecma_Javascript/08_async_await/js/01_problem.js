// 01_problem.js
// TODO: 비동기 코딩(프로그래밍)(*)
// TODO: 예제 : 비동기 코딩의 단점 => 순서에 맞게 코딩할 수 없음
// setTimeout() : 일정시간 지연해서 실행하는 함수
// TODO: setTimeout(함수(), 지연시간(ms)) : 지연해서 함수가 실행됨
// 변수 = 함수();
let goSchool = setTimeout(()=>{
    // 코딩
    console.log("학교에 도착");
}, 1000)

// 1st 코딩: 실행
console.log("학교에 감");
goSchool; // 2nd 실행
console.log("학교에서 코딩함");