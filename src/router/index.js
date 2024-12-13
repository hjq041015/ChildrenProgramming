import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '',
      name: 'welcome',
      component: () => import('@/views/Welcome.vue'),
    }, {
      path: '/course',
      name: 'course',
      children: [
        {
          path: 'list',
          name: 'course-list',
          component: () => import('@/views/course/CourseList.vue')
        }, {
          path: 'grid',
          name: 'course-grid',
          component: () => import('@/views/course/CourseGrid.vue')
        }, {
          path: 'detail/:id',
          name: 'course-detail',
          component: () => import('@/views/course/CourseDetail.vue')
        },{
          path: 'vip',
          name: 'vip',
          component: () => import('@/views/Course/Vip.vue')
        },{
          path: 'vip/order',
          name: 'vipOrder',
          component: () => import('@/views/Course/VipOrder.vue')
        }
      ]
    }, {
      path: '/login',
      name: 'login',
      component: () => import('@/views/auth/Login.vue')
    }, {
      path: '/register',
      name: 'register',
      component: () => import('@/views/auth/Register.vue')
    },{
      path: '/cart',
      name: 'cart',
      component: () => import('@/views/Cart.vue')
    },{
      path: '/order',
      name: 'order',
      component: () => import('@/views/Order.vue')
    },{
      path: '/order-list',
      name: 'orderList',
      component: () => import('@/views/OrderList.vue')
    },{
      path: '/account',
      name: 'account',
      component: () => import('@/views/Account.vue')
    },{
      path: '/about',
      name: 'about',
      children: [
        {
          path: '',
          name: 'about-us',
          component: () => import('@/views/about/AboutUs.vue')
        }, {
          path: 'gallery',
          name: 'about-gallery',
          component: () => import('@/views/about/Gallery.vue')
        }, {
          path: 'teachers',
          name: 'about-teachers',
          component: () => import('@/views/about/Teachers.vue')
        }, {
          path: 'contact',
          name: 'about-contact',
          component: () => import('@/views/about/Contact.vue')
        }
      ]
    }
  ],
})

export default router
