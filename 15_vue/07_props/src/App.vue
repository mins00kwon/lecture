<template>
  <div>
    <header>
      <PropsParent/>
    </header>
    <main>
      <DrillingParent/>
    </main>
  </div>
</template>

<script setup>
  import PropsParent from './components/01_propsBasic/PropsParent.vue';
  import DrillingParent from './components/02_propsDrilling/DrillingParent.vue';
</script>

<style scoped>

</style>  