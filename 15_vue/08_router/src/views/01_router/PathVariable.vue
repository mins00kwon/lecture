<template>
    <div>
        <h1>PathVariable</h1>
        <!-- <h2>넘어온 라우팅 정보={{ currentRoute }}</h2> -->
        <h2>넘어온 PathVariable 값(id) = {{ currentRoute.params.id }}</h2>
    </div>
</template>

<script setup>
    import { useRoute } from 'vue-router';  // 넘어온 라우팅 정보를 추출하기 위함

    const currentRoute=useRoute();



</script>

<style scoped>

</style>