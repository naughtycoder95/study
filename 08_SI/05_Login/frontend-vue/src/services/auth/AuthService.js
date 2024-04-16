// AuthService.js
// 로그인/로그아웃/회원가입을 위한 공통 axios 함수
import http from "@/utils/http-common";

class AuthService {
  // TODO: 로그인 공통 서비스 함수 정의
  // jsp => post 방식(보안) , vue/react => post 방식(보안)
  login(user) {
    // 임시 객체
    let data = {
      email: user.email, // 로그인ID
      password: user.password, // 암호
    };
    return http.post("/auth/login", data);
  }

  // TODO: 로그아웃 공통 서비스 함수 정의
  logout() {
    // 로컬스토리지의 값을 삭제
    // 사용법 : localStorage.removeItem("키이름")
    localStorage.removeItem("user");
  }

  // TODO: 회원가입 공통 서비스 함수 정의(insert)
  register(user) {
    // 임시 객체
    let data = {
      email: user.email,
      password: user.password,
      name: user.name,
      codeName: user.codeName     // 권한
    }
    return http.post("/auth/register", data);
  }
}

export default new AuthService();