# 베이스 이미지 선택
FROM ubuntu:18.04
# 도커 컨테이너 내부에서 실행할 명령어
# 리눅스 업데이트 실행
RUN apt-get update -y
# 윈도우:message.txt => 리눅스:/message.txt 에 복사
ADD ./message_exam.txt /message_exam.txt
# 컨테이너 실행후에 1번 실행할 명령어(생략가능)
CMD cat /message_exam.txt
