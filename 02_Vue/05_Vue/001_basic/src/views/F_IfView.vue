// F_IfView.vue
// vueInit
<template>
    <div>
        <h3>if문 예제</h3>
        <!-- TODO: 조건문 특징 : 참(true) 이면 태그가 화면에 보임 -->
        <!-- TODO: 조건문 특징 : 거짓(false) 이면 태그가 화면에 안보임 -->
        <!-- TODO: 사용법 : <태그 v-if="조건식" />
                            <태그2 v-else-if="조건식2" />
                            <태그3 v-else />
                    => 조건식이 참이면 태그가 보이고, 조건식2가 참이면 태그2가 보이고,
                    모두 거짓이면 태그3이 보임
         -->
        <p v-if="first === true" class="first-p">1st p 태그가 보입니다.</p>
        <p v-else-if="second === true" class="second-p">2nd p 태그가 보입니다.</p>
        <p v-else class="third-p">3rd p 태그가 보입니다.</p>
    </div>
</template>
<script>
export default {
    data() {
        return {
            first : false,
            second : true
        }
    },
}
</script>
<style>
    /* css 코딩 */
    .first-p {
        background-color: lightgreen;
    }
    .second-p {
        background-color: lightpink;
    }
    .third-p {
        background-color: lightskyblue;
    }
</style>