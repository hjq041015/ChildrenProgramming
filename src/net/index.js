import axios from "axios";
import {clearToken, getToken} from "@/utils/token.js";
import Swal from "sweetalert2";
import router from "@/router/index.js";

axios.defaults.headers['Content-Type'] = 'application/json;charset=utf-8'
const request = axios.create({
    // axios中请求配置有baseURL选项，表示请求URL公共部分
    baseURL: import.meta.env.VITE_APP_BASE_API,
    // 超时
    timeout: 10000
})


request.interceptors.request.use(config =>{
    const token = getToken()
    if(token) {
        config.headers['Authorization'] = 'Bearer ' + token
    }

    return config
})

request.interceptors.response.use(res =>{
    const code = res.data.code

    if (code === 401) {
        clearToken()
        Swal.fire({
            title: "登录已过期",
            text: "您的登录已过期，请重新登录",
            icon: "warning"
        }).then(r => {
            router.push('/login')
        })
        return Promise.reject('无效的会话，或者会话已过期，请重新登录。')
    }
    return res
})

export default request