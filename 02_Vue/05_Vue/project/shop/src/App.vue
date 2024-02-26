<template>
  <MyHeader />
  <MyNavbar />
  <router-view />
</template>

<script>
import MyHeader from './components/MyHeader.vue';
import MyNavbar from './components/MyNavbar.vue';
export default {
  components: {
    MyHeader,
    MyNavbar
  }
}
</script>

<style lang="scss"></style>
