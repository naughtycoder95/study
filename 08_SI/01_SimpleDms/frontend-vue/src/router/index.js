import { createRouter, createWebHistory } from "vue-router";

// 메뉴(페이지) <-> url 연결작업 하는 곳 : 라우터
const routes = [
  // 부서
  {
    path: "/",
    alias: "/dept", // 추가 url1
    component: () => import("../views/basic/dept/DeptList.vue"),
  },
  // 추가 페이지
  {
    path: "/add-dept",
    component: () => import("../views/basic/dept/AddDept.vue"),
  },
  // 수정 페이지(상세조회 : dno(부서번호))
  {
    // TODO: 사용법 - path: "/dept/:변수명"
    path: "/dept/:dno",
    component: () => import("../views/basic/dept/DeptDetail.vue"),
  },
  // 사원
  {
    path: "/emp",
    component: () => import("../views/basic/emp/EmpList.vue"),
  },
  // 추가 페이지
  {
    path: "/add-emp",
    component: () => import("../views/basic/emp/AddEmp.vue"),
  },
  // 수정 페이지(상세조회 : eno(사원번호))
  {
    path: "/emp/:eno",
    component: () => import("../views/basic/emp/EmpDetail.vue"),
  },
  // FileDb
  {
    path: "/fileDb",
    component: () => import("../views/advanced/fileDb/FileDbList.vue"),
  },
  // /add-fileDb
  {
    path: "/add-fileDb",
    component: () => import("../views/advanced/fileDb/AddFileDb.vue"),
  },
  // 상세조회(수정)
  {
    path: "/fileDb/:uuid",
    component: () => import("../views/advanced/fileDb/FileDbDetail.vue"),
  },
  // gallery
  {
    path: "/gallery",
    component: () => import("../views/advanced/gallery/GalleryList.vue"),
  },
  // /add-gallery
  {
    path: "/add-gallery",
    component: () => import("../views/advanced/gallery/AddGallery.vue"),
  },
  // 상세조회(수정)
  {
    path: "/gallery/:uuid",
    component: () => import("../views/advanced/gallery/GalleryDetail.vue"),
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;