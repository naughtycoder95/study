// 02_location.js
// 네이버 클릭 함수 정의
function moveNaver() {
    // TODO: 웹브라우저 항상 페이지 주소에 대한 이력을 남김
    location.href = "http://www.naver.com";
}

// 구글 클릭 함수 정의
function moveGoogle() {
    // TODO: 페이지 이동 시 이력을 남기지 않음(돌아갈수 없음)
    location.replace("http://www.google.com");
}