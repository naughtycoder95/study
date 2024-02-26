// 05_quiz_2.js
// TODO: querySelectorAll() : 여러개 태그 선택(접근) : 배열
// TODO: 배열 -> 반복문(for문)
let header = document.querySelectorAll("h1"); //배열

// TODO: 배열변수.length => 배열의 개수
// 반복문 : for문
for(let i=0; i<header.length; i++) {
    // 조작
    header[i].innerHTML = "From JavaScript";
    header[i].style.color = "orange";
    header[i].style.background = "red";
}

// 참고) quiz 1번
// let header = document.querySelector("h1"); // h1태그 1개

// header.style.color = "orange";
// header.style.background = "red";
// header.innerHTML = "From JavaScript";