// L_ChildCom.vue : 자식컴포넌트
// vueInit
<template>
    <div>
        <button @click="msg">부모함수</button>
    </div>
</template>
<script>
export default {
    // TODO: 함수(메소드) 정의
    methods: {
        msg() {
            // TODO: 부모함수 : message() 호출
            // TODO: 사용법 : this.$emit("부모함수명");
            this.$emit("message");
        }
    },
    
}
</script>
<style lang="">
    
</style>