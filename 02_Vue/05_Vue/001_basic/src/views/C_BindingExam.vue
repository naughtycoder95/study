// C_BindingExam.vue
// 단축키 : vueInit
// 연습 : 2개의 바인딩 변수(속성)를 이용해서 화면에 출력하세요(소프트코딩)
//    name    : 홍길동
//    hello   : 안녕
// 결과 : 안녕 
//       홍길동
<template>
    <div>
        {{ hello }}
        <br>
        {{ name }}
    </div>
</template>
<script>
export default {
    data() {
        return {
            hello: "안녕",
            name: "홍길동"
        }
    },
}
</script>
<style lang="">
    
</style>