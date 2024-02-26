// ctrl + / : js 주석
// TODO: 자료형 
// 1) 문자열(String) : 예) "가나다", "abc", 'abc' 등
// alert("가나다");
// 2) 숫자(Number)   : 예) 1,2,3
// alert(1);

// TODO:  표현식 : 변수, 상수, 값 
// TODO: 수학 방정식 등은 기호로 표시하는데 
// TODO: 유사하게 식을 만들어 표시
// 1) 변수 : 변하는 값을 저장하는 곳(공간), 값 수정 가능
//    변수 사용법 : let 변수명 = 값;
// 샘플) let hello(변수명) =(저장) "Hello Js"(문자열 값);
// TODO: 코딩 추천 : 변수를 사용해서 결과를 출력 (소프트코딩 vs  하드코딩(비추천))
// let hello = "Hello Js";
// // 변수는 값을 수정할 수 있음
// hello = "Hello Js2";
// alert(hello);

// 2) 상수 : 변하지 않는 값을 저장하는 곳(공간), 값 수정 불가
//    상수 사용법 : const 상수명 = 값;
// const hello = "Hello Js";
// // TODO: 상수값 수정 불가
// // hello = "Hello Js2";
// alert(hello);

// TODO: 연산자
// 1) 사칙연산 : +(덧셈), -(뺄셈), *(곱셈), /(나눗셈(슬래쉬)), 
// TODO:        %(나머지 연산자:나누었을때 나머지가 결과로 나옴)
// 실습)
// 1) 덧셈
// let num = 52 + 273;
// alert(num);

// 2) 뺄셈
// let num2 = 52 - 273;
// alert(num2);

// 3) 곱셈
// let num3 = 52 * 273;
// alert(num3);

// 4) 나눗셈
// let num4 = 52 / 273;
// alert(num4);

// 5) 나머지 연산자
// let num5 = 8 % 2; // 0(나머지)
// alert(num5);

// TODO: 문자열 특수문자 : \(역슬래쉬), /(슬래쉬)
// 1) 줄바꿈 : \n
// let hello = "안녕하세요\n 홍길동입니다."
// alert(hello);

// 2) 홑따옴표, 쌍따옴표 출력
// TODO: 특수문자 : \", \'
// 결과 : 안녕'하세요"
// let hello = "'안녕하세요'";
let hello = '안녕 \'하세요"';
alert(hello);