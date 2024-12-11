<script setup>
import {onMounted, reactive} from "vue";
import request from "@/net/index.js";
import Swal from "sweetalert2";
import {setToken} from "@/utils/token.js";
import router from "@/router/index.js";
import {useAccount} from "@/stores/user.js";

const account = useAccount()

const verify = reactive({
    img: '',
    uuid: ''
})

const form = reactive({
    username: '',
    password: '',
    code: ''
})

const visible = reactive({
    password: false,
})

function login() {
    request.post('/login',{
        username: form.username,
        password: form.password,
        code: form.code,
        uuid: verify.uuid
    }).then(({data})=> {
        if (data.code !== 200) {
            refreshImage()
            Swal.fire({
        title: "登录失败",
        text: "请检查您的账号或密码是否正确",
        icon: "error"
      })
        }else {
            Swal.fire({
                title: "恭喜你",
                text: "登录成功了!",
                icon: "success"
            }).then(() =>{
                setToken(data.token)
                request('/getInfo').then(({data}) => {
                    Object.assign(account.info = data.user)
                })
                router.push('/')
            })
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
            <div class="log-area">
              <h2>登录</h2>
              <div class="form-floating mb-3">
                <input type="email" class="form-control" id="floatingInput1"
                       v-model="form.username"
                       placeholder="Username Or Email address *">
                <label class="lable-text" for="floatingInput1">用户名
                  *</label>
              </div>
              <div class="form-floating relative mb-4">
                <input :type="visible.password ? 'text' : 'password'" class="form-control relative" id="floatingPassword2"
                       v-model="form.password"
                       placeholder="Password *">
                <label class="lable-text" for="floatingPassword2">密码 *</label>

                <div class="password-key" @click="visible.password = !visible.password">
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

              <div class="rem-forgot-btn">
                <div class="form-check">
                  <input class="form-check-input" type="checkbox" value="" id="rememberMe1" checked="">
                  <label class="form-check-label" for="rememberMe1">
                    记住我
                  </label>
                </div>
                  <div class="forgot-pass">
                  <a href="/register">还没有账号?立即注册</a>
                </div>
              </div>

              <button type="submit" class="auth-btn w-100 mt-5" @click="login">立即登录</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>
