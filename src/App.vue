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
    <div class="smooth-body">
      <div class="smooth-content">
        <router-view/>
        <index-footer/>
      </div>
    </div>
    <back-to-top/>
  </div>
</template>

<style scoped>

</style>
