<template>
    <HeaderCom />

    <div class="container">
        <router-view/>
    </div>

</template>

<script>
import HeaderCom from "@/components/HeaderCom.vue";

export default {
    components : {
        HeaderCom
    }
}
</script>

<style>
</style>
