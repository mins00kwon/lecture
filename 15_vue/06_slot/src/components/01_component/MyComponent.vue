<template>
    <div>
        <h1 id="test">징쨔 하기 시룸</h1>
    </div>
</template>

<!-- script의 setup 키워드 덕에 setup() 함수 내부 코드만 작성해도 된다. -->
<script setup>
// setup 키워드를 사용하지 않으면
// export default+setup{} 조합을 사용해야 함
    import {onMounted} from 'vue';
    
    onMounted(()=>{
        console.log('MyComponent 부착!');
        let $idEle=document.getElementById('test');
        console.log($idEle);
    });
</script>

<style scoped>
    #test{
        color:blue;
    }
</style>