// K_PropsView.vue : 부모컴포넌트
// vueInit
<template>
    <div>
        예제 
        ㄹㅇㄴㅁㄹㄴㅇ
        <!-- TODO: Props : 자식컴포넌트로 데이터 전달하기 -->
        <!-- TODO: 사용법 : <자식컴포넌트 :자식바인딩속성="부모바인딩속성" /> -->
        <K_TodoItemVue :list="list" />
        <!-- <K_TodoItemVue ></K_TodoItemVue> -->

        ㄹㅇㄴㅁㄹㅇㄴ
    </div>
</template>
<script>
// TODO: 자식컴포넌트 import
import K_TodoItemVue from '../components/K_TodoItem.vue'

export default {
    data() {
        return {
            list: "삽겹살"
        }
    },

    // TODO: 사용할 자식컴포넌트 정의
    components: {
        K_TodoItemVue
    }
}
</script>
<style lang="">
    
</style>