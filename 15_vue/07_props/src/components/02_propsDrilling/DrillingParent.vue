<template>
    <div>
        <h1>Parent:{{ count }}</h1>
        <DrillingChild/>
    </div>
</template>
<!-- 
    Props Drilling:
    상위 컴포넌트에서 하위 컴포넌트로 데이터를 전달하는 과정에서
    중간에 너무 많은 컴포넌트를 거쳐가는 경우가 생길 수 있다

    이렇게 여러 컴포넌트를 거쳐 props를 전달하다 보면
    코드를 복잡하게 만들고 유지보수가 힘들어진다

    vue에서는 필요한 부모 컴포넌트를 원하는 하위 컴포넌트에 필요시 inject하여
    어디서든 쓸 수 있게 하는 방법을 제공한다

    다만 readonly를 사용하지 않으면 props의 특성이 무시되므로
    컴포너트를 생성하는 부모 vue에서 readonly를 사용하는 방향을 고려하자

    장점:
    1. props drilling을 피해 유지보수가 쉬워질 수 있다

    단점:
    1. 어떤 자식 컴포넌트가 inject 했는지 알기 어렵다
    2. readonly를 고려해야 한다
    3. 중간에 여러 컴포넌트가 있으면 구조를 더 복잡하게 할 수 있다

-->
<script setup>
    import DrillingChild from './DrillingChild.vue';
    import {ref, provide, readonly} from 'vue';
    const count=ref(1);

    provide('count',readonly(count));
    // provide는 props와 달리 자식에서 값을 바꾸면 부모의 값이 변경됨
    // readonly를 씌우면 props의 특징을 지킬 수 있음
</script>

<style scoped>

</style>