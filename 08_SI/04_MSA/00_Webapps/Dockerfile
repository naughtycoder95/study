# 도커 이미지 다운로드명 : nginx 1.23 버전 다운로드
FROM nginx:1.23.3
# 도커 이미지(nginx) 의 /etc/nginx/conf.d 폴더 삭제하겠음
RUN rm -rf /etc/nginx/conf.d
# 내가 만든 conf 폴더를 도커이미지(nginx) /etc/nginx 폴더에 복사하겠음
# 사용법: COPY 윈도우폴더 도커이미지폴더
COPY conf /etc/nginx
# 내가 만든 html 폴더를 도커이미지(nginx) /usr/share/nginx/html 폴더에 복사하겠음
# html 폴더 내용 : Vue 배포본
# 참고) nginx 웹서버의 기본 경로(/) : /usr/share/nginx/html
# 예) http://localhost:8080/ => nginx 의 기본경로
COPY html /usr/share/nginx/html
# nginx 웹서버를 실행 : 컨테이너가 실행될때 1번 실행
# nginx -g daemon off;
CMD ["nginx", "-g", "daemon off;"]