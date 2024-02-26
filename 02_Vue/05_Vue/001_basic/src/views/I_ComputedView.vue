// I_ComputedView.vue
// vueInit
<template>
    <div>
        <!-- TODO: 컴퓨티트(computed) 함수 예제 -->
        <h4>숫자 : {{ num }}</h4>
        <h4>백분율 : {{ percentAmount }}</h4>
        <h4>연산   : {{ calc }}</h4>
    </div>
</template>
<script>
export default {
    data() {
        return {
            num : 10
        }
    },
    // TODO: 컴퓨티드 함수 정의
    // TODO: 특징 : 1) 콧수염 표기법에 사용
    // TODO:        2) 매개변수 없음, 무조건 return 사용
    computed: {
        // 백분율 함수
        percentAmount() {
            return this.num/100;
        },
        calc() {
            return this.num + 30 * 20;
        }
    }
}
</script>
<style lang="">
    
</style>