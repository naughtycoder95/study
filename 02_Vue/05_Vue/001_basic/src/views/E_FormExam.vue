// E_FormExam.vue // vueInit // 연습 : 2개의 Form 바인딩 변수를 이용해서 부서
추가 페이지를 완성하세요 // 입력양식(input 태그)<input type="text" />
// dname : "판매부" 
// loc : "부산" 
// 결과 : // 판매부 
//          부산
<template>
  <div>
    <div>
      <label for="dname">부서명</label>
      <input type="text" id="dname" v-model="dname" />
      <br>
      <label for="loc">Loc</label>
      <input type="text" id="loc" v-model="loc" />
    </div>
  </div>
</template>
<script>
export default {
    data() {
        return {
            dname: "판매부",
            loc: "부산"
        }
    },
};
</script>
<style lang=""></style>
