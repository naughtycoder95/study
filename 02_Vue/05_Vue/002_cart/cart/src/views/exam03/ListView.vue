// HeaderCom.vue : 머리말(메뉴) // vueInit
<template>
    <div>
        <!-- TODO: 부트스트랩 메뉴(navbar) -->
        <!-- TODO: 자동정렬 : ctrl + alt + l -->
        <nav class="navbar navbar-expand-lg bg-light">
            <div class="container-fluid">
                <!-- TODO: 사이트 제목 -->
                <a class="navbar-brand" href="#">Cart</a>
                <!-- TODO: 해상도에 따라 햄버거 버튼이 나오는 부분 -->
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                    aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <!-- TODO: 메뉴들 -->
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <!-- TODO: 중메뉴들 -->
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <!-- TODO: 1st 중메뉴 -->
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/">Home</a>
                        </li>
                        <!-- TODO: 2nd 중메뉴 : 드롭다운 메뉴 -->
                        <li class="nav-item dropdown">
                            <!-- TODO: 드룹다운 중메뉴 -->
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                                aria-expanded="false">
                                Basic 메뉴
                            </a>
                            <!-- TODO: 소메뉴 -->
                            <ul class="dropdown-menu">
                                <!-- TODO: 1st 소메뉴 -->
                                <li><router-link to="/binding" class="dropdown-item">Binding</router-link></li>
                                <li><router-link to="/binding-exam" class="dropdown-item">BindingExam</router-link></li>
                                <!-- TODO: 2nd 소메뉴 -->
                                <li><router-link to="/condition" class="dropdown-item">Condition</router-link></li>
                                <li><router-link to="/condition-exam" class="dropdown-item">ConditionExam</router-link></li>
                                <!-- TODO: 3rd 소메뉴 -->
                                <li><router-link to="/list" class="dropdown-item">List</router-link></li>
                                <li><router-link to="/list-exam" class="dropdown-item">ListExam</router-link></li>
                                <!-- TODO: 4 소메뉴 -->
                                <li><router-link to="/event" class="dropdown-item">Event</router-link></li>

                            </ul>
                        </li>
                        <!-- TODO: 3rd 중메뉴 -->
                    </ul>
                    <!-- TODO: 검색입력양식+버튼 -->
                </div>
            </div>
        </nav>
    </div>
</template>
<script>
export default {};
</script>
<style lang=""></style>