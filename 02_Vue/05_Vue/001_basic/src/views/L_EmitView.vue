// L_EmitView.vue : 부모컴포넌트
// vueInit
<template>
    <div>
        예제
        <!-- TODO: <자식컴포넌트 @호출함수명="부모함수명" /> -->
        <L_ChildComVue @message="message" />
    </div>
</template>
<script>
// TODO: 자식컴포넌트 import
import L_ChildComVue from '@/components/L_ChildCom.vue'

export default {
    components: {
        L_ChildComVue
    },
    methods: {
        message() {
            alert("안녕");
        }
    },

}
</script>
<style lang="">
    
</style>