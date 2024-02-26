import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";

// TODO: 규칙 정의하는 부분
const routes = [
  // TODO: 1) url -> HomeView.vue 페이지와 연결하는 부분
  {
    path: "/", // url : 예) www.naver.com/
    name: "home",
    component: HomeView,
  },
  // TODO: 2) url -> AboutView.vue 페이지와 연결하는 부분
  // TODO: 성능이 좋음
  {
    path: "/about", // url : 예) www.naver.com/about
    name: "about",
    component: () => import("../views/AboutView.vue"),
  },
  // TODO: 3) url -> C_BindingView.vue 페이지와 연결하는 부분
  {
    path: "/binding", // url : 예) www.naver.com/binding
    component: () => import("../views/C_BindingView.vue"),
  },
  // TODO: 4) url -> C_BindingExam.vue 페이지와 연결하는 부분
  {
    path: "/binding-exam", // url : 예) www.naver.com/binding-exam
    component: () => import("../views/C_BindingExam.vue"),
  },
  // TODO: 5) url -> D_AttributeView.vue 페이지와 연결하는 부분
  {
    path: "/attribute", // url : 예) www.naver.com/attribute
    component: () => import("../views/D_AttributeView.vue"),
  },
  // TODO: 6) url -> D_AttributeExam.vue 페이지와 연결하는 부분
  {
    path: "/attribute-exam", // url : 예) www.naver.com/attribute-exam
    component: () => import("../views/D_AttributeExam.vue"),
  },
  // TODO: 7) url -> E_FormView.vue 페이지와 연결하는 부분
  {
    path: "/form", // url : 예) www.naver.com/form
    component: () => import("../views/E_FormView.vue"),
  },
  // TODO: 8) url -> E_FormExam.vue 페이지와 연결하는 부분
  {
    path: "/form-exam", // url : 예) www.naver.com/form-exam
    component: () => import("../views/E_FormExam.vue"),
  },
  // TODO: 9) url -> F_IfView.vue 페이지와 연결하는 부분
  {
    path: "/if", // url : 예) www.naver.com/if
    component: () => import("../views/F_IfView.vue"),
  },
  // TODO: 10) url -> F_IfExam.vue 페이지와 연결하는 부분
  {
    path: "/if-exam", // url : 예) www.naver.com/if-exam
    component: () => import("../views/F_IfExam.vue"),
  },
  // TODO: 11) url -> G_forView.vue 페이지와 연결하는 부분
  {
    path: "/for", // url : 예) www.naver.com/for
    component: () => import("../views/G_forView.vue"),
  },
  // TODO: 12) url -> G_forExam.vue 페이지와 연결하는 부분
  {
    path: "/for-exam", // url : 예) www.naver.com/for-exam
    component: () => import("../views/G_forExam.vue"),
  },
  // TODO: 13) url -> H_MethodView.vue 페이지와 연결하는 부분
  {
    path: "/method", // url : 예) www.naver.com/method
    component: () => import("../views/H_MethodView.vue"),
  },
  // TODO: 14) url -> H_MethodExam.vue 페이지와 연결하는 부분
  {
    path: "/method-exam", // url : 예) www.naver.com/method-exam
    component: () => import("../views/H_MethodExam.vue"),
  },
  // TODO: 15) url -> I_ComputedView.vue 페이지와 연결하는 부분
  {
    path: "/computed",
    component: () => import("../views/I_ComputedView.vue"),
  },
  // TODO: 단축키 : 자동정렬 : ctrl + alt + l
  // TODO: 15) url -> I_ComputedExam.vue 페이지와 연결하는 부분
  {
    path: "/computed-exam",
    component: () => import("../views/I_ComputedExam.vue"),
  },
  // TODO: 16) url -> J_ForObjectView.vue 페이지와 연결하는 부분
  {
    path: "/for-object",
    component: () => import("../views/J_ForObjectView.vue"),
  },
  // TODO: 17) url -> J_ForObjectExam.vue 페이지와 연결하는 부분
  {
    path: "/for-object-exam",
    component: () => import("../views/J_ForObjectExam.vue"),
  },
  // TODO: 18) url -> K_PropsView.vue 페이지와 연결하는 부분
  {
    path: "/props",
    component: () => import("../views/K_PropsView.vue"),
  },
  // TODO: 19) url -> K_PropsExam.vue 페이지와 연결하는 부분
  {
    path: "/props-exam",
    component: () => import("../views/K_PropsExam.vue"),
  },
  // TODO: 19) url -> L_EmitView.vue 페이지와 연결하는 부분
  {
    path: "/emit",
    component: () => import("../views/L_EmitView.vue"),
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
