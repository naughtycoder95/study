// K_PropsExam.vue : 부모 컴포넌트
// vueInit
// 연습 : props 속성을 이용해서 자식 컴포넌트에게 아래 데이터값을 전송하세요
   props 속성명 : pdata
   props 데이터 : "Hello Vue"
<template>
    <div>
        연습
        <K_TodoExamVue :pdata="pdata" />
    </div>
</template>
<script>
// TODO: 자식 컴포넌트 import
import K_TodoExamVue from '@/components/K_TodoExam.vue'

export default {
    data() {
        return {
            pdata : "Hello Vue"
        }
    },
    components: {
        K_TodoExamVue
    }
}
</script>
<style lang="">
    
</style>