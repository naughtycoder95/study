# 팀프로젝트 : 2개

# KDT 사업 : 주제 고정 :

##### 주제 1 : 쇼핑몰 <= 롯데쇼핑 (MSA 기술로 구축), 서비스업체

##### 주제 2 : 사내 커뮤니티 사이트 <= 롯데정보통신 (모놀리식 기술로 구축), SI업체

### 요약 : 모놀리식 아키텍쳐 vs 마이크로서비스 아키텍쳐(MSA: Microservice achitecture)

##### 모놀리식 아키텍쳐 : 하나의 대형컴퓨터에 모든 소스를 올리는 구조, 과거부터 흔하게 개발되어진 기술

##### 마이크로서비스 아키텍쳐 : 모든 소스(인사부/개발부/연구소 등)를 각자의 서비스로 분리시켜 놓은 구조 => 1개의 서비스를 주로 도커 컨테이너에 탑재함

    사례) 서비스업체 : 네이버, 카카오, 배달의민족, 쇼핑몰 등
                      아마존, 넷플릭스 등

##### 모놀리식 아키텍쳐 :

##### 기반 기술 :

    1) 프론트 : HTML/CSS/JS, VUE/REACT
    2) 벡엔드 : JSP, JAVA/Springboot, oracle/my-sql
    3) WAS    : 톰캣(무료), 상용WAS 툴
        (WAS : 자바코드를 웹브라우저 실행하게 만들어 주는 도구)
    4) 도구   : git/github(형상관리툴)
    5) 기타   : 부트스트랩 , AWS(아마존 웹서비스) 등

##### 마이크로서비스 아키텍쳐 :

##### (과거)spring cloud 기술(자바) -> 도커 / 쿠버네티스(현재)

##### 기반 기술 :

    1) 프론트         : HTML/CSS/JS, VUE/REACT
    2) 벡엔드         : JAVA/Springboot,
    3) DB             : oracle/my-sql(관계형 DB), 몽고 DB(문서 DB), Redis(레디스, 캐싱 DB: 성능 향상)
    4) WAS    : 톰캣(무료), 상용WAS 툴
    (WAS : 자바코드를 웹브라우저 실행하게 만들어 주는 도구)
    5) 도구           : git/github(형상관리툴)
    6) 컨테이너/가상화 : 도커, 도커관리툴(쿠버네티스, 도커스웜 등: devop엔지니어 책임)
    7) 메세지 전송 도구 : 카프카
    8) 기타           : 부트스트랩 , AWS(아마존 웹서비스) 등

##### 쿠버네티스 사용 :

##### (1) MSA(마이크로서비스) 구축시 필요 기능

    - 다수의 서버(컴퓨터)를 묶어서 관리하는 기술
    - 다수의 서버(컴퓨터)에 도커 컨테이너를 일괄적 배포하는 기술
    - 도커 컨테이너가 많으므로 원하는 컨테이너 선택할수 있는 기술
        (서비스 디스커버리)
    - 서버 컴퓨팅 파워(cpu, 메모리)가 부족하면 자동으로 늘려주는 기술
    - 컨테이너가 장애가 발생하면 대체 컨테이너를 만들어서 서비스하는 기능
    - 주기적으로 컨테이너가 살았는지 죽었는지 자동체크 기능
    - 이 외에도 많은 기술들이 있음

##### (2) 쿠버네티스의 기능

    - 도커 컨테이너 관리툴 : 오케스트레이션 도구
    - 대규모 도커 컨테이너들에 대한 쉽고 일괄적인 관리를 해줌
    - 예로는 쿠버네티스(Kubernetes==k8s), 도커스웜 등이 있음
    - 쿠버네티스가 업계 표준
    - 구글에서 제품개발했음, 무료로 제공했음
    - 커뮤니티가 굉장히 많음
    - 데브옵(devops) 엔지니어들이 주로 사용함

##### (3) 쿠버네티스 기능들 설명

    - 벨로그 그림 참고
    - 노드 : 서버 컴퓨터
    - 쿠버네티스(k8s) 노드 : 마스터 컴퓨터(노드) 1개, 워크컴퓨터(노드) 2개 가 최소 구성임
        마스커컴퓨터가 워크컴퓨터 2대를 관리함
    - service : 기본적으로 도커 컨테이너는 외부 접속이 안됨. 이것을 가능하게 해주는 기능(port 공유(개방, 노출))
    - ingress : 수많은 도커 컨테이너 중에서 유저의 요청에 맞는 컨테이너를 찾아주는 기능
    - kubelet : 도커 컨테이너 관리해주는 기능(컨테이너 복제본 만들기, 컨테이너 죽었는지/살았는지 확인 등)
    - kube proxy : 외부에 서비스명, ip 주소 등을 숨겨서 보안을 증가시키는 기능
    - devops     : 서버, cpu 등 자동으로 배치하고 컴퓨터를 조립할 수 있는 시스템 엔지니어
    - user       : 뷰, 리액트 등 프론트엔트 프로그램 또는 그 서비스를 접속한 사람
