<script setup>
import HeaderBreadcrumb from "@/components/HeaderBreadcrumb.vue";
import {onMounted, ref} from "vue";
import request from "@/net/index.js";

const orderList = ref([])

onMounted(() => {
  request.get('/system/order/my-list')
      .then(({ data }) => orderList.value = data.rows)
})
</script>

<template>
  <header-breadcrumb :path="['我的订单']"/>
  <div class="product-cart-area" style="padding: 100px 0">
    <div class="container">
      <div class="row" style="border-bottom: 1px solid gray;margin-bottom: 80px;padding-bottom: 30px"
           v-for="order in orderList">
        <div class="row" style="margin-bottom: 20px">
          <div class="col-6" style="display: flex;flex-direction: column;gap: 7px">
            <div>订单号: {{ order.id }}</div>
            <div>所在国家: {{ order.country }}</div>
            <div>所在城市: {{ order.city }}</div>
            <div>所在街道1: {{ order.steet1 }}</div>
            <div>所在街道2: {{ order.steet2 }}</div>
          </div>
          <div class="col-6" style="display: flex;flex-direction: column;gap: 7px">
            <div>收货人: {{ order.name }}</div>
            <div>下单时间: {{ order.time }}</div>
            <div>电子邮箱: {{ order.email }}</div>
            <div>邮政编码: {{ order.postal }}</div>
            <div>订单备注: {{ order.note }}</div>
          </div>
        </div>
        <div class="col-12">
          <div class="cart-table">
            <div class="table-responsive">
              <table class="table">
                <thead class="table-navy">
                <tr>
                  <th>商品名称</th>
                  <th>价格</th>
                  <th>数量</th>
                  <th>合计</th>
                </tr></thead>
                <tbody>
                <tr v-for="item in order.orderItemList">
                  <td>{{ item.title }}</td>
                  <td>￥{{ item.price }}</td>
                  <td>
                    <div class="qty-pro-area">
                      <form class="cart-form" style="margin: auto;width: fit-content">
                        <div class="order-plus-minus d-flex align-items-center">
                          <input class="form-control cart-quantity-input" type="text" name="quantity"
                                 :value="item.count">
                        </div>
                        <div class="fav-icon">
                          <i class="icon-icon_ribbon_alt"></i>
                        </div>
                      </form>
                    </div>
                  </td>
                  <td>￥{{ item.price * item.count }}</td>
                </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>