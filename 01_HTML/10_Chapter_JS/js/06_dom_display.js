// 06_dom_display.js
// TODO: 이벤트 : click(클릭: 90%), 마우스, 키보드 키다운/업 등의 행위
let closeBtn = document.querySelector(".popup > button");

// 클릭 이벤트
// TODO: 사용법 : 
// let 변수 = document.querySelector("css선택자");
// 변수.addEventListener("이벤트", function(){
//     실행문;
// });
closeBtn.addEventListener("click", function(){
    // TODO: 클릭시 실행될 코드
    document.querySelector(".popup").style.display = "none";
});