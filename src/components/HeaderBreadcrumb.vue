<script setup>
defineProps({
  path: Array
})
</script>

<template>
  <div class="breadcrumb-area-2 bg-overlay-3 relative bg-img"
       style="background-image: url(/img/bg-img/home-3/bg.png);margin-top: 40px">
    <div class="container h-100">
      <div class="row h-100 align-items-center">
        <div class="col-12">
          <div class="breadcrumb-conetnt">
            <ul class="bread-list">
              <li><a href="/">首页</a></li>
              <template v-for="item in path">
                <li><i class="icon-down-arrow-11"></i></li>
                <li>{{ item }}</li>
              </template>
            </ul>
            <h4 class="mb-0">{{ path[path.length - 1] }}</h4>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>