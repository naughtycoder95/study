<template>
    <div>
        <p :id="idA">아이디 바인딩 : {{ idA }}</p>
        <br />
        <img v-bind:src="imgSrc" />
        <br />
    </div>
</template>
<script>
export default {
    data() {
        return {
            idA: 10,
            imgSrc: require('../assets/logo.png')   // require : 파일 가져오기(?)
        }
    },
}
</script>
<style lang="">
    
</style>