<script setup>
import {useAccount} from "@/stores/user.js";
import {computed, ref} from "vue";
import {clearToken, getToken} from "@/utils/token.js";
import request from "@/net/index.js";
import router from "@/router/index.js";

const account = useAccount()
const isLogin = ref(!!getToken())

function logout() {
    request.post('/logout').then(({data}) => {
        if (data.code === 200) {
            router.push("/")
            clearToken()
            isLogin.value = !!getToken()
        }
    })
}

const avatar = computed(() => {
  if(account.info.avatar) {
    return `${request.defaults.baseURL}${account.info.avatar}`
  } else {
    return '/img/avatar/profile.jpg'
  }
})
</script>

<template>
  <div class="top-header">
    <div class="container h-100">
      <div class="row h-100 align-items-center">
        <div class="col-md-6 col-lg-7">
          <div class="contact-info d-flex align-items-center">
            <a href="mailto:info@doorsoft"><span class="icon-mail"></span> <span class="text-white contact-desc">alma.lawson@example.com</span></a>
            <a href=""><span class="icon-phone-alt-solid-11"></span> <span class="text-white contact-desc">123 - 456 - 7890</span></a>
          </div>
        </div>
        <div class="col-md-6 col-lg-5">
          <div class="d-flex align-items-center top-social-conatct">
            <!-- Dropdown -->
            <div class="top-social-icon">
              <ul class="header-icon">
                <li><span class="text-white">加入我们:</span></li>
                <li><a href="#"><span class="icon-facebook-f"></span></a></li>
                <li><a href="#"><span class="icon-linkedin-in"></span></a></li>
                <li><a href="#"><span class="icon-twitter"></span></a></li>
                <li><a href="#"><span class="icon-instagram"></span></a></li>
              </ul>
            </div>
            <div class="contact-info" v-if="isLogin"
                 style="display: flex;align-items: center;margin-left: 20px">
              <div style="color: white;text-align: right;font-size: 13px;line-height: 15px">
                <div>{{ account.info.nickName }}</div>
                <div style="color: gray">{{ account.info.email ?? '暂无电子邮件地址' }}</div>
              </div>
              <div class="user">
                <img :src="avatar" class="user-avatar">
                <div class="dropdown-box">
                  <div @click="router.push('/order-list')">
                    <i class="icon-database" style="margin-right: 10px"></i> 我的订单</div>
                  <div @click="logout">
                    <i class="icon-right-arrow-1" style="margin-right: 10px"></i> 退出登录</div>
                </div>
              </div>
            </div>
            <div class="contact-info" v-if="!isLogin">
              <a class="login-btn"  style="margin-left: 10px" href="/login">
                <span class="icon-user-notes"></span> 登录</a>
            </div>
            <div class="contact-info" v-if="!isLogin">
              <a class="login-btn" style="margin-left: 10px" href="/register">
                <span class="icon-user-plus-solid-1"></span> 注册</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
.user {
  position: relative;

  .user-avatar {
    height: 35px;
    width: 35px;
    margin-left: 10px;
    border-radius: 50%;
  }

  .dropdown-box {
    top: 40px;
    width: 210px;
    right: 0;
    transition: all 300ms ease-in-out;
    font-size: 15px;
    line-height: 29px;
    padding: 16px 24px;
    position: absolute;
    border-radius: 8px;
    opacity: 0;
    visibility: hidden;
    background-color: white;
    border: 1px solid #dee1e6;
    box-shadow: rgba(0, 0, 0, 0.1) 0px 2px 4px -1px, rgba(0, 0, 0, 0.06) 0px 2px 4px -1px;

    div:hover {
      color: #F8941F;
      cursor: pointer;
    }
  }

  &:hover {
    .dropdown-box {
      top: 35px;
      opacity: 1;
      visibility: visible;
    }
  }
}
</style>