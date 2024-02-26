// 09_event_mouseover.js
// 클릭 함수 정의
function changeText(event) {
    // 복습 : event.target == 현재 이벤트 걸린 태그 저장됨
    event.target.innerHTML = "클릭하셨네요!";
}

// TODO: 마우스 커서 위 함수 정의
function mouseOver(event) {
    event.target.style.backgroundColor = "orange";
}
// TODO: 마우스 커서 나갔을때 함수 정의
function mouseOut(event) {
    event.target.style.backgroundColor = "skyblue";
}