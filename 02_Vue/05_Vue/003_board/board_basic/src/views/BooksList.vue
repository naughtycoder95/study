// BooksList.vue(연습)
// vueInit
<template>
    <div>
    <!-- 연습) 부트스트랩 테이블에 books.json 데이터를 반복문을 이용해서 출력하세요 -->
    </div>
</template>
<script>
// TODO: 1) BooksService.js 에 임포트 (why? getAll() 함수사용)
// TODO: 2) 빈 배열 속성 준비 : books 배열 정의 (why? 결과를 담기위해)
// TODO: 3) getAll() 함수를 실행할 뷰 함수(methods) 정의 : retrieveBooks()
// TODO: 4) mounted() 함수 정의 : 화면이 뜰때 retrieveBooks() 자동실행하게 함
import BooksService from "../services/BooksService";

export default {
    data() {
        return {
            books: []
        }
    },
    methods: {
        // TODO: getAll() 함수를 실행할 뷰 함수(methods) 정의
        retrieveBooks() {

        }
    },
    mounted() {
        this.retrieveBooks(); // 화면이 뜰때 자동실행됨
    },
}
</script>
<style lang="">
    
</style>