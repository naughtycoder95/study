// 12_quiz_4.js
// 버튼 클릭 함수 정의
// sum_avg(80, 90, 100) : params=80, params2=90, params3=100
// TODO: .innerHTML 사용
function sum_avg(params, params2, params3) {
    // TODO: 1) 국어(kor) 80 넣기
    document.querySelector("#kor").innerHTML = params; // 국어 span 태그 선택
    // TODO: 2) 영어(eng) 90 넣기
     // 영어 span 태그 선택
    document.querySelector("#eng").innerHTML = params2; // 90
    // TODO: 3) 수학 span 태그 선택
    document.querySelector("#math").innerHTML = params3; // 100
    // 국어 + 영어 + 수학 합계
    let sumVal = params + params2 + params3;
    // TODO: 4) 합계 span 태그 선택
    document.querySelector("#sum").innerHTML = sumVal;   // 270
    // 평균 구하기 : 합계/개수
    let avgVal = sumVal/3
    // TODO: 5) 평균 span 태그 선택
    document.querySelector("#avg").innerHTML = avgVal;  // 90
}