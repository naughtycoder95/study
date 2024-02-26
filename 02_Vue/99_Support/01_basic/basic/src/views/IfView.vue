<template>
    <div>
        <h3>조건문</h3>
        <!-- 사용법 : v-if='조건식', 참이면 태그가 보이고 거짓이면 안보임 -->
        <p v-if="first == true">1 이 보입니다</p>
        <p v-else-if="second == false">2 가 보입니다</p>
        <p v-else>3 이 보입니다</p>
    </div>
</template>
<script>
export default {
    data() {
        return {
            // 바인딩 속성 == 태그와 연결(:, v-model), 화면과 연결 : {{ }}
            first: false,
            second: true
        }
    },
}
</script>
<style></style>