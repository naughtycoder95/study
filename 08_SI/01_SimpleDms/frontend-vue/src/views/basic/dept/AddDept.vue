// AddDept.vue // vueInit
// html 작성
<template>
  <div class="row">
    <div v-if="!submitted">
      <div class="col-6 mx-auto">
        <div class="row g-3 align-items-center mb-3">
          <div class="col-3">
            <label htmlFor="dname" class="col-form-label"> Dname </label>
          </div>

          <div class="col-9">
            <input
              type="text"
              id="dname"
              required
              class="form-control"
              placeholder="dname"
              name="dname"
              v-model="dept.dname"
            />
          </div>
        </div>

        <div class="row g-3 align-items-center mb-3">
          <div class="col-3">
            <label htmlFor="loc" class="col-form-label"> Loc </label>
          </div>
          <div class="col-9">
            <input
              type="text"
              id="loc"
              required
              class="form-control"
              placeholder="loc"
              name="loc"
              v-model="dept.loc"
            />
          </div>
        </div>

        <div class="row g-3 mt-3 mb-3">
          <button class="btn btn-outline-primary ms-2 col"
                    @click="saveDept"
          >저장
          </button>
        </div>
      </div>
    </div>

    <div v-else>
      <h4>You submitted successfully!</h4>
      <button class="btn btn-success"
            @click="newDept"
      >저장페이지</button>
    </div>
  </div>
</template>
// js 작성
<script>
import DeptService from '@/services/basic/DeptService';

export default {
    // TODO: 데이터 바인딩 속성 정의
    data() {
        return {
            dept: {},         // 빈 객체
            submitted: false  // 저장버튼 클릭하면 true 바뀜
        }
    },
    // TODO: 함수 정의
    methods: {
        // TODO: 저장(추가:insert) 함수 : CRUD (비동기)
        // TODO: 비동기 코딩 : async ~ await 
        async saveDept() {
            try {
                // 임시 객체 변수 
                let data = {
                    dname: this.dept.dname,
                    loc:   this.dept.loc
                };

                // TODO: 벡엔드로 객체 추가 요청
                let response = await DeptService.create(data);
                // TODO: 콘솔에 결과 출력
                console.log(response);
                this.submitted = true; // 저장유무변수=true 변경
            } catch(e) {
                console.log(e);
            }
        },
        // 저장페이지 열기 함수 : 화면 초기화 
        newDept() {
            // TODO: 뷰/리액트 : 변수값을 조작하면 화면이 자동 갱신됨
            this.submitted = false;
            this.dept = {}
        }
    }
};
</script>
// css 작성
<style></style>
