// 14_Code_100_6.js

// 📃 1065) 퀴즈
// 정수 3개 입력받아 짝수만 출력하기(설명)
// 입력 : 1 2 4
// 출력 : 2
//        4
// TODO: %(나머지 연산자)
// let num = prompt("정수 3개").split(" ");
// let first  = Number(num[0]); //1
// let second = Number(num[1]); //2
// let third  = Number(num[2]); //4

// // 조건문 #1 : first = 1
// if(first % 2 == 0) {
//      console.log(first);
// }
// // 조건문 #2 : second = 2
// if(second % 2 == 0) {
//     console.log(second);
// }
// // 조건문 #3 : third = 4
// if(third % 2 == 0) {
//     console.log(third);
// }

// 📃 1066) 퀴즈
// 정수 3개 입력받아 짝/홀 출력하기(설명)
// 입력 : 1 2 8
// 출력 : odd
// even
// even
// num[0]="1", num[1]="2", num[2]="8"
// let num = prompt("정수 3개").split(" ");
// // 숫자 변경
// let first  = Number(num[0]); // 1
// let second = Number(num[1]); // 2
// let third  = Number(num[2]); // 8

// // 조건문 # 1
// // 짝수이면
// if(first % 2 == 0) {
//     console.log("even");
// } else {
//     // 홀수이면
//     console.log("odd");
// }
// // 조건문 # 2
// // 짝수이면
// if(second % 2 == 0) {
//     console.log("even");
// } else {
//     // 홀수이면
//     console.log("odd");
// }
// // 조건문 # 3
// // 짝수이면
// if(third % 2 == 0) {
//     console.log("even");
// } else {
//     // 홀수이면
//     console.log("odd");
// }

// 📃 1067) 퀴즈
// 입력된 정수에 대해
// 첫 줄에 minus 나 plus 를 출력하고,
// 두 번째 줄에 odd 나 even 을 출력한다.
// 입력 : -2147483648
// 출력 : minus
// even
// let num = Number(prompt("숫자 1개"));

// // 조건문 # 1 : minus / plus
// // 양수이면
// if(num >= 0) {
//     console.log("plus");
// } else {
//     console.log("minus");
// }

// // 조건문 # 2 : odd(홀수) / even(짝수)
// // 짝수이면
// if(num % 2 == 0) {
//     console.log("even");
// } else {
//     console.log("odd");
// }

// 📃 1068) 퀴즈
// 점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
// 평가 기준
// 점수 범위 : 평가
// 90 ~ 100 : A
// 70 ~ 89 : B
// 40 ~ 69 : C
// 0 ~ 39 : D
// 로 평가되어야 한다.
// 입력 : 73
// 출력 : B
// let num = Number(prompt("정수 1개"));

// // 조건문
// // 90 <= num <= 100
// // 90 <= num && num <= 100
// if( 90 <= num && num <= 100 ) {
//     // 90 ~ 100 : A
//     console.log("A");
// } else if(70 <= num && num <= 89) {
//     // 70 ~ 89 : B
//     console.log("B");
// } else if(40 <= num && num <= 69) {
//     // 40 ~ 69 : C
//     console.log("C");
// } else if(0 <= num && num <= 39) {
//     // 0 ~ 39 : D
//     console.log("D");
// } 

// 📃 1069) 퀴즈
// 평가 출력
// 평가 : 내용
// A : best!!!
// B : good!!
// C : run!
// D : slowly~
// 나머지 문자들 : what?
// 입력 : A
// 출력 : best!!!
// let char = prompt("문자 1개");
// // 조건문 
// // TODO: 같다(==, ===)
// if(char === "A") {
//     alert("best!!!");
// } else if(char === "B") {
//     alert("good!!");
// } else if(char === "C") {
//     alert("run!");
// } else if(char === "D") {
//     alert("slowly~");
// } else {
//     alert("what?");
// }

// 📃 1070) 퀴즈
// 월이 입력될 때 계절 이름이 출력되도록 해보자.
// 월 : 계절 이름
// 12, 1, 2 : winter
// 3, 4, 5 : spring
// 6, 7, 8 : summer
// 9, 10, 11 : fall
// 입력 : 12
// 출력 : winter
let num = Number(prompt("숫자 1개"));

// 조건문
if(num === 12 || num === 1 || num === 2) {
    // 12이거나 1이거나 2이거나 : winter
    alert("winter");
} else if(3 <= num && num <= 5) {
    // 3이거나 4이거나 5이거나 : spring
    // 3 <= num <= 5 사이일때 : spring
    alert("spring");
} else if(6 <= num && num <= 8) {
    //  6, 7, 8 : summer
    alert("summer");
} else if(9 <= num && num <= 11) {
    // 9, 10, 11 : fall
    alert("fall");
}