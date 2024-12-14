<script setup>
import {ref} from "vue";
import {createRandomInt} from "@/utils/data.js";
import CourseBreadcrumb from "@/components/Course/CourseBreadCrumb.vue";
import request from "@/net/index.js";
import Swal from "sweetalert2";
import {useAccount} from "@/stores/user.js";
import {getToken} from "@/utils/token.js";
import router from "@/router/index.js";

const account = useAccount()
const data = ref([])

request.get('/system/course/list')
    .then((res) => data.value = res.data.rows)

function addCourseToCart(id) {
    if (!getToken()) {
    router.push('/login')
    return
  }
  request.post(`/system/item/add/${id}`).then(() => {
    account.cart.count++
    Swal.fire({ title: "添加商品", text: "课程已经添加到购物车中，请继续选购", icon: "success" })

  })
}
</script>

<template>
  <div>
    <course-breadcrumb :course-count="data.length"/>
    <div class="featured-course-4-area single-page">
      <div class="container">
        <div class="row">
          <div class="col-12" v-for="course in data">
            <div class="course-card-4-area course-list d-flex ">
              <div class="course-img-4 single">
                <div class="cr-img relative">
                  <img :src="`/img/course/list/list-${course.id}.png`" alt="">
                </div>
              </div>
              <div class="course-content-info-4 single">
                <div class="course-content-rating d-flex justify-content-between align-items-center">
                  <p><i class="icon-star1"></i> 4.5 <span>(100 次购买)</span></p>
                  <div class="ribbon-icon">
                    <i class="icon-icon_ribbon_alt"></i>
                  </div>
                </div>
                <h2><a :href="`/course/detail/${course.id}`">{{ course.title }}</a></h2>
                <!-- info -->
                <div class="course-info-meta-4 d-flex align-items-center">
                  <p><i class="icon-Home"></i> {{ createRandomInt() }} 名学生正在学习</p>
                  <p><i class="icon-book-solid-1"></i>共 {{ course.lessone }} 节课</p>
                </div>
                <p class="course-desc-4">{{ course.about }}</p>
                <div class="auth-info-4 d-flex align-items-center">
                  <img class="auth-img" :src="`/img/course/avatar/c-${course.id}.png`" alt="">
                  <p>主讲老师 <a href="#">{{ course.teacher }}</a></p>
                </div>
                <!-- Price & Cart -->
                <div class="course-footer-4 d-flex align-items-center justify-content-between">
                  <div class="course-price">
                    <p>￥{{ (course.price * 0.9).toFixed(0) }} <span>￥{{ course.price }}</span></p>
                  </div>
                  <div class="course-buy" style="cursor: pointer">
                    <p><a @click="addCourseToCart(course.id)">
                      <i class="icon-icon_cart_alt"></i>&nbsp;
                      <span>添加到购物车</span>
                    </a>
                    </p>
                  </div>
                </div>
              </div>
            </div>
          </div >

          <div class="col-12">
            <div class="load-btn-area text-center mt-20">
              <a class="load-btn" href="all-course.html"><i class="icon-icon_document_alt"></i> 加载更多课程</a>
            </div>
          </div>

        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>