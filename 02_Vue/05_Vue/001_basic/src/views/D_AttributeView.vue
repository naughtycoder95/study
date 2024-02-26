// D_AttributeView.vue
// vueInit
<template>
    <div>
        <!-- TODO: html 속성에 바인딩 -->
        <!-- TODO: 사용법 : <태그 :속성="바인딩속성(변수)" /> -->
        <!-- TODO: 사용법2 : <태그 v-bind:속성="바인딩속성(변수)" /> -->
        <p :id="idA">id 바인딩</p>
        <p v-bind:class="classA">class 바인딩</p>
        <p :style="styleA">스타일 바인딩</p>
        <!-- TODO: <button :disabled="바인딩속성(변수)">버튼</button> -->
        <!-- TODO: 바인딩변수: true(false) => 이렇게 코딩 -->
        <button :disabled="isDisabled">버튼</button>
        <br>
        <!-- TODO: html 속성에 문자열 붙이기 가능 -->
        <span :id="'list' + addId">테스트</span>
        <!-- TODO: 이미지 바인딩 :  -->
        <!-- TODO: 사용법 : <img :src="바인딩속성" alt="암스테르담">  -->
        <!-- TODO: 사용법 : 바인딩속성 : require("이미지경로") 사용  -->
        <img :src="imgSrc" alt="암스테르담">
    </div>
</template>
<script>
export default {
    data() {
        return {
            idA : 10,
            classA : "container",
            // TODO: Vue 에서는 객체 형태로 속성 코딩
            styleA : {
                color:'teal',
                fontSize: '48px',
                textAlign: 'center'
            },
            isDisabled : true,  // 버튼 사용 속성
            addId: 'first',
            // TODO: 상대경로 방식 : 현재 파일을 기준으로 찾기
            // TODO: 절대경로 방식 : 컴퓨터 처음 위치부터 찾기
            // TODO: vue의 처음위치 : src/ => @
            // imgSrc: require("../assets/img/amsterdam.jpg") // 상대경로
            imgSrc: require("@/assets/img/amsterdam.jpg")     // 절대경로
        }
    },
}
</script>
<style lang="">
    
</style>