<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-19
  Time: 오전 11:19
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
            <th scope="col">dno</th>
            <th scope="col">dname</th>
            <th scope="col">loc</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="data" items="${list}">
            <tr>
                <td><a href="/basic/dept/edition/${data.dno}">${data.dno}</a></td>
                <td>${data.dname}</td>
                <td>${data.loc}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <%--        TODO: 페이지번호 --%>

    <%--        TODO: Add 버튼 --%>

</div>
<%--    꼬리말--%>
<jsp:include page="../../common/footer.jsp" />

</body>
</html>
