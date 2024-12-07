<script setup>
import {useRouter} from "vue-router";

defineProps({
  courseCount: Number,
})

const router = useRouter()
</script>

<template>
  <div class="breadcrumb-area relative">
    <div class="container h-100">
      <div class="row h-100 align-items-center">
        <div class="col-12">
          <div class="breadcrumb-conetnt">
            <ul class="bread-list">
              <li>首页</li>
              <li><i class="icon-down-arrow-11"></i></li>
              <li>课程</li>
              <li><i class="icon-down-arrow-11"></i></li>
              <li>所有课程列表</li>
            </ul>
            <h4>所有课程列表</h4>
            <p>欢迎选购我们为小朋友精心准备的编程课程，让小朋友在学习过程中发现更多精彩</p>
          </div>
        </div>
      </div>
    </div>
    <!-- Filter Search -->
    <div class="grid-filter-area relative">
      <div class="container">
        <div class="row">
          <div class="col-12">
            <!-- Filter -->
            <div class="grid-filter-search relative d-flex align-items-center justify-content-between">
              <div class="grid-filter-btn d-flex align-items-center">
                <div class="grid-filter-btn-list">
                  <button class="grid-btn boxButton toggle-btn" @click="router.push('/course/grid')">
                    <i class="icon-mingcute_grid-line"></i>&nbsp;
                    <span>表格查看</span></button>
                  <button class="list-btn" @click="router.push('/course/list')">
                    <i class="icon-cil_list"></i>&nbsp;
                    <span>列表查看</span>
                  </button>
                </div>
                <p class="mb-0">已上架 {{ courseCount }} 个编程课程，欢迎选购</p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>