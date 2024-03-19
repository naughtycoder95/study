<%--
  Created by IntelliJ IDEA.
  User: kimtaewan
  Date: 3/19/24
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    머리말 --%>
<jsp:include page="../../common/header.jsp" />
<%--    본문--%>
<div class="container">
    <%--        TODO: 검색어 입력 상자 --%>

    <%--        TODO: 테이블 --%>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">eno</th>
            <th scope="col">ename</th>
            <th scope="col">job</th>
            <th scope="col">manager</th>
            <th scope="col">insertTime</th>
            <th scope="col">updateTime</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="data" items="${emp}">
            <tr>
                <td><a href="/basic/emp/edition/${data.eno}">${data.eno}</a></td>
                <td>${data.ename}</td>
                <td>${data.job}</td>
                <td>${data.manager}</td>
                <td>${data.insertTime}</td>
                <td>${data.updateTime}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <%--        TODO: Add 버튼 --%>
    <div class="text-center">
        <a href="/basic/dept/addition" class="btn btn-primary">Add</a>
    </div>
</div>
<%--    꼬리말--%>
<jsp:include page="../../common/footer.jsp" />

</body>
</html>
