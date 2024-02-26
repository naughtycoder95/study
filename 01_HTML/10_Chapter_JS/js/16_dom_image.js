// 16_dom_image.js
// 태그 선택(접근) : document.querySelector()
let image = document.querySelector("#Image"); // img선택

// TODO: js에서 속성 넣기
// 빈 이미지를 제공하는 사이트 주소 : http://placehold.it/300x200
image.src = "http://placehold.it/300x200"; // 이미지 경로 속성
image.width = "300"; // 가로크기 속성
image.height = "200"; // 세로크기 속성
