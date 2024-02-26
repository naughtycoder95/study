// F_IfExam.vue
// role 바인딩 변수를 만들고, ( role : "admin"  )
// role 바인딩 변수가 admin 이면 수정 버튼이 화면에 보이고 아니면 삭제버튼이 보이도록 코딩하세요
// 1) 메뉴부터 연결 : 간단한 문구(화면표시)
// 2) 위의 문제 풀이
<template>
  <div>
    <h3>v-if directive를 이용한 조건처리</h3>

    <button >검색</button>
    <!-- role 바인딩 변수가 admin 이면 수정 버튼이 화면에 보이고 아니면 삭제버튼이 보이도록 코딩하세요 -->
    <button v-if="role==='admin'">수정</button>
    <button v-else>삭제</button>
  </div>
</template>
<script>
export default {
    data() {
        return {
            role: "admin"
        }
    },
};
</script>
<style>

</style>