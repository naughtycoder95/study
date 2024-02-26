// EventExam.vue
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
                    <h1>{{ product }}</h1>
                    <p v-if="inStock == true">In Stock</p>
                    <!-- TODO: 조건문 추가 : v-else => Out Stock  -->
                    <p v-else>Out Stock</p>

                    <ul v-for="(data, index) in details" :key="index">
                        <li>{{ data }}</li>
                    </ul>

                    <ul v-for="(data, index) in variants" :key="index">
                        <li>{{ data.color }}</li>
                    </ul>

                    <div v-for="(data, index) in variants" :key="index" @mouseover="updateImage(data.image)">
                        {{ data.color }}
                    </div>

                    <button class="button" @click="addCart">장바구니담기</button>
                    <!-- TODO: 장바구니 개수를 1개씩 줄이기를 코딩하세요
                        (단, 음수가 되면 안되게 하세요 : 
                            1) this.cart > 0 일때만 1개씩 빼기
                        )
                        함수명 : deleteCart
                     -->
                    <button class="button" @click="deleteCart">장바구니빼기</button>
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
            cart: 0,       // TODO: addCart 함수와 관계
            product: "Socks",
            // TODO: 최초 화면 이미지 경로 : 녹색양말
            image: require('@/assets/images/socks_green.jpg'),
            inStock: true, // 조건문에서 사용
            details: ["50% cotton", "30% wool", "20% polyester"],
            // TODO: 함수(메소드) 예제 : 속성(image) 추가
            variants: [{
                id: 2234,
                color: "green",
                // TODO: 속성(image) 추가
                image: require('@/assets/images/socks_green.jpg')
            }, {
                id: 2235,
                color: "blue",
                // TODO: 속성(image) 추가
                image: require('@/assets/images/socks_blue.jpg')
            }]
        }
    },
    // TODO: 함수(메소드)
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
        },
        deleteCart() {
            //  TODO: 1) this.cart > 0 (양수) 일때만 1개씩 빼기
            if (this.cart > 0) {
                this.cart = this.cart - 1;
            }
        }
    },
}
</script>
<style></style>