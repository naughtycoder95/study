// J_ForObjectView.vue
// vueInit
<template>
    <div>
        <!-- TODO: 객체 배열을 만들어서 반복문으로 사용하기 -->
        <div v-for="(data, index) in images" :key="index">
            <a :href="data.url">{{ data.text }}</a>
            <img :src="data.src" alt="암스테르담">

            <!-- <a href="https://www.louvre.fr/en/homepage">파리</a>
            <img :src="require('@/assets/img/paris.jpg')" alt="파리"> -->
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
            images: [{
                text: "암스테르담",
                url: "http://www.raileurope.co.kr/place/amsterdam-centraal",
                src: require('@/assets/img/amsterdam.jpg')
            },{
                text: "파리",
                url: "https://www.louvre.fr/en/homepage",
                src: require('@/assets/img/paris.jpg')
            }]
        }
    },
}
</script>
<style>
    /* css 코딩 */
    img {
        width: 240px;
        height: 180px;
        padding: 3px;
    }
</style>