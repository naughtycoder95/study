<template>
    <div>
        <ul>
            <!-- 사용법 : v-for="(변수,인덱스번호) in 배열속성" :key="인덱스번호"-->
            <!-- 위에 있는 v-for 를 적용하면 그태그가 반복해서 화면에 표시됨 -->
            <li v-for="(data, index) in fruits" :key="index">{{ data }}</li>
        </ul>
    </div>
</template>
<script>
export default {
    data() {
        return {
            fruits: ["딸기", "오렌지", "사과", "포도"]
        }
    },
}
</script>
<style></style>