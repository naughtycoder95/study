// H_MethodView.vue
// vueInit
<template>
    <div>
        <!-- TODO: 사용법 : <button @click="함수명">문자열</button> -->
        <!-- TODO:  methods: { 함수명(){실행문} } -->
        <!-- <button @click="clickBtn">1st 버튼</button> -->
        <!-- 참고 : 같은 의미 : @ == v-on: -->
        <button v-on:click="clickBtn">1st 버튼</button>
        <br>
        <button @click="clickBtn2">2nd 버튼</button>
        <br>
        <button @click="clickBtn3(10)">3rd 버튼</button>
    </div>
</template>
<script>
export default {
    data() {
        return {
            message: "Hello World"
        }
    },
    // TODO: 함수 정의
    methods: {
        clickBtn() {
            alert("클릭");
        },
        clickBtn2() {
            // TODO: this : 자기자신(뷰 객체) : 뷰가 가진 모든 재산을(data, 함수 등) 참고할 수 있음
            alert(this.message);
        },
        // TODO: 매개변수가 있는 함수(메소드)
        clickBtn3(num) {
            alert(num);  // html 태그 : 10 전달
        }
    },
}
</script>
<style lang="">
    
</style>