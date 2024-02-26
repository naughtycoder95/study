<template>
  <!-- 머리말(메뉴) -->
  <HeaderCom />

  <!-- 본문 : class="container" : 페이지 중앙정렬 -->
  <!--        class="mt-5"      : 마진(m)(위(t)) 5거리 -->
  <div class="container mt-5">
    <router-view/>
  </div>
</template>

<script>
import HeaderCom from './components/HeaderCom.vue'
// js 코딩

export default {
  // 자식 컴포넌트 등록(정의)
  components : {
    HeaderCom
  }
}
</script>

<style lang="scss">

</style>
