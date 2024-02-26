// 15_quiz_6.js
// TODO: 입력 : prompt()
let char = prompt("문자 1개"); // y

// 조건문
if(char === "y") {
    // #app : 글쓰기 버튼 넣기
    // .innerHTML 속성 사용
    document.querySelector("#app").innerHTML = "<button>글쓰기</button>";
} else {
    // #app : 글수정 버튼 넣기
    document.querySelector("#app").innerHTML = "<button>글수정</button>";
}