// 03_dom_detail.js
// TODO: DOM 상세 설명
// html 웹 문서 읽기 동작
// 1) 컴퓨터 웹브라우저에서 html 문서를 읽기
//   -> 파싱 : html 사용법 해석
// 2) 파싱된 문서(html) -> 메모리에 트리구조로 저장(DOM)
// 파싱된 문서(DOM) : 트리구조(자료구조)
// 예) html 현재 문서(03_dom.detail.html)
    //           window(최상위 부모객체: html문서, 주소창, 메뉴, 상태바등)
    //              |
    //           document(객체, html 문서)
    //              |
    //             html(태그, 부모)
    //              |
//   -------------------------------------
//   |                                    |
//  head(태그, 자식)                    body(태그)
//                                        |
//                    ----------------------------------------
//                    |                                      |
//   div(태그) - style="backgroundColor='aqua'"(속성)  script - src="./js/03_dom_detail.js"
//                    |
//              "안녕하세요"(텍스트, ==innerHTML속성)
// TODO: html 문서 주요 요소(노드)
// TODO: 1) 태그   : div 등
// TODO: 2) 속성   : style 속성 등
// TODO: 3) 텍스트 : "안녕하세요"
// TODO: 3) 주석   : 