// TODO: 문자열 연산(붙이기, 더하기) *
// TODO: 1) 사용법 : let 변수명 = "문자열" + "문자열2"
// TODO: 문자열과 문자열2가 합쳐져서 결과가 출력됨
// let hello = "안녕하세요" + "홍길동입니다.";
// alert(hello);

// TODO: 2) 자료형 계속 : 참/거짓을 나타내는 자료형(bool/boolean)
// let hello = true; // 참
// let hello = false; // 거짓
// alert(hello);

// TODO: 3) 비교연산자 : >=(크거나 같다), <=(작거나 같다), >(크다), <(작다)
// TODO: 3) 비교연산자 : ==(같다), ===(같다, 일치여부 엄격검사, js), !=(같지 않다)

// TODO: 4) 이름짓기(명명법)
// 변수/상수 이름짓기 주의점 : 1) 첫글자는 영문자, 달러($), 언더바(_) 숫자는 오면 안됨
// 변수/상수 이름짓기 주의점 : 2) 대소문자 구분
// 변수/상수 이름짓기 주의점 : 3) let(변수명 정의), const(상수명 정의) : let let(x)

// TODO: 4-1) 카멜 표기법(camelCase) : 낙타 표기법
// TODO: 사용법) 단어와 단어 사이는 대문자, 첫글자는 소문자로 이름짓기
// 예) hello + world -> helloWorld
// 활용 : 변수명/상수명, 함수명(메소드명) 등

// TODO: 4-2) 파스칼 표기법(Pascal)
// TODO: 사용법) 단어와 단어 사이는 대문자, 첫글자는 대문자로 이름짓기
// 예) hello + world -> HelloWorld
// 활용 : 클래스명, 생성자명

// TODO: 4-3) 기타 표기법 : 언더바 표기법(스네이크 표기법), 마이너스 표기법
// 예) hello + world -> hello_world (언더바 표기법)
// 예) hello + world -> hello-world (마이너스 표기법)
// 활용 : html, css 속성명, url 주소

// TODO: 5) 논리 연산자
// TODO: 5-1) 논리곱(and) : && (엔퍼센트 2개)
// 예)
// let helloWorld = true && true; // true
// let helloWorld2 = true && false; // false

// alert(helloWorld);
// alert(helloWorld2);

// TODO: 5-2) 논리합(or) : || (짝대기 2개)
// 예)
// let helloWorld = true || true; // true
// let helloWorld2 = true || false; // false

// alert(helloWorld);
// alert(helloWorld2);

// TODO: 5-3) 논리부정(not) : ! (참이면 거짓이 되고, 거짓이면 참이됨)
// 예)
// let helloWorld = !true; // false
// alert(helloWorld);

// TODO: 6) 대입 연산자() : 값 저장 용도로 사용 : +
//
//

// TODO: 6-1) 대입 연산자(축약형) : 사칙연산에 한해 사용
// 예)
// let x = 10; // 값 정의(변수 정의)
// x = x + 5;
// x += 5; // 대입 연산자 축약형(+)

// let x = 10;
// x = x - 5;
// x -= 5;

// let x = 10;
// x = x * 5;
// x *= 5;

// let x = 10;
// x = x / 5;
// x /= 5;

// let x = 10;
// x = x % 5;
// x %= 5;

// TODO: 증감 연산자(*)
// TODO: 1씩 증가 또는 감소 시키는 연산자 : ++(1증가), --(1감소)
// TODO 사용법 : 변수명 ++, ++변수명 / 변수명--, --변수명
// 예)
// let x=10;
// ++x; // x=11 (1증가 시키고 바로 결과도 적용됨)
// alert(x);
// --x;
// alert(x);

// let y=10;
// y++; // y=10 (1증가 시키고 다음 라인에 결과가 적용됨)
// alert(y);
// y--;
// alert(y);
