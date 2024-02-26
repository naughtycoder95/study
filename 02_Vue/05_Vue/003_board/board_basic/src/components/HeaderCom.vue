// HeaderCom.vue : 머리말(메뉴) // vueInit
<template>
  <div>
    <!-- TODO: 메뉴  : 자동정렬 : ctrl + alt + l -->
    <nav class="navbar navbar-expand-lg bg-light">
      <div class="container-fluid">
        <!-- TODO: 사이트 제목 -->
        <a class="navbar-brand" href="#">Simple</a>
        <!-- TODO: 햄버거 버튼(해상도, 창이 작아지면 나타남) -->
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
        <!-- TODO: 중메뉴 -->
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <!-- TODO: 중메뉴 -->
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <!-- TODO: 1번째 메뉴 -->
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="/">Home</a>
            </li>
            <!-- TODO: 2번째 메뉴 -->
            <li class="nav-item dropdown">
              <a
                class="nav-link dropdown-toggle"
                href="#"
                role="button"
                data-bs-toggle="dropdown"
                aria-expanded="false"
              >
                Basic 메뉴
              </a>
              <!-- TODO: 소메뉴 -->
              <ul class="dropdown-menu">
                <!-- TODO: 1번째 소메뉴 -->
                <li>
                  <router-link to="/dept" class="dropdown-item"
                    >Dept</router-link
                  >
                </li>
                <!-- TODO: 2번째 소메뉴 -->
                <li>
                  <router-link to="/customer" class="dropdown-item"
                    >Customer(연습)</router-link
                  >
                </li>
                <!-- TODO: 3번째 소메뉴 -->
                <li>
                  <router-link to="/books" class="dropdown-item"
                    >Books(연습)</router-link
                  >
                </li>
              </ul>
            </li>
          </ul>
          <!-- TODO: 검색 삭제 -->
        </div>
      </div>
    </nav>
  </div>
</template>
<script>
export default {};
</script>
<style lang=""></style>
