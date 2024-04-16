// vue 의 공유 저장소 : 공유속성, 공유함수 등을 정의
//  => 모든 컴포넌트가 사용가능
import { createStore } from "vuex";

// TODO: 로그인 정보 + 로그인상태 를 정의
// 1) 로컬스토리지에서 user 객체 가져오기
const user = JSON.parse(localStorage.getItem("user"));

export default createStore({
  // TODO: state : 공유 속성(변수) 정의
  state: {
    loggedIn: user ? true : false, // 로그인 여부
    user: user ? user : null, // 로그인 정보(웹토큰속성 있음)
  },
  // TODO: 공유 속성의 값을 조회하는 함수 정의(생략가능)
  getters: {},
  // TODO: 공유 속성의 값을 저장(수정)하는 함수 정의(==setter)
  mutations: {
    // TODO: 로그인 성공함수
    //  => loggedIn(로그인여부 속성) = true , user(유저 객체) = user 객체 저장
    loginSuccess(state, user) {
      state.loggedIn = true;
      state.user = user;
    },
    // TODO: 로그인 실패함수
    loginFailure(state) {
      state.loggedIn = false;
      state.user = null;
    },
    // TODO: 로그아웃함수
    logout(state) {
      state.loggedIn = false;
      state.user = null;
    },
    // TODO: 회원가입성공함수
    registerSuccess(state) {
      state.loggedIn = false;
    },
    // TODO: 회원가입실패함수
    registerFailure(state) {
      state.loggedIn = false;
    },
  },
  // TODO: 비동기 함수들을 정의하는 곳(생략가능)
  actions: {},
  // TODO: 공유저장소를 여러개 사용할 경우 모듈로 정의해서 분리 가능(생략가능)
  modules: {},
});
