<script setup>
import {useRoute} from "vue-router";
import {onMounted, ref} from "vue";
import request from "@/net/index.js";
import HeaderBreadcrumb from "@/components/HeaderBreadcrumb.vue";
import {createRandomInt} from "@/utils/data.js";

const route = useRoute()
const id = route.params.id

const eventList = ref([])

const blog = ref({
  id: 0,
  title: '',
  detail: ''
})

const teacher = ref({
  name: '',
  post: ""
})

request.get(`/system/event/list?pageNum=1&pageSize=5`)
    .then(({ data }) => eventList.value = data.rows)

onMounted(() => {
  request.get(`/system/blog/${id}`).then(({ data }) => {
    Object.assign(blog.value, data.data)
    blog.value.detail = data.data.blogDetailList[0]
    request.get(`/system/teacher/${blog.value.detail.teacherId}`).then(({ data }) => {
      Object.assign(teacher.value, data.data)
    })
  })
})
</script>

<template>
  <div>
    <header-breadcrumb :path="[blog.title]"/>
    <div class="course-details-area">
      <div class="container">
        <div class="row">
          <div class="col-lg-8">
            <div class="course-details-content-area">
              <div class="course-bg-img mt-0">
                <img src="/img/bg-img/inner/course.png" alt="">
                <h3 style="margin-top: 40px">{{ blog.title }}</h3>
              </div>

              <div class="blog-details-header d-flex align-items-center">
                <p><i class="icon-user-2"></i> {{ blog.author }}</p>
                <p><i class="icon-chat-bubble"></i> {{ createRandomInt() }} 人正在阅读</p>
                <p><i class="icon-clock-solid-1"></i> {{ new Date(blog.time).toLocaleString() }}</p>
              </div>

              <div class="blog-details-card-area">
                <p v-text="blog.detail.content"></p>
                <div class="feedback-card-area">
                  <div class="feedback-card-img-content">
                    <div class="feedback-img">
                      <img :src="`/img/bg-img/t-${teacher.id}.jpg`" alt="">
                    </div>
                    <div class="feedback-content-text">
                      <div class="feedback-header">
                        <h4>{{ teacher.name }}</h4>
                        <p>{{ teacher.post }}</p>
                      </div>
                      <p>{{ blog.detail.teacherComment }}</p>

                      <ul class="feedback-share-icon">
                        <li><a :href="teacher.contact1"><span class="icon-facebook-f"></span></a>
                        </li>
                        <li><a :href="teacher.contact2"><span class="icon-linkedin-in"></span></a>
                        </li>
                        <li><a :href="teacher.contact3"><span class="icon-twitter"></span></a></li>
                      </ul>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-4">
            <div class="sidebar-content-single-area">
              <!-- News Card -->
              <div class="cate-single-card">
                <div class="cate-content-card">
                  <h3>Latest News </h3>
                  <!-- Single news -->
                  <div class="news-cate-area d-flex align-items-center"
                       v-for="event in eventList">
                    <div class="news-img">
                      <img :src="`/img/bg-img/home-3/g-${event.id}.png`" alt="">
                    </div>
                    <div class="news-content-text">
                      <h6><a href="#">{{ event.title }}</a></h6>
                      <p><i class="icon-clock-solid-1"></i> {{ event.startTime }}</p>
                    </div>
                  </div>
                </div>
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