// LoginView.vue // vueInit
<template>
  <div>
    <div class="row justify-content-center">
      <div class="col-xl-10 col-lg-12 col-md-9">
        <div class="card mt-5">
          <div class="card-body p-0">
            <!-- {/* Nested Row within Card Body */} -->
            <div class="row">
              <div class="col-lg-6 bg-login-image"></div>
              <div class="col-lg-6">
                <div class="p-5">
                  <div class="text-center">
                    <h1 class="h4 mb-4">Welcome Back!</h1>
                  </div>
                  <!-- 사용법 : @submit.prevent="함수" -->
                  <!-- prevent : submit 의 기본 속성을 막기(다른 곳으로 이동하려는 특징)  -->
                  <form class="user" @submit.prevent="handleLogin">
                    <div class="form-group">
                      <input
                        type="email"
                        class="form-control form-control-user mb-3"
                        placeholder="이메일을 넣기"
                        name="email"
                        v-model="user.email"
                      />
                    </div>
                    <div class="form-group">
                      <input
                        type="password"
                        class="form-control form-control-user mb-3"
                        placeholder="패스워드 넣기"
                        name="password"
                        v-model="user.password"
                      />
                    </div>

                    <button class="btn btn-primary btn-user w-100 mb-3">
                      Login
                    </button>
                    <hr />
                    <a href="/" class="btn btn-google btn-user w-100 mb-2">
                      <i class="fab fa-google fa-fw"></i>&nbsp;Login with Google
                    </a>
                    <a href="/" class="btn btn-naver btn-user w-100 mb-2">
                      <i class="fa-solid fa-n"></i>&nbsp;Login with Naver
                    </a>
                    <a href="/" class="btn btn-kakao btn-user w-100 mb-3">
                      <i class="fa-solid fa-k"></i>&nbsp;Login with Kakao
                    </a>
                  </form>
                  <hr />
                  <div class="text-center">
                    <a class="small" href="/forgot-password">
                      Forgot Password?
                    </a>
                  </div>
                  <div class="text-center">
                    <a class="small" href="/register"> Create an Account! </a>
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
<script>
import AuthService from '@/services/auth/AuthService';
export default {
    // TODO: 데이터 바인딩 속성 정의
    data() {
        return {
            user: {
                email: "",     // 로그인ID
                password: "",  // 암호
            },
        }
    },
    // TODO: 함수 정의
    methods: {
        async handleLogin() {
          // TODO: 공통 로그인 서비스 함수
          // TODO: 비동기 코딩 : async ~ await
          // TODO: 로그인 성공 => 로그인성공공유함수 실행
          // TODO: 로그인 실패 => 로그인실패공유함수 실행
          try {
            // TODO: 공통 로그인 서비스 함수
            let response = await AuthService.login(this.user);
            // 로깅
            console.log(response.data);
            // TODO: spring 보내준 user 객체(웹토큰있음)를 로컬스토리지에 저장
            // 사용법 :  localStorage.setItem(키, 값);
            //  => 단, 값은 문자열만 저장됨
            // 사용법 : JSON.stringify(객체) => 문자열로 바뀐 객체가 리턴됨
            localStorage.setItem("user", JSON.stringify(response.data))
            // TODO: 로그인 성공 => 로그인성공공유함수(loginSuccess(state, user)) 실행
            // this.$store.commit("loginSuccess");
            this.$store.commit("loginSuccess", response.data);
            // TODO: home 으로 강제이동
            this.$router.push("/");
          } catch(e) {
            // TODO: 로그인 실패 => 로그인실패공유함수(loginFailure) 실행
            // 사용법 : this.$store.commit("뮤테이션함수명")
            this.$store.commit("loginFailure");
            console.log(e); // 실패시 웹브라우저 콘솔탭에 에러 
          }
        }
    },
    // TODO: 화면이 뜰때 실행되는 함수
    //  => mounted() : 화면이 뜰때 자동 실행 (생명주기 함수) 
    //  => created() : 뷰가 생성될대 자동 실행
    //  => created()(1번, 뷰만 생성되면 실행) -> mounted()(2번, html 태그까지 모두 뜰때) 
    //  예) destoryed() : 뷰가 삭제될때 실행 (거의 사용않함)
    created() {
        // 인증 : jsp(쿠키/세션) => vue/spring(로컬스토리지/웹토큰)
        // 프로젝트 규모커지면 => 로그인 정보 + 상태값 관리
        // => vue 의 공유저장소에(vuex(뷰엑스))
        // TODO: 공유저장소에 공유속성중에 로그인이 true => 로그인 되어 있는 상태
        //  => 강제로 Home 으로 이동시킴
        // 사용법 : this.$store.state.공유속성명
        //  => 공유저장소의 공유속성 접근법
        if(this.$store.state.loggedIn == true) {
          this.$router.push("/"); // home 강제 이동
        }
    }
};
</script>
<style>
@import "@/assets/css/login.css";
</style>