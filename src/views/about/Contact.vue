<script setup>
import HeaderBreadcrumb from "@/components/HeaderBreadcrumb.vue";
import {reactive} from "vue";
import request from "@/net/index.js";

const advice = reactive({
  name: '',
  email: '',
  phone: '',
  message: ''
})

function createUserAdvice() {
  request.post('/system/advice/create', advice).then(({ data }) => {
    console.info(data)
  })
}
</script>

<template>
  <div>
    <header-breadcrumb :path="['关于我们', '联系我们']"/>
    <div class="contact-us-area page-2" style="padding-bottom: 80px">
      <div class="container">
        <div class="row">
          <div class="col-lg-6">
            <div class="contact-img">
              <img src="/img/bg-img/inner/contact.png" alt="">
            </div>
          </div>
          <div class="col-lg-6">
            <div class="conatct-content-area">
              <div class="section-title-area" style="margin-bottom: 0">
                <h6>联系我们</h6>
                <h3 class="mb-4 mt-3">欢迎填写您的意见并投递</h3>
                <form id="contact-form-mejor" novalidate="novalidate">
                  <div class="form-floating mb-5">
                    <input type="text" v-model="advice.name"
                           class="form-control" id="name" placeholder="Name">
                    <label class="lable-text" for="name">名字</label>
                  </div>
                  <div class="form-floating mb-5">
                    <input type="email"  v-model="advice.email"
                           class="form-control" id="email" placeholder="Email">
                    <label class="lable-text" for="email">电子邮件</label>
                  </div>
                  <div class="form-floating mb-5">
                    <input type="number" v-model="advice.phone"
                           class="form-control" id="phone" placeholder="Phone">
                    <label class="lable-text" for="phone">手机号</label>
                  </div>
                  <div class="form-floating mb-5">
                    <textarea class="form-control" v-model="advice.message"
                              placeholder="Message" id="message"></textarea>
                    <label class="lable-text" for="message">消息</label>
                  </div>
                </form>
                <button @click="createUserAdvice"
                        class="auth-btn w-100">投递意见</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="contact-map">
      <div class="container" style="padding-bottom: 80px">
        <div class="row">
          <div class="col-12">
            <div class="conatct-info-meta">
              <!-- Single Card -->
              <div class="contact-single-info-card">
                <div class="contact-icon">
                  <i class="icon-phone-alt-solid-11"></i>
                </div>
                <h4>Contact Phone Number</h4>
                <p>(603) 555-012 / (603) 555-012</p>
              </div>

              <!-- SIngle Card -->
              <div class="contact-single-info-card">
                <div class="contact-icon">
                  <i class="icon-mail"></i>
                </div>
                <h4>Our Email Address</h4>
                <p>michelle.rivera@example.com</p>
              </div>

              <!-- SIngle Card -->
              <div class="contact-single-info-card">
                <div class="contact-icon">
                  <i class="icon-Vec1tor"></i>
                </div>
                <h4>Our Location</h4>
                <p>1901 Thornridge Cir. Shiloh, Hawaii 81063</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <iframe src=""></iframe>
    </div>
  </div>
</template>

<style scoped>
.conatct-info-meta {
  position: static;

  .contact-single-info-card {
    position: static;
    border-radius: 10px;
  }
}
</style>