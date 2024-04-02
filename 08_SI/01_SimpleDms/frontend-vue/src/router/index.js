import { createRouter, createWebHistory } from 'vue-router'

// 메뉴(페이지) <-> url 연결작업 하는 곳 : 라우터
const routes = [
  // 부서
  {
    path: '/',
    alias: "/dept", // 추가 url1
    component: () => import('../views/basic/dept/DeptList.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
