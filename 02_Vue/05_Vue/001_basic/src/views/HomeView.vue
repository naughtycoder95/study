// template : html 태그를 작성하는 부분 (화면에 보임)
<template>
  <div class="home">
    <!-- TODO: 콧수염 표기법 : {{ 변수명 }} -->
    <!-- TODO: 1) 문자열 출력 : O -->
    {{ "문자열 출력되나요?" }}
    <br/>
    <!-- TODO: 2) 숫자 출력(산술연산) : O -->
    {{ 1 * 2 + 3 - 2 }}
    <br>
    <!-- TODO: 3) 문자열 붙이기 : + : O -->
    {{ "abc" + "가나다" }}
    <br>
    <!-- TODO: 4) 배열 : O -->
    {{ ["가", "나"] }}
    <br>
    <!-- TODO: 5) 참/거짓 :  -->
    {{ true }}
    <br>
    <!-- TODO: 6) 3항 연산자:  -->
    <!-- TODO: 사용법 : (조건식)?참 : 거짓; -->
    {{ false? "true" : "false" }}
    <br>
    <!-- TODO: 7) 함수 : new Date() -->
    {{ new Date().getMonth() + 1  }}

    <!-- TODO: ----- 코딩하면 안되는 것 ----- -->
    <!-- TODO: 8) 객체 출력 : 객체 -> 문자열 자동변경 (출력) -->
    {{ {name:"홍길동", email: "hong@naver.com"} }}

    <!-- TODO: 9) 조건문 : if문 -->
    <!-- 해결책 : 3항연산자 -->
    <!-- {{  if(true) { console.log("true")}  }} -->

    <!-- TODO: 10) 반복문 : for문 -->
    <!-- {{ for(let i=0;i<2;i++) {console.log("aaa")} }} -->

  </div>
</template>

<script>
// js 코드를 작성하는 부분
export default {
}
</script>
