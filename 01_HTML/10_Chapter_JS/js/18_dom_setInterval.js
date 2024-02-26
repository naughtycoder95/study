// 18_dom_setInterval.js
// TODO: 계속 동작하는 시계 예제
// TODO: 1) 태그 선택 : 
let clock = document.querySelector("#clock"); // h1태그

// TODO: 사용법 :
// 1초 = 1000밀리초
// setInterval(function() {
//     반복할실행문;
// },밀리초);
// TODO: 계속 몇초마다 코드를 반복 실행하는 함수
setInterval(function() {
    // TODO: 반복할 코드 작성
    let date = new Date(); // 현재 날짜(시간 포함)
    clock.innerHTML = date;
},1000);