<script setup>
import {onMounted} from "vue";
import {useBactToTop} from "@/utils/common.js";

onMounted(useBactToTop)
</script>

<template>
  <div id="scrollToTop" class="scrolltop-show">
    <i class="icon-right-arrow-11"></i>
  </div>
</template>

<style scoped>

</style>