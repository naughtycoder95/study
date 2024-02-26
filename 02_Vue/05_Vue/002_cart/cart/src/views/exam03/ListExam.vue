// ListExam.vue
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
                    <p v-if="inStock == true">In Stock</p>

                    <ul v-for="(data, index) in details" :key="index">
                        <li>{{ data }}</li>
                    </ul>

                    <ul v-for="(data, index) in variants" :key="index">
                        <li>{{ data.color }}</li>
                    </ul>

                    <!-- TODO: 연습 : sizes:["10", "20"] 바인딩속성을 이용해서
                            아래 ul 태그에 반복문을 코딩하세요
                            사용법 : v-for="(data, index) in 배열" :key="index"
                     -->
                    <ul v-for="(data, index) in sizes" :key="index">
                        <li>{{ data }}</li>
                    </ul>

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
            // TODO: 반복문 예제
            sizes: ["10", "20"],   // 연습 
            details: ["50% cotton", "30% wool", "20% polyester"],
            variants: [{
                id: 2234,
                color: "green"
            }, {
                id: 2235,
                color: "blue"
            }]
        }
    },
}
</script>
<style></style>