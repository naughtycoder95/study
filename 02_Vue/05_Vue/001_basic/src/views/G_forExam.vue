// G_forExam.vue
// vueInit
// 아래에 배열 바인딩 변수가 제시되어 있다. 화면에 반복문을 이용해서 출력하세요
// citis : ["부산", "서울", "광주", "대구"]
// 결과 : 부산
//       서울
//       광주
//       대구
<template>
  <div>
    <!-- TODO: html 태그에서 대상 : 목록, 테이블, div-div -->
    <ul>
      <li v-for="(data, index) in citis" :key="index">{{ data }}</li>
    </ul>
  </div>
</template>
<script>
export default {
    data() {
        return {
            citis : ["부산", "서울", "광주", "대구"]
        }
    },
};
</script>
<style>

</style>
