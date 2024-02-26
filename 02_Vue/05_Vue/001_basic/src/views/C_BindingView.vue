// views/C_BindingView.vue
// 단축키 : vueInit
// html 코딩
<template>
    <div>
        <!-- 예제 3: 바인딩 (심화) : {{ 변수명 }} -->
        {{ hello }}
        <br/>
        {{ message }}
        <br>
        <!-- TODO: html 태그 적용 속성(비추천) -->
        <span v-html="message"></span>
    </div>
</template>

<script>
// js 코딩
export default {
    data() {
        return {
            hello: "안녕",
            message: "<h1>안녕하세요</h1>"
        }
    },
}
</script>
<style lang="">
    /* css 코딩 */
</style>