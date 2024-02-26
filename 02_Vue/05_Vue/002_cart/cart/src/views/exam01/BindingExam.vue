// BindingExam.vue
// vueInit
// 연습문제 : 2개의 바인딩 변수를 이용해 아래결과와 같이 출력하세요
// 바인딩변수 : 
//  product     : "Lamp"
//  description : "Very Good experience"
// 결과 :
//   Lamp is Very Good experience
<template>
    <div>
        <h1>{{ product }}</h1>
        <p>I Love {{ product }}</p>
        <!-- TODO: 여기 출력하세요 -->
        <p>{{ product }} is {{ description }} </p>
    </div>
</template>
<script>
export default {
    data() {
        return {
            product: "Lamp",
            description: "Very Good experience"
        }
    },
}
</script>
<style lang="">
    
</style>