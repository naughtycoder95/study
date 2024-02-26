<template>
  <div>
    <table class="table">
      <thead>
        <tr>
          <th scope="col">eno</th>
          <th scope="col">ename</th>
          <th scope="col">job</th>
          <th scope="col">manager</th>
          <th scope="col">salary</th>
        </tr>
      </thead>
      <!--      조회 데이터 생성 부분-->
      <tbody v-for="(data, index) in emp" :key="index">
        <tr>
          <td>{{ data.eno }}</td>
          <td>{{ data.ename }}</td>
          <td>{{ data.job }}</td>
          <td>{{ data.manager }}</td>
          <td>{{ data.salary }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import EmpService from "@/services/EmpService";

/* eslint-disable */
export default {
  data() {
    return {
      emp: [],
    };
  },
  methods: {
    // 모든 회원 조회 서비스 호출
    async retrieveEmp() {
      try {
        // axios로 spring에 모든 회원 조회 요청
        let response = await EmpService.getAll();
        //  성공하면 then으로 서버(spring) 데이터(response.data)가 들어옴
        console.log(response.data);
        this.emp = response.data.emp;
      } catch (e) {
        console.log(e);
      }
    },
  },
  //화면이 뜨자마자 실행되는 이벤트(모든 회원조회가 실행됨)
  mounted() {
    this.retrieveEmp();
  },
};
</script>
