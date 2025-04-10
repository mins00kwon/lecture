<!-- vue official / Vue vscode snippet 플러그인 설치 -->
<!-- vbase-3-setup 으로 틀을 잡고 scss 관련 부분 삭제 -->
<!-- 
  template
  vue는 사용자의 화면에 보여질 부분을 template 영역의 html 요소들로 작성한다.
  template 태그는 DOM Tree로 구성되지 않고 렌더링 될 때 해석되지 않는다.
-->
<template>
  <header>
    <div>
      <h1 class="redColor">응애 프론트 싫어잉</h1>
      <MyComponent/>
    </div>
  </header>
  <main>
    <SlotParent/>
    <NamedParent/>
    <DynamicParent/>
  </main>
  
</template>

<!-- 
  script setup
  해당 컴포넌트에 적용할 setup 안에 작성했던 내용(반응현 변수/반응현 변수를 활용하는 함수/라이프사이클 훅)
  을 작성하는 영역
-->
<script setup>
  import MyComponent from '@/components/01_component/MyComponent.vue';
  import SlotParent from './components/02_slotintro/SlotParent.vue';
  import NamedParent from './components/03_namedslot/NamedParent.vue';
  import DynamicParent from './components/04_dynamicslot/DynamicParent.vue';
</script>


<!-- 
  style scoped
  현재 컴포넌트에서만 적용되는 스타일을 작성한다.(범위 css)
  (해당 컴포넌트가 또 다른 컴포넌트를 품고 있으면 하위 컴포넌트에도 적용되는 css)
-->
<style scoped>
  .redColor{
    color:blue;
  }
</style>