// 20_quiz_9.js
// 1st 버튼 클릭 함수 : 전등켜기 이미지 보기
function lightOn() {
    // 클릭하면 실행할 코딩
    // <img src="./img/light_off.png" :전등끄기
    // <img src="./img/light_on.png" :전등켜기
    // TODO: 1) img 태그 선택(접근)
    let img = document.querySelector("img"); // img 태그
    // TODO: 2) img 태그의 src 속성 = "./img/light_on.png"
    img.src = "./img/light_on.png";
}

// 2nd 버튼 클릭 함수 : 전등끄기 이미지 보기
function lightOff() {
    // 클릭하면 실행할 코딩
    // TODO: 1) img 태그 선택(접근)
    let img = document.querySelector("img"); // img 태그
    img.src = "./img/light_off.png";
}
