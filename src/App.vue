<script setup>
import TopHeader from "@/components/TopHeader.vue";
import IndexHeader from "@/components/IndexHeader.vue";
import IndexFooter from "@/components/IndexFooter.vue";
import BackToTop from "@/components/BackToTop.vue";
</script>

<template>
  <div>
      <top-header/>
      <index-header/>
        <router-view/>
      <index-footer/>
      <BackToTop/>
  </div>
</template>

<style scoped>

</style>
