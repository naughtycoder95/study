// D_AttributeExam.vue
// vueInit
// 연습 : 1개의 속성 바인딩 변수를 이용해서 이미지를 화면에 출력하세요 
//  바인딩변수명 : imgSrc
//  바인딩변수값 : img/paris.jpg
// 결과 : 이미지출력
<template>
    <div>
        <img :src="imgSrc" alt="파리">
    </div>
</template>
<script>
export default {
    data() {
        return {
            imgSrc: require("@/assets/img/paris.jpg")
        }
    },
}
</script>
<style lang="">
    
</style>