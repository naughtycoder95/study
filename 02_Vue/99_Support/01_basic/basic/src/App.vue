<template>
  <HeaderCom />
  <!-- html 태그 : 화면에 보이는 메뉴 -->
  <nav>
    <router-link to="/">Home</router-link> |
    <router-link to="/about">About</router-link> |
    <router-link to="/attr">속성</router-link> |
    <router-link to="/form">폼</router-link> |
    <router-link to="/if">조건문</router-link> |
    <router-link to="/for">반복문</router-link> |
  </nav>
  <router-view />
</template>

<script>
import HeaderCom from './components/HeaderCom.vue';
export default {
  components: {
    HeaderCom
  }
}
</script>

<style></style>
