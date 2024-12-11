<script setup>
import {onMounted} from "vue";
import {useHeaderSticky} from "@/utils/common.js";
import {useAccount} from "@/stores/user.js";

const routes = [
  { name: '首页', route: "/" },
  { name: '课程列表', children: [
      { name: '购买课程', route: '/course/list' },
      { name: '充值会员', route: '' }
    ]
  },
  { name: '关于我们', children: [
      { name: '公司介绍', route: '' },
      { name: '画廊', route: '' },
      { name: '师资团队', route: '' },
      { name: '联系我们', route: '' }
    ]
  },
  { name: '最新活动', route: "/event" },
  { name: '编程博客', route: "/blog" }
]

const account = useAccount()

onMounted(useHeaderSticky)
</script>

<template>
  <header class="header-area home-2 bg--navy" id="header">
    <nav class="navbar navbar-expand-lg">
      <div class="container menu-area-">
        <!-- Navbar Brand -->
        <div class="mobile-menu">
          <a class="navbar-brand" href="index.html">
            <img src="/img/core-img/logo-2.png" alt="Brand">
          </a>
        </div>

        <!-- Navbar Toggler -->
        <button class="navbar-toggler" id="navbarToggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="icon-menu"></span>
        </button>

        <!-- Navbar -->
        <div class="collapse navbar-collapse" id="navbarContent">
          <ul class="navbar-nav navbar-nav-scroll mb-3 mb-lg-0" id="SupportHiveNav">
            <li class="dropdown-list" :class="{ 'with-sub': item.children }" v-for="item in routes">
              <a :href="item.children ? '#' : item.route">{{ item.name }}</a>
              <div class="dropdown-toggler" v-if="item.children">
                <i class="icon-down-arrow-1"></i>
              </div>
              <ul v-if="item.children">
                <li v-for="sub in item.children">
                  <a :href="sub.route">{{ sub.name }}</a>
                </li>
              </ul>
            </li>
          </ul>

          <div class="cart-search-area ml-auto d-flex align-items-center">
            <div class="search-home-2">
              <div class="header-action">
                <div class="search-toggle-open header-search">
                  <div class="search-icon">
                    <span class="icon-icon_search2"></span>
                  </div>
                </div>
              </div>
            </div>
            <div class="cart-btn-area relative">
              <a href="/cart" class="relative"><span class="icon-icon_cart_alt"></span></a>
              <div class="cart-badge bg--dark">{{account.cart.count}}</div>
            </div>
          </div>
        </div>
      </div>
    </nav>
  </header>
</template>

<style scoped>

</style>