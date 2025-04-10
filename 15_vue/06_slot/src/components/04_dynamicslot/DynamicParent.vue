<template>
    <div class="parentContainer">
        <h1>DynamicSlot:</h1>
        <input type="text" v-model="dynamicName">
        <DynamicChild>
            <!-- #은 v-slot 을 대체한다는 것을 기억하자. -->
            <template #[dynamicName]>
                {{ dynamicName }}
            </template>
        </DynamicChild>
    </div>
</template>

<script setup>
    import DynamicChild from './DynamicChild.vue';
    import {ref} from 'vue';

    const dynamicName=ref('');
</script>

<style scoped>
/* 자식 vue에도 적용됨 */
    .parentContainer{
            display: flex;
            align-items: center;
            flex-direction: column;
            border:1px solid black;
        }
</style>