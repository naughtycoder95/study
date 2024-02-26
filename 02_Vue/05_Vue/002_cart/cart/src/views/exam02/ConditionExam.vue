// ConditionExam.vue : 조건문(if)
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
                    <!-- TODO: 연습 : inventory > 10 => 재고있음 , 화면에 보이고,
                        inventory > 0 ~ inventory <= 10 => 재고가 떨어져감, 화면에 보이고
                        inventory <= 0 => 재고없음 으로 화면에 보임
                        => 초기값 : inventory = 0; 
                     -->
                    <p v-if="inventory > 10">재고있음</p>
                    <p v-else-if="inventory > 0 && inventory <= 10">재고 떨어져감</p>
                    <p v-else>재고 없음</p>
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
            inventory: 0,
        }
    },
}
</script>
<style></style>