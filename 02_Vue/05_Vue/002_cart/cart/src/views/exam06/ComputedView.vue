// ComputedView.vue
<template>
    <div id="app">
        <!-- TODO: 카드(장바구니) 헤더바 -->
        <div class="nav-bar"></div>

        <!-- TODO: 함수(메소드) 예제 : cart 추가 -->
        <div class="cart">장바구니 : {{ cart }}</div>

        <!-- TODO: 장바구니 본문 -->
        <div class="product-display">
            <div class="product-container">
                <!-- TODO: 왼쪽 이미지(양말) -->
                <div class="product-image">
                    <img :src="image" alt="양말">
                </div>

                <!-- TODO: 오른쪽 설명글 -->
                <div class="product-info">
                    <!-- TODO: 컴퓨티드 예제 : product + " " + brand -->
                    <h1>{{ title }}</h1>
                    <p v-if="inStock == true">In Stock</p>

                    <p v-else>Out Stock</p>

                    <ul v-for="(data, index) in details" :key="index">
                        <li>{{ data }}</li>
                    </ul>

                    <ul v-for="(data, index) in variants" :key="index">
                        <li>{{ data.color }}</li>
                    </ul>

                    <!-- TODO: class, style 예제 -->
                    <div v-for="(data, index) in variants" :key="index" @mouseover="updateImage(data.image)"
                        class="color-circle" :style="{ 'background-color': data.color }">
                        <!-- data.color : green, blue -->
                    </div>

                    <button class="button" @click="addCart">장바구니담기</button>
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
            // TODO: 컴퓨티드 예제 : 속성 추가 : brand
            brand: "Vue Mastery",
            cart: 0,
            product: "Socks",
            image: require('@/assets/images/socks_green.jpg'),
            inStock: true,
            details: ["50% cotton", "30% wool", "20% polyester"],
            variants: [{
                id: 2234,
                color: "green",
                image: require('@/assets/images/socks_green.jpg')
            }, {
                id: 2235,
                color: "blue",
                image: require('@/assets/images/socks_blue.jpg')
            }]
        }
    },
    methods: {
        // TODO: 1) 화면에 green 글자에 마우스가 올라가면
        //    객체속성 : varients.image = require('@/assets/images/socks_green.jpg')
        //    tmpImage(매개변수) = varients.image
        // TODO: 2) 화면에 blue 글자에 마우스가 올라가면
        //    객체속성 : varients.image = require('@/assets/images/socks_blue.jpg')
        //    tmpImage(매개변수) = varients.image
        updateImage(tmpImage) {
            this.image = tmpImage;
        },
        // TODO: 버튼 클릭시 실행
        addCart() {
            // 변수값 = 0;
            // 변수값 = 변수값 + 1; 
            // => 버튼클릭하면 변수값 + 1 해서 다시 변수값에 저장
            this.cart = this.cart + 1; // 1씩 증가
        }
    },
    // TODO: 컴퓨티드 함수 정의
    computed: {
        // title() : this.product + " " + this.brand
        title() {
            return this.product + " " + this.brand;
        }
    }

}
</script>
<style></style>