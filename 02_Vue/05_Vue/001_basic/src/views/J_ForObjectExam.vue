// J_ForObjectExam.vue // vueInit // 아래 객체배열이 제시되어 있다. 화면에
반복문을 이용해서 출력하세요 // 입력 : 데이터 바이딩 속성 : 객체배열 // dept : [
{ dname: "Sales", loc: "부산", }, { dname: "Marketing", loc: "서울", }, { dname:
"Accounting", loc: "대구", }, { dname: "Development", loc: "광주", } ] // 출력 :
// Sales , 부산 // Marketing , 서울 // Accounting , 대구 // Development , 광주
<template>
  <div>
    <!-- TODO: 반복문 출력 -->
    <!-- TODO: data : 배열의 값(객체), index : 배열의 인덱스번호, dept : 배열 -->
    <div v-for="(data, index) in dept" :key="index">
        {{ data.dname }} , {{ data.loc }}
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      dept: [
        {
          dname: "Sales",
          loc: "부산",
        },
        {
          dname: "Marketing",
          loc: "서울",
        },
        {
          dname: "Accounting",
          loc: "대구",
        },
        {
          dname: "Development",
          loc: "광주",
        },
      ],
    };
  },
};
</script>
<style lang=""></style>
