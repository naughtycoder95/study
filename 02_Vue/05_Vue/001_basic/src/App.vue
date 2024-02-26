// html 코딩 부분
<template>
  <nav>
    <B_HeaderComVue />

    <!-- <a href="/">Home</a> |
    <a href="/about">About</a> -->
    <!-- TODO: 성능이 좋음 -->
    <router-link to="/">Home</router-link> |
    <router-link to="/about">About</router-link> |
    <router-link to="/binding">BindingView</router-link> |
    <router-link to="/binding-exam">BindingExam</router-link> |
    <router-link to="/attribute">AttributeView</router-link> |
    <router-link to="/attribute-exam">AttributeExam</router-link> |
    <router-link to="/form">FormView</router-link> |
    <router-link to="/form-exam">FormExam</router-link> |
    <router-link to="/if">IfView</router-link> |
    <router-link to="/if-exam">IfExam</router-link> |
    <router-link to="/for">forView</router-link> |
    <router-link to="/for-exam">forExam</router-link> |
    <router-link to="/method">MethodView</router-link> |
    <router-link to="/method-exam">MethodExam</router-link> |
    <router-link to="/computed">ComputedView</router-link> |
    <router-link to="/computed-exam">ComputedExam</router-link> |
    <router-link to="/for-object">ForObjectView</router-link> |
    <router-link to="/for-object-exam">ForObjectExam</router-link> |
    <router-link to="/props">PropsView</router-link> |
    <router-link to="/props-exam">PropsExam</router-link> |
    <router-link to="/emit">EmitView</router-link> |
  </nav>
  <!-- TODO: 컴포넌트(페이지)가 화면에 보이는 부분 -->
  <!-- TODO: 예) "/" 클릭 -> HomeView.vue -> <router-view /> 태그영역에 보임  -->
  <!-- TODO: 예) "/about" 클릭 -> AboutView.vue -> <router-view /> 태그영역에 보임  -->
  <router-view />
  <B_FooterComVue />
</template>

<script>
// js 코딩
import B_FooterComVue from "./components/B_FooterCom.vue";
import B_HeaderComVue from "./components/B_HeaderCom.vue";

export default {
  components: {
    B_FooterComVue,
    B_HeaderComVue,
  },
};
</script>

<style lang="scss">
// css 코딩 부분
</style>
