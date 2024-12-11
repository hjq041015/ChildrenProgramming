<script setup>
import {useAccount} from "@/stores/user.js";
import {computed} from "vue";
import {getToken} from "@/utils/token.js";
import request from "@/net/index.js";

const account = useAccount()
const isLogin = computed(() => !!getToken())
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
                <div>{{ account.info.userName }}</div>
                <div>{{ account.info.email }}</div>
              </div>
              <img :src="`${request.defaults.baseURL}${account.info.avatar}`"
                   class="user-avatar">
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
.user-avatar {
  height: 35px;
  width: 35px;
  margin-left: 10px;
  border-radius: 50%;
}
</style>