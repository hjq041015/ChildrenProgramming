<script setup>
import HeaderBreadcrumb from "@/components/HeaderBreadcrumb.vue";
import {computed, onMounted, ref, watchEffect} from "vue";
import request from "@/net/index.js";

const pageSize = 6

const eventList = ref([])

const page = ref(1)
const total = ref(0)

const pageCount = computed(() => {
  const c = Math.round(total.value / pageSize)
  return Math.max(c, 1)
})

watchEffect(() => {
  request.get(`/system/event/list?pageNum=${page.value}&pageSize=${pageSize}`)
      .then(({ data }) => {
        eventList.value = data.rows
        total.value = data.total
      })
})
</script>

<template>
  <div>
    <header-breadcrumb :path="['活动列表']"/>
    <div class="event-list-inner-page-area">
      <div class="container">
        <div class="row">
          <!-- Single Card -->
          <div class="col-md-6 col-lg-4" v-for="event in eventList" :key="event.id">
            <div class="event-card-single-inner">
              <div class="event-img-inner">
                <img :src="`/img/bg-img/home-3/g-${event.id}.png`" alt="">
              </div>
              <div class="add-time-info d-flex align-items-center">
                <p><i class="icon-Vec1tor"></i> {{ event.location }}</p>
              </div>
              <div class="add-time-info d-flex align-items-center" style="margin-top: 0">
                <p><i class="icon-clock-solid-1"></i> {{ event.startTime }} - {{ event.endTime }}</p>
              </div>
              <h3><a href="#" style="margin-bottom: 0">{{ event.title }}</a></h3>
            </div>
          </div>
          <div class="col-12 mt-5">
            <div class="pagination-area">
              <nav aria-label="Page navigation example">
                <ul class="pagination justify-content-center">
                  <li class="page-item" v-for="index in pageCount">
                    <a class="page-link" @click="page = index">{{ index }}</a>
                  </li>
                </ul>
              </nav>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>