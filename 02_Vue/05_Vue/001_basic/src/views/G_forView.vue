// G_forView.vue
// vueInit
<template>
<!-- TODO: 반복문 예제 -->
    <div>
        <ul>
            <!-- TODO: 사용법 : <태그 v-for="(변수명, 변수명2) in 배열" :key="변수명2">{{ 변수명 }}</태그> -->
            <!-- TODO: 변수명 : 배열의 값 , 변수명2 : 배열의 인덱스번호 -->
            <li v-for="(data, index) in fruits" :key="index">{{ data }} {{ index }}</li>
        </ul>
    </div>
</template>
<script>
// js 코딩
export default {
    data() {
        return {
            fruits : ["딸기", "오렌지", "사과", "포도"]
        }
    },
}
</script>
<style>
    /* css 코딩 */
</style>