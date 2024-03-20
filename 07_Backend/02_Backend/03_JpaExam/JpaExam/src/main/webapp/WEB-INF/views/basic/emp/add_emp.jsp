<%--
  Created by IntelliJ IDEA.
  User: kimtaewan
  Date: 3/20/24
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
    <title>Title</title>
</head>

<body>

<jsp:include page="../../common/header.jsp" />

<div class="container">
    <form action="/exam01/dept/add" method="post">

        <div class="mb-3">
            <label for="ename" class="form-label">ename</label>
            <input type="text"
                   class="form-control"
                   id="ename"
                   name="ename"
                   placeholder="사원명입력">
        </div>

        <div class="mb-3">
            <label for="job" class="form-label">job</label>
            <input type="text"
                   class="form-control"
                   id="job"
                   name="job"
                   placeholder="직위입력">
        </div>

        <div class="mb-3">
            <label for="manager" class="form-label">manager</label>
            <input type="text"
                   class="form-control"
                   id="manager"
                   name="manager"
                   placeholder="관리자입력">
        </div>

        <div class="mb-3">
            <label for="hiredate" class="form-label">hiredate</label>
            <input type="text"
                   class="form-control"
                   id="hiredate"
                   name="hiredate"
                   placeholder="입사일입력">
        </div>

        <div class="mb-3">
            <label for="job" class="form-label">job</label>
            <input type="text"
                   class="form-control"
                   id="job"
                   name="job"
                   placeholder="직위입력">
        </div>

        <div class="mb-3">
            <label for="salary" class="form-label">salary</label>
            <input type="text"
                   class="form-control"
                   id="salary"
                   name="salary"
                   placeholder="급여입력">
        </div>

        <div class="mb-3">
            <label for="commission" class="form-label">commission</label>
            <input type="text"
                   class="form-control"
                   id="commission"
                   name="commission"
                   placeholder="성과급입력">
        </div>

        <div class="mb-3">
            <label for="salary" class="form-label">salary</label>
            <input type="text"
                   class="form-control"
                   id="salary"
                   name="salary"
                   placeholder="급여입력">
        </div>

        <div class="mb-3">
            <label for="dno" class="form-label">dno</label>
            <input type="text"
                   class="form-control"
                   id="dno"
                   name="dno"
                   placeholder="부서번호입력">
        </div>

        <div class="mb-3">
            <button type="submit" class="btn btn-primary">저장</button>
        </div>

    </form>
</div>

<jsp:include page="../../common/footer.jsp" />

</body>
</html>
