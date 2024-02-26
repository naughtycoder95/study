// 02_dom_innerHTML.js
// DOM 접근 함수 : 바닐라 js(순수 js 사용법)
// TODO: 사용법
//   document.querySelector("css선택자").innerHTML = "문자열(html태그)";
// TODO: css선택자로 선택한 태그 사이에 글자를 넣는 속성
// document.querySelector("#output").innerHTML = "hello world";

// TODO: 변수를 활용
let output = document.querySelector("#output");
output.innerHTML = "hello world";
// css 속성(js) : fontSize (낙타표기법: 카멜표기법)
output.style.fontSize = "50px";
output.style.textAlign = "center";