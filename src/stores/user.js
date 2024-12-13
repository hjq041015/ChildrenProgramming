import {defineStore} from "pinia";
import {computed, ref} from "vue";
import request from "@/net/index.js";

export const useAccount = defineStore('account', () => {

    const info = ref({
        avatar: '',
        userName: '',
        nickName: '',
        email: '',
        roles: []
    })

    const cart = ref({
        count: 0
    })

    const avatar = computed(() => {
        if(info.value.avatar) {
            return `${request.defaults.baseURL}${info.value.avatar}`
        } else {
            return '/img/avatar/profile.jpg'
        }
    })

    return {
        info, cart, avatar
    }
})