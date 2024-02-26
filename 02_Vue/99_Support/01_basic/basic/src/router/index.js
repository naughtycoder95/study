import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";

const routes = [
  {
    // http://localhost:8080/
    path: "/",
    name: "home",
    component: HomeView,
  },
  {
    // http://localhost:8080/about
    path: "/about",
    name: "about",
    component: () => import("../views/AboutView.vue"),
  },
  {
    // http://localhost:8080/attr
    path: "/attr",
    name: "attr",
    component: () => import("../views/AttrView"),
  },
  {
    // http://localhost:8080/form
    path: "/form",
    name: "form",
    component: () => import("../views/FormView"),
  },
  {
    // http://localhost:8080/if
    path: "/if",
    name: "if",
    component: () => import("../views/IfView"),
  },
  {
    // http://localhost:8080/for
    path: "/for",
    name: "for",
    component: () => import("../views/ForView"),
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
