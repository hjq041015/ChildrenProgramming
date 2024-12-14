<script setup>
import HeaderBreadcrumb from "@/components/HeaderBreadcrumb.vue";
import {onMounted, ref} from "vue";
import request from "@/net/index.js";
import {createRandomInt} from "@/utils/data.js";

const blogList = ref([])

const count = createRandomInt()

const month = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]

onMounted(() => {
  request.get('/system/blog/list').then(({ data }) => blogList.value = data.rows)
})
</script>

<template>
  <div>
    <header-breadcrumb :path="['博客列表']"/>
    <div class="blog-area single-page-blog">
      <div class="container">
        <div class="row">
          <!-- Single Card -->
          <div class="col-md-6 col-xl-4" v-for="blog in blogList">
            <div class="single-blog-artical relative">
              <div class="single-blog-card relative">
                <div class="deft-blog-content-info relative">
                  <!-- img -->
                  <div class="blog-img relative">
                    <img class="relative" :src="`/img/bg-img/b-${blog.id}.png`" alt="">
                  </div>

                  <!-- Content -->
                  <div class="blog-content-text text-center" style="width: 100%">
                    <!-- badge -->
                    <div class="date-badge">
                      <div class="wow fadeInLeft" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInLeft;">
                        <h5>{{ new Date(blog.time).getDate() }}</h5>
                        <p>{{ month[new Date(blog.time).getMonth()] }}</p>
                      </div>
                    </div>
                    <div class="blog-header d-flex justify-content-center">
                      <p><span class="icon-user-2"></span> {{ blog.author }}</p>
                      <p><span class="icon-chat-bubble"></span> {{ count }} 人正在阅读</p>
                    </div>
                    <h3><a :href="`/blog/detail/${blog.id}`">{{ blog.title }}</a></h3>
                  </div>
                </div>
                <!-- Hover Content -->
                <div class="hover-blog-content-img text-center">
                  <div class="b-shape-img">
                    <div class="date-badge">
                      <div>
                        <h5>{{ new Date(blog.time).getDate() }}</h5>
                        <p>{{ month[new Date(blog.time).getMonth()] }}</p>
                      </div>
                    </div>
                  </div>
                  <div class="hover-blog-content">
                    <div class="blog-header d-flex justify-content-center">
                      <p><span class="icon-user-2"></span> {{ blog.author }}</p>
                      <p><span class="icon-chat-bubble"></span> {{ count }} 人正在阅读</p>
                    </div>
                    <h3><a :href="`/blog/detail/${blog.id}`">{{ blog.title }}</a></h3>
                    <p>{{ blog.description }}</p>
                  </div>
                </div>

              </div>
              <!-- Btn -->
              <div class="blog-btn-area">
                <a class="blog-btn" :href="`/blog/detail/${blog.id}`"><span class="icon-right-arrow"></span></a>
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