// 19_array.js
// TODO: 배열    : 여러가지 값을 저장하는 곳(장소)
// TODO: 배열변수명 : 1개, 인덱스번호로 각 값을 구분함
// TODO:   예) num[0] = 1, num[1] = 2, ....
// vs 변수 : 1가지 값을 저장하는 곳(장소) 

// 예제) 아래와 같이 색깔 배열이 있다. 화면에 배열의 값을 
//     모두 출력하세요
let color = ["red", "green", "blue", "yellow", "skyblue"]; // 배열정의

// 모두 출력
// console.log(color[0]);
// console.log(color[1]);
// console.log(color[2]);
// console.log(color[3]);
// console.log(color[4]);

// TODO: 반복문 for 문
// for(let i=0; i<5; i++) {
//     // 1) i=0 -> 0<5(참) ->console.log(color[0]) -> i=1
//     // 2) i=1 -> 1<5(참) ->console.log(color[1]) -> i=2
//     // 3) i=2 -> 1<5(참) ->console.log(color[2]) -> i=3
//     // ...
//     console.log(color[i]); // 5번 실행
// }

// TODO: 연습 1) 화면에 배열 값들을 모두 출력하세요
// let array = [1,2,3,4,5];  // 숫자 배열 정의

// for(let i=0; i<5; i++) {
//     // 1) i=0 -> 0<5(참) -> console.log(array[0]); -> i=1
//     // 2) i=1 -> 1<5(참) -> console.log(array[1]); -> i=2
//     // ...
//     console.log(array[i]); // 0 ~ 4까지 배열값 출력
// }

// TODO: 연습 2) 아래와 같은 배열 값들이 있다.
// 아래처럼 출력하세요
// 단, console.log 사용하세요
// 출력 : 1 : 우유구매
//        2 : 업무 메일 확인하기
//        3 : 필라테스 수업
// TODO: console.log((i+1) + ":" + 배열변수[] )
let todos = ["우유구매", "업무 메일 확인하기", "필라테스 수업"];

// 반복문 : 총3번 반복
for(let i=0; i<3; i++) {
    console.log((i+1) + ":" + todos[i]);
}