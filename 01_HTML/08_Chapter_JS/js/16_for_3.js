// 16_for_3.js
// TODO: break, continue 예약어
// TODO: 위의 예약어는 반복문사용시 사용함

// TODO: 1) break : 반복문을 강제 중단하는 예약어
// TODO: 예제 1)  1부터 5까지 반복해서 3이 될때 중단하고 빠져나오는
// TODO:         코드를 작성하세요
// 복습 : for(초기값; 조건식; 증감식) {실행문;}
// for(let i=1; i<6; i++) {
//     // i 의 값 출력
//     console.log(i);
//     // TODO: i=3 일때 반복문 강제 중단하기
//     if(i === 3) {
//         break; // 강제 반복문 중단
//     }
// }

// TODO: 예제 2) 1 ~ 5까지 출력하되 3은 제외하고 출력하세요
for(let i=1; i<6; i++) {
    // TODO; i=3일때 continue 사용하기
    if(i === 3) {
        // 1) 밑에 명령문이 실행안됨
        // 2) 반복문에 다시 실행시킴 : i++(1증가) 
        continue; 
    }

    // i의 값 출력
    console.log(i);
}