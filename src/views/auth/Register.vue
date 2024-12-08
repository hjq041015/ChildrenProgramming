<script setup>
import {onMounted, reactive} from "vue";
import request from "@/net/index.js";
import Swal from "sweetalert2";
import router from "@/router/index.js";

const verify = reactive({
    img: '',
    uuid: ''
})

const visible = reactive({
    password: false,
    confirm: false
})

const form = reactive({
    username: '',
    password: '',
    confirm: '',
    code: ''
})

function register() {
    if (form.password === '' || form.username === '') {
    Swal.fire({ title: "注册失败", text: "请填写您的用户和密码", icon: "warning" })
    return
  }
  if (form.password !== form.confirm) {
    Swal.fire({ title: "注册失败", text: "两次输入的密码不一致", icon: "warning" })
    return
  }
  request.post('/register', {
      code: form.code,
      password: form.password,
      confirmPassword: form.confirm,
      username: form.username,
      uuid: verify.uuid
  }).then(({data}) => {
      if (data.code === 200) {
      Swal.fire({ title: "注册成功" , icon: "success",
        text: `恭喜您的账户 ${form.username} 注册成功，即将为您跳转到登录也进行登录` }).then(() => {
          router.push('/login')
      })
    } else {
      refreshImage()
      Swal.fire({ title: "注册失败", text: data.msg, icon: "error" })
    }
  })
}



function refreshImage() {
    request.get('/captchaImage').then(({data}) => {
        verify.img = data.img
        verify.uuid = data.uuid
    })
}

onMounted(refreshImage)
</script>


<template>
  <div>
    <div class="log-regi-area" style="height: 100vh;padding: 0">
      <div class="container" style="height: 100%;display: flex;align-items: center;justify-content: center">
        <div class="row">
          <div style="width: 500px">
            <div class="log-area" style="padding: 30px 60px;border-radius: 10px">
              <h2>注册</h2>
              <div class="form-floating mb-4">
                <input v-model="form.username"
                       type="text" class="form-control" id="floatingInput6" placeholder="Username *">
                <label class="lable-text" for="floatingInput6">用户名 *</label>
              </div>
              <div class="form-floating mb-4">
                <input :type="visible.password ? 'text' : 'password'"
                       v-model="form.password"
                       class="form-control" id="floatingInput3" placeholder="Email address *">
                <label class="lable-text" for="floatingInput3">密码 *</label>

                <div class="password-key" @click="visible.password = !visible.password">
                  <i class="icon-eye"></i>
                </div>
              </div>
              <div class="form-floating relative mb-4">
                <input :type="visible.confirm ? 'text' : 'password'"
                       v-model="form.confirm"
                       class="form-control relative" id="floatingPassword4" placeholder="Password *">
                <label class="lable-text" for="floatingPassword4">确认密码 *</label>

                <div class="password-key" @click="visible.confirm = !visible.confirm">
                  <i class="icon-eye"></i>
                </div>
              </div>

              <div class="row">
                <div class="form-floating mb-5 col-8">
                  <input type="email" class="form-control" id="floatingInput3"
                         v-model="form.code"
                         placeholder="Username Or Email address *">
                  <label class="lable-text" for="floatingInput1">验证码
                    *</label>
                </div>
                <div class="col-4">
                  <img data-v-d0e06bca="" :src="`data:image/gif;base64,${verify.img}`" class="login-code-img">
                </div>
              </div>

              <div class="mb-20 rem-forgot-btn">
                <div class="forgot-pass">
                  <a href="/login">已有账户？立即登录</a>
                </div>
              </div>

              <p class="auth-desc">
                本网站是xxx公司社交产品，注册即代表您同意我们的 <a href="#">隐私政策</a>
              </p>
              <button type="submit" @click="register" class="auth-btn w-100 mt-5">立即注册</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>