<script setup>
import TopHeader from "@/components/TopHeader.vue";
import IndexHeader from "@/components/IndexHeader.vue";
import IndexFooter from "@/components/IndexFooter.vue";
import BackToTop from "@/components/BackToTop.vue";
import {useRoute} from "vue-router";
import {computed} from "vue";

const route = useRoute()

const isAuthPage = computed(() => route.name === 'login' || route.name === 'register')
</script>

<template>
  <div>
    <top-header v-if="!isAuthPage"/>
    <index-header v-if="!isAuthPage"/>
    <div class="smooth-body">
      <div class="smooth-content">
        <router-view/>
        <index-footer v-if="!isAuthPage"/>
      </div>
    </div>
    <back-to-top v-if="!isAuthPage"/>
  </div>
</template>

<style scoped>

</style>
