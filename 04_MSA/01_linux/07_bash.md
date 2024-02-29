# bash.md

### 1) 셀 : 윈도우의 바탕화면 테마와 비슷, 종류로는 bash 셀, csh 셀, born 셀 등이 있음

### 2) 셀변수 :

##### 변수 : 값을 저장하는 곳

##### 셀변수 : bash 셀 환경에 값을 저장하는 것

##### 사용법 1) 셀변수 저장 : 변수명='문자열'

##### 사용법 2) 셀변수 사용 : $변수명

    oracle@2d5f598932bb:~/work$ var1='test var'
    oracle@2d5f598932bb:~/work$ echo $var1
    test var

##### 2-2) var2 셀변수에 'hello world' 넣고 셀변수를 echo 출력해보세요

    oracle@2d5f598932bb:~/work$ var2='hello world'
    oracle@2d5f598932bb:~/work$ echo $var2
    hello world

### 3) 프롬프트 : PS1

##### 프롬프트 : 명령어 앞에 $, # 표시된부분을 말함

##### root (계정:슈퍼관리자) : # 프롬프트 표시

##### 일반 계정 : $ 프롬프트 표시

    예) oracle@2d5f598932bb:~/work$

### 4) 리눅스에서 미리 정의한 셀변수(환경변수)를 소개

##### 4-1) $SHELL : 현재 사용하는 셀을 저장하는 변수

##### 예제 1) 현재 사용하는 셀 화면에 출력(echo)

##### 사용법) echo $SHELL

    oracle@2d5f598932bb:~/work$ echo $SHELL
    /bin/bash

##### 4-2) $PATH : 여러가지 경로가(PATH) 미리 저장된 변수

##### 예제 2) 현재 등록된 $PATH 경로를 화면에 출력(echo)

##### 사용법 : echo $PATH

##### PATH => 경로1:경로2:경로3...

##### 모든 OS 는 명령어를 실행하려면 : 경로/명령어

    oracle@2d5f598932bb:~/work$ echo $PATH
    /usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin

##### java 명령어가 /usr/local/sbin 폴더에 있다고 가정.

##### 현재경로 : /home/oracle => java 실행

##### => java 를 찾을 수 없습니다. 에러발생

##### => /usr/local/sbin/java 실행해야 에러안남

##### => $PATH 셀변수에 /usr/local/sbin 경로 저장하고 java 를 실행하면 OS가 $PATH 경로를 먼저 찾아서 있으면 정상실행 없으면 에러가 발생

##### 4-3) LANG 셀변수 : 로케일, 언어셋

##### 현재 시스템의 설치된 언어셋 보기 명령어

##### 사용법) locale -a

    oracle@2d5f598932bb:~$ locale -a
    C
    C.UTF-8
    POSIX
    oracle@2d5f598932bb:~$

##### (참고) 한국어 라이브러리 설치하면 (생략)

##### LANG=ko_KR.uft8 실행 => 한국어로 변경됨

##### LANG=C 실행 => 영어로 변경됨

##### 5) .profile, .bashrc 환경설정 파일 소개

##### 셀변수 만들기 : var1='hello world'

##### 셀변수는 로그아웃, 리눅스 종료하면 사라짐

##### => .profile, .bashrc 파일에 셀변수를 등록하면 다시 로그인했을때도 그변수를 사용가능함

##### 위치 : ~/.profile : 홈폴더(디렉토리)에 숨긴파일로 있음

##### 위치 : ~/.bashrc : 홈폴더(디렉토리)에 숨긴파일로 있음

##### 위치 : /etc/profile : etc 폴더에 있음, 모든 사용자에게 셀변수가 적용됨

##### 예제 1)
