// ConditionView.vue : 조건문(if)
// vueInit
<template>
    <div id="app">
        <!-- TODO: 카드(장바구니) 헤더바 -->
        <div class="nav-bar"></div>

        <!-- TODO: 장바구니 본문 -->
        <div class="product-display">
            <div class="product-container">
                <!-- TODO: 왼쪽 이미지(양말) -->
                <div class="product-image">
                    <img :src="image" alt="양말">
                </div>

                <!-- TODO: 오른쪽 설명글 -->
                <div class="product-info">
                    <h1>{{ product }}</h1>
                    <!-- TODO: 조건문(if) : inStock=true(false) -->
                    <!-- TODO: 사용법 : <태그 v-if="조건식">문자열</태그> -->
                    <p v-if="inStock == true">In Stock</p>
                </div>

            </div>
        </div>
    </div>
</template>
<script>
// js 코딩
export default {
    data() {
        return {
            product: "Socks",
            image: require('@/assets/images/socks_green.jpg'),
            inStock: true, // 조건문에서 사용
        }
    },
}
</script>
<style></style>