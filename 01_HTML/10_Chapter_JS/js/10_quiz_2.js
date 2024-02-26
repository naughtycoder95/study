// 10_quiz_2.js
// 버튼 클릭 함수 정의
function innerhtml() {
    // TODO: 1) div(output) 태그 사이에 시간을 넣기(.innerHTML)
    let output = document.querySelector("#output"); // div태그
    // TODO: 2) 현재시간
    let date = new Date(); // 현재시간
    // TODO: 3) 현재시간 div(output) 넣기
    output.innerHTML = date;
}
