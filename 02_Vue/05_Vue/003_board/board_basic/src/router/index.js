import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  // TODO: 부서
  {
    path: '/dept',
    component: () => import('../views/DeptList.vue')
  },
  // TODO: 고객
  {
    path: '/customer',
    component: () => import('../views/CustomerList.vue')
  },
  // TODO: 책방
  {
    path: '/books',
    component: () => import('../views/BooksList.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
