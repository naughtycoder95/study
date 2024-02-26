// 18_while.js
// TODO: while : 반복문의 다른 사용법
// 예제 1) 
// 입력 : 없음
// 출력 : 안녕하세요 5번 출력
// TODO: for 문
// 사용법 : for(초기값;조건식;증감식){실행문;}
// for(let i=1; i<=5; i++) {
//     console.log("안녕하세요");
// }

// TODO: while 문
// TODO: 사용법 : 
// 초기값; 
// while(조건식) {
//     실행문;
//     증감식;
// }
// let i=1; 
// while(i<=5) {
//     console.log("안녕하세요");
//     i++;
// }

// TODO: do ~ while 문
// 조건식 판단을 실행문 실행후 판단함(최초 1번은 실행됨)
// let i=6; 
// do {
//     console.log("안녕하세요");
//     i++;
// } while(i<=5);

// TODO: 반복문의 특수한 형태 : 무한 반복문(루프)
// TODO: for문 사용
// for(;true;) {
//     console.log("a");
// }

// TODO: while문 사용
// while(true) {
//     console.log("a");
// }

// TODO: 
// 예제 : 무한루프 예제(while문)
// 입력값이 숫자 5가 입력될때 까지
// 무한히 화면에 숫자를 출력하세요
while(true) {
    let num = Number(prompt("문자 1개")); 

    if(num === 5) {
        break; // 중단
    }

    // 입력값 출력
    console.log(num);
}
