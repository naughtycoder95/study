// AuthHeader.js
// 웹토큰을 헤더에 넣어 spring 보내기 위한 헤더 정의
export default function AuthHeader() {
  // 쿠키 대신 로컬스토리지(html 5버전)
  // 로컬스토리지는 쿠키 확장판, 저장공간
  // 사용법 : localStorage.getItem('키');
  //  => 키를 문자열로 가져오기
  // JSON.parse(문자열객체) => 실제객체로 바꾸어주는 함수
  //  사용법 : JSON.parse(문자열객체)
  let user = JSON.parse(localStorage.getItem("user"));

//   로컬스토리지에서 웹토큰을 가진 유저가 있으면
//   예) user => 로그인ID, password(암호화), 이름, 웹토큰
//    accessToken : 웹토큰
  if (user && user.accessToken) {
    // Bearer (웹토큰 전송시 약속)
    // spring 에서 웹토큰 인증함
    return { Authorization: "Bearer " + user.accessToken }; // 웹토큰 전송
  } else {
    return {}; // 아무것도 안보냄
  }
}
