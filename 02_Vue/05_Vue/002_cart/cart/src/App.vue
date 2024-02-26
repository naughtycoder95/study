<template>
  <!-- TODO: 머리말 -->
  <HeaderCom />

  <!-- TODO: 메뉴 클릭시 나오는 부분 -->
  <router-view />
</template>

<script>
// TODO: 머리말(메뉴) import
import HeaderCom from './components/HeaderCom.vue'
// js 코딩
export default {
  components: {
    HeaderCom
  }
}
</script>

<style lang="scss">
// css 코딩
// 절대경로 : @ === /src
// @import "css파일경로"
@import "../src/assets/css/styles.css";
</style>