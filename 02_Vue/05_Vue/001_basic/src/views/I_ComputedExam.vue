// I_ComputedExam.vue
// vueInit
// 예제 : 아래에 100 이 주어진 값이 있다. 
// 항상 바인딩 변수값에서 -10을 빼는 컴퓨티드 함수를 만들어서 화면에 출력하세요
// 바인딩 변수명(속성)  : num : 100
// 컴퓨티드 함수명 : minusAmount()
<template>
    <div>
        <h4>숫자(10차감) : {{ minusAmount }}</h4>
    </div>
</template>
<script>
export default {
    data() {
        return {
            num: 100
        }
    },
    computed: {
        minusAmount() {
            return this.num - 10;
        }
    }
}
</script>
<style lang="">
    
</style>