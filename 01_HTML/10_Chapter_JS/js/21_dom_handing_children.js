// 21_dom_handing_children.js
// TODO: children : 선택한 태그의 자식태그 선택하기
// TODO: 사용법 :
// let 부모태그변수 = document.querySelector("부모태그");
// 부모태그변수.children[인덱스번호].속성;

// TODO: 1) 부모태그(ul) 선택
let ul = document.querySelector("ul"); // ul태그
// TODO: 2)자식 태그(li) 선택
let two   = ul.children[1].innerHTML; // 2nd li의 텍스트
let three = ul.children[2].innerHTML; // 3rd li의 텍스트

// 출력
console.log("two", two);
console.log("three", three);