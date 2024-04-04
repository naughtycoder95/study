// HeaderCom.vue // 파일 명명법 : 2단어 이상으로 짓기 // 머리말
<template>
  <div>
    <!-- 부트스트랩 메뉴 넣기 -->
    <nav class="navbar navbar-expand-lg bg-light">
      <div class="container-fluid">
        <a class="navbar-brand" href="#">Simple</a>
        <!-- 단축메뉴(햄버거 메뉴) -->
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <!-- 메뉴(왼쪽) -->
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <!-- 1st : Home -->
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="#">Home</a>
            </li>
            <!-- 기초예제 메뉴 #1 -->
            <li class="nav-item dropdown">
              <!-- 대메뉴 -->
              <a
                class="nav-link dropdown-toggle"
                href="#"
                role="button"
                data-bs-toggle="dropdown"
                aria-expanded="false"
              >
                기초 예제
              </a>
              <!-- 소메뉴 -->
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="/dept">Dept</a></li>
                <li><a class="dropdown-item" href="/add-dept">Add Dept</a></li>
                <li><hr class="dropdown-divider" /></li>
                <li>
                  <a class="dropdown-item" href="/emp">Emp(연습)</a>
                </li>
                <li>
                  <a class="dropdown-item" href="/add-emp">Add Emp(연습)</a>
                </li>
              </ul>
            </li>
            <!-- 고급예제 메뉴 #2 -->
            <li class="nav-item dropdown">
              <!-- 대메뉴 -->
              <a
                class="nav-link dropdown-toggle"
                href="#"
                role="button"
                data-bs-toggle="dropdown"
                aria-expanded="false"
              >
                고급 예제
              </a>
              <!-- 소메뉴 -->
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="/fileDb">FileDb</a></li>
                <li><a class="dropdown-item" href="/add-fileDb">Add FileDb</a></li>
                <li><hr class="dropdown-divider" /></li>
                <li>
                  <a class="dropdown-item" href="/gallery">Gallery(연습)</a>
                </li>
                <li>
                  <a class="dropdown-item" href="/add-gallery">Add Gallery(연습)</a>
                </li>
              </ul>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </div>
</template>
<script>
export default {};
</script>
<style></style>
