<script setup>
import TopHeader from "@/components/TopHeader.vue";
import IndexHeader from "@/components/IndexHeader.vue";
import IndexFooter from "@/components/IndexFooter.vue";
import BackToTop from "@/components/BackToTop.vue";
import {useRoute} from "vue-router";
import {computed, onMounted} from "vue";
import {useAccount} from "@/stores/user.js";
import request from "@/net/index.js";

const route = useRoute()
const isAuthPage = computed(() => route.name === 'login' || route.name === 'register')
const account = useAccount()

onMounted(() => {
    request.get('/getInfo').then(({data}) => {
        Object.assign(account.info = data.user)
    })
    request.get('/system/item/count').then(({data}) => {
        account.cart.count = data.data
    })
})
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
