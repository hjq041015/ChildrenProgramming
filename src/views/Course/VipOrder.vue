<script setup>
import HeaderBreadcrumb from "@/components/HeaderBreadcrumb.vue";
import {useRoute} from "vue-router";
import {onMounted, reactive, ref} from "vue";
import request from "@/net/index.js";
import Swal from "sweetalert2";
import router from "@/router/index.js";

const route = useRoute()
const id = route.query.id

const vipItem = ref()

const order = reactive({
  firstName: '',
  lastName: '',
  company: '',
  country: '',
  city: '',
  street1: '',
  street2: '',
  postal: '',
  phone: '',
  email: '',
  note: ''
})

function checkOrder() {
  if(!order.firstName || !order.lastName)
    return '请填写您的收货人名称'
  if(!order.country)
    return '请选择您的国家或地区'
  if(!order.street1)
    return '请至少填写一个街道名称'
  if(!order.city)
    return '请填写您所在城市'
  if(!order.postal)
    return '请填写邮政编码'
  if(!order.email)
    return '请填写电子邮件地址'
  return null
}

function createOrder() {
  const result = checkOrder()
  if(result != null) {
    Swal.fire({ title: "新增订单", text: result, icon: "warning" })
    return
  }
  request.post(`/system/order/create-vip?id=${id}`, {
    ...order,
    name: order.firstName + order.lastName
  }).then(({ data }) => {
    if(data.code === 200) {
      Swal.fire({ title: "新增订单", text: "您的会员已经下单成功，请去店内完成支付", icon: "success" })
          .then(() => router.push('/'))
    } else {
      Swal.fire({ title: "新增订单", text: `订单创建失败: ${data.msg}`, icon: "error" })
    }
  })
}

onMounted(() => {
  request.get('/system/vip/list').then(({data}) => {
    vipItem.value = data.rows.find(item => item.id === +id)
  })
})
</script>

<template>
  <div>
    <header-breadcrumb :path="['购买会员下单']"/>
    <div class="checkout-page-area">
      <div class="container">
        <div class="row">
          <div class="col-md-6">
            <div class="client-address-area">
              <div class="row">
                <div class="col-12">
                  <div class="checkout-heading">
                    <h4>订单详情</h4>
                  </div>
                </div>
                <div class="col-md-6 mb-4">
                  <label for="firstName" class="form-label">姓氏 *</label>
                  <input type="text" v-model="order.firstName"
                         class="form-control" id="firstName" placeholder="" value="" required="">
                </div>

                <div class="col-md-6 mb-4">
                  <label for="lastName" class="form-label">名字 *</label>
                  <input type="text" v-model="order.lastName"
                         class="form-control" id="lastName" placeholder="" value="" required="">
                </div>

                <div class="col-12 mb-4">
                  <label for="comName" class="form-label">公司名称 (可选)</label>
                  <input type="text" v-model="order.company" class="form-control" id="comName" placeholder="" value="" required="">
                </div>

                <div class="col-12 mb-4">
                  <label for="country" class="form-label">国家 / 地区 *</label>
                  <select class="form-select" v-model="order.country" id="country" required="">
                    <option value="">请选择国家或地区...</option>
                    <option value="中国">中国</option>
                    <option value="美国">美国</option>
                  </select>

                </div>

                <div class="col-12 mb-4">
                  <label for="address" class="form-label">街道名称 *</label>
                  <input type="text" v-model="order.street1"
                         class="form-control" id="address" placeholder="" required="">
                </div>

                <div class="col-12 mb-4">
                  <input type="text" v-model="order.street2"
                         class="form-control" id="address1" placeholder="" required="">
                </div>

                <div class="col-12 mb-4">
                  <label for="country2" class="form-label">所在城市/省份 *</label>
                  <select class="form-select" v-model="order.city" id="country2" required="">
                    <option value="">请选择省份或城市...</option>
                    <option value="四川省">四川省</option>
                    <option value="重庆市">重庆市</option>
                  </select>
                </div>

                <div class="col-md-6 mb-4">
                  <label for="zip" class="form-label">邮政编码 *</label>
                  <input type="text" v-model="order.postal"
                         class="form-control" id="zip" placeholder="" required="">

                </div>
                <div class="col-md-6 mb-4">
                  <label for="phone" class="form-label">手机号</label>
                  <input type="number" v-model="order.phone"
                         class="form-control" id="phone" placeholder="" required="">
                </div>

                <div class="col-12">
                  <label for="email" class="form-label">电子邮件地址 *</label>
                  <input type="email" v-model="order.email"
                         class="form-control" id="email" placeholder="">
                </div>
              </div>
            </div>
          </div>

          <div class="col-md-6">
            <div class="row">
              <div class="col-12">
                <div class="checkout-heading">
                  <h4>额外订单信息</h4>
                </div>
              </div>
              <div class="col-12 mb-5">
                <label for="lastName" class="form-label">订单备注 (可选)</label>
                <textarea class="form-control" placeholder="请输入您对此订单的一些额外需求..."
                          v-model="order.note"
                          id="message" name="message" cols="30" rows="10"></textarea>
              </div>
              <div class="col-12">
                <div class="checkout-order-area">
                  <h4>请确认你的订单</h4>

                  <ul class="order-list-check mb-5">
                    <li class="order-list-header"><span class="heading-title-pro">商品</span>
                      <span class="heading-title-pro">Subtotal</span></li>
                    <li class="order-list-info-pro">
                      <span class="product-list-single">
                        <img class="order-product" src="/img/bg-img/shape-2.png" alt="">
                        {{ vipItem?.titile }}
                    </span>
                      <span class="pro-price">￥{{ vipItem?.price }}</span>
                    </li>
                    <li class="order-price"><span>商品合计</span> <span class="pur-price">￥{{ vipItem?.price }}</span></li>
                    <li class="order-price"><span>付款金额</span> <span class="pur-price">￥{{ vipItem?.price }}</span></li>
                  </ul>
                  <h4 class="mb-3">付款方式</h4>

                  <div class="payment-gate-sys">
                    <div class="form-check mb-4">
                      <input id="credit" name="paymentMethod" type="radio" class="form-check-input" checked="" required="">
                      <label class="form-check-label" for="credit">信用卡</label>
                    </div>
                    <div class="form-check mb-4">
                      <input id="debit" name="paymentMethod" type="radio" class="form-check-input" required="">
                      <label class="form-check-label" for="debit">储蓄卡</label>
                    </div>
                    <div class="form-check mb-4">
                      <input id="paypal" name="paymentMethod" type="radio" class="form-check-input" required="">
                      <label class="form-check-label" for="paypal">支付宝</label>
                    </div>
                  </div>
                  <div class="pay-policy-des">
                    <p> 您的个人数据将用于处理您的订单，支持您在本网站的体验，以及用于我们隐私政策中描述的其他目的</p>
                  </div>
                  <div class="post-btn-area">
                    <button type="submit" @click="createOrder" class="auth-btn post">确认订单</button>
                  </div>
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