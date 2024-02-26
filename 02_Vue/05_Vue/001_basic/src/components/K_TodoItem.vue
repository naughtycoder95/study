// K_TodoItem.vue : 자식컴포넌트
// 태그 : 부모태그 - 자식태그
// vueInit
<template>
    <div>
        111232143ㄹㅇㄴㅁㄹㅇㄴㅁ
        Props : {{ list }}
    </div>
</template>
<script>
export default {
    // TODO: 부모쪽에서 데이터 전송하면 props 속성에 저장됨
    // TODO: 사용법 : props: ['자식바인딩속성']
    // TODO: 화면 : {{ 자식바인딩속성 }}
    props: ['list'],
}
</script>
<style lang="">
    
</style>