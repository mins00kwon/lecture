vbase=3=<template>
    <div class="parentContainer">
        <Child>     
                        <!-- 태그 안의 내용이 Child의 Slot으로 넘어감 -->
            응애
            {{ slotData }}
                            <!-- script 영역의 데이터를 물려주는것도 가능하다 -->
        </Child>
    </div>
</template>

<!-- 
    다른 vue 파일을 import 할 때는 내가 원하는 이름으로 쓸 수 있다
    (feat. export default이기 때문) 
-->
<script setup>
    import Child from './SlotChild.vue';    // 이름을 바꿔도 됨
    import {ref} from 'vue';                

    const slotData=ref('hello data');       // slot은 일반적으로 태그 형태로 전달된다.
    //                                      (일반적으로 상태값, 데이터는 props를 주로 활용함)
</script>

<style scoped>
    .parentContainer{
        display: flex;
        align-items: center;
        flex-direction: column;
        border:1px solid black;
    }
</style>