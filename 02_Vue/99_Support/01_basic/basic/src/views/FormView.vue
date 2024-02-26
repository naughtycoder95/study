<template>
    <div>
        <label for="">아이디</label>
        <input type="text" v-model="userId">
        <br>
        <label for="">패스워드</label>
        <input type="text" v-model="password">
    </div>
</template>
<script>
export default {
    data() {
        return {
            userId: "홍길동",
            password: null,
        }
    },
}
</script>
<style></style>