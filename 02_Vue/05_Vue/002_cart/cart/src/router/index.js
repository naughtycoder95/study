import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";

const routes = [
  {
    path: "/",
    name: "home",
    component: HomeView,
  },
  // TODO: 1st 드롭다운 url
  {
    path: "/binding",
    component: () => import("../views/exam01/BindingView.vue"),
  },
  // TODO: 2 드롭다운 url
  {
    path: "/binding-exam",
    component: () => import("../views/exam01/BindingExam.vue"),
  },
  // TODO: 3 드롭다운 url
  {
    path: "/condition",
    component: () => import("../views/exam02/ConditionView.vue"),
  },
  // TODO: 4 드롭다운 url
  {
    path: "/condition-exam",
    component: () => import("../views/exam02/ConditionExam.vue"),
  },
  // TODO: 5 드롭다운 url
  {
    path: "/list",
    component: () => import("../views/exam03/ListView.vue"),
  },
  // TODO: 6 드롭다운 url
  {
    path: "/list-exam",
    component: () => import("../views/exam03/ListExam.vue"),
  },
  // TODO: 7 드롭다운 url
  {
    path: "/event",
    component: () => import("../views/exam04/EventView.vue"),
  },
  // TODO: 8 드롭다운 url
  {
    path: "/event-exam",
    component: () => import("../views/exam04/EventExam.vue"),
  },
  // TODO: 8 드롭다운 url
  {
    path: "/class",
    component: () => import("../views/exam05/ClassView.vue"),
  },
  // TODO: 9 드롭다운 url
  {
    path: "/computed",
    component: () => import("../views/exam06/ComputedView.vue"),
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
