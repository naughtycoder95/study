<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-20
  Time: 오후 5:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- 머리말 --%>
<jsp:include page="../../common/header.jsp"/>
<%-- 본문 --%>
<div class="container">
    <div>
        <%--     TODO: 저장(insert - post 방식 - @PostMapping) --%>
        <form action="/basic/dept/add" method="post">
            <%--            input 태그 : 부서명 --%>
            <div class="mb-3">
                <label for="dname" class="form-label">dname</label>
                <input type="text"
                       class="form-control"
                       id="dname"
                       name="dname"
                       placeholder="부서명입력">
            </div>
            <%--            input 태그 : 부서위치--%>
            <div class="mb-3">
                <label for="loc" class="form-label">loc</label>
                <input type="text"
                       class="form-control"
                       id="loc"
                       name="loc"
                       placeholder="부서위치입력">
            </div>
            <%--            저장 버튼--%>
            <div class="mb-3">
                <button type="submit" class="btn btn-primary">저장</button>
            </div>

        </form>
    </div>
</div>
<%-- 꼬리말 --%>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
