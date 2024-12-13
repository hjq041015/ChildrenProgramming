<script setup>

import HeaderBreadcrumb from "@/components/HeaderBreadcrumb.vue";
import {useAccount} from "@/stores/user.js";
import {computed} from "vue";
const account = useAccount()
const vips = [
  {
    id: 1,
    name: '普通会员',
    price: '35',
    limit: 1,
    disable:['vip1', 'vip2', "vip3"],
    colorClass: [],
    desc: ['少儿编程基础课程免费学习', '线下老师一对一指导', '免费使用少儿编程开发器件', '全天候在线咨询服务', '更多在线直播课程']
  }, {
    id: 2,
    name: '黄金会员',
    price: '100',
    limit: 1,
    disable:['vip2', "vip3"],
    colorClass: ['two'],
    desc: [
        '少儿编程全套课程免费学习', '线下老师一对一指导', '免费使用少儿编程开发器件', '全天候在线咨询服务', '更多在线直播课程',
        '每周一次家庭教育服务', '周一到周五放学托管服务'
    ]
  }, {
    id: 3,
    name: '铂金会员',
    price: '288',
    limit: 3,
    disable:["vip3"],
    colorClass: ['three'],
    desc: [
      '少儿编程全套课程免费学习', '线下老师一对一指导', '免费使用少儿编程开发器件', '全天候在线咨询服务', '更多在线直播课程',
      '每周三次家庭教育服务', '周一到周五放学托管服务', '周末独立兴趣班培训计划'
    ]
  }
]

const role = computed(() => {
  const r = account.info.roles
  if(!r?.length) return null
  else return account.info.roles[0]
})
</script>

<template>
  <div>
    <header-breadcrumb :path="['充值会员']"/>
    <div class="popular-cate-2-area pricing-page relative" style="padding-top: 80px">
      <div class="cate-2-shape wow fadeInRight" data-wow-delay="1200ms" style="visibility: visible; animation-delay: 1200ms; animation-name: fadeInRight;">
        <img src="/img/bg-img/home-2/shape-6.png" alt="">
      </div>
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-lg-4" v-for="vip in vips">
            <div class="cate-price-card wow fadeInUp" :class="vip.colorClass"
                 data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInUp;">
              <div class="cate-price-body">
                <h2>
                  {{ vip.name }} <br>
                  <span class="cate-price-title">￥{{ vip.price }} /</span>
                  <span class="month-desc">月</span>
                </h2>
                <h6>{{ vip.limit }} 个小朋友可用</h6>
                <ul>
                  <li v-for="item in vip.desc">{{ item }}</li>
                </ul>

                <div class="price-btn-area" v-if="!vip.disable.includes(role.roleKey)">
                  <a class="price-btn" :href="`/course/vip/order?id=${vip.id}`">
                    立即购买 <span class="icon-right-arrow-11"></span></a>
                </div>
                  <div class="price-btn-area" v-else>
                  <a class="price-btn" style="background-color: #0b0b0b;cursor: not-allowed">
                    您已成为此会员 <span class="icon-eye"></span></a>
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