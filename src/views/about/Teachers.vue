<script setup>

import HeaderBreadcrumb from "@/components/HeaderBreadcrumb.vue";
import {onMounted, ref} from "vue";
import request from "@/net/index.js";

const teacherList = ref([])

onMounted(() => {
  request.get('/system/teacher/list').then(({ data }) => teacherList.value = data.rows)
})
</script>

<template>
  <div>
    <header-breadcrumb :path="['关于我们', '教师团队']"/>
    <div class="team-area single-page-team">
      <div class="container">
        <div class="row">
          <!-- Single member -->
          <div class="col-sm-6 col-lg-3" v-for="teacher in teacherList" :key="teacher.id">
            <div class="team-block">
              <div class="single-team-card relative wow fadeInUp" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInUp;">
                <!-- Border shape -->
                <div class="border-s-1"></div>
                <div class="border-s-2"></div>
                <div class="border-s-3"></div>
                <div class="border-s-4"></div>
                <div class="border-s-5"></div>
                <!-- img -->
                <div class="team-img relative">
                  <img class="relative" :src="`/img/bg-img/t-${teacher.id}.jpg`" alt="">

                  <!-- content text -->
                  <div class="member-info text-center">
                    <h3>{{ teacher.name }}</h3>
                    <p>{{ teacher.post }}</p>
                  </div>

                  <div class="contact-social-icon">
                    <div class="share-icon-area">
                      <div class="share-icon"> <span class="icon-share-alt-solid-1 share--icon"></span>
                        <div class="conatct-icon-">
                          <ul>
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
            </div>

          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>