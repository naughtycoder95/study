<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-13
  Time: 오후 4:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- 복습 : JSP 조건문/반복문 등 사용시 import --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <!--    bootstrap css cdn -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<%--  머리말--%>
<jsp:include page="../../common/header.jsp" />
<%--   본문--%>
    <div class="container">
        <h2>전체 조회 : 연습</h2>
        <p>${list}</p>
        <%--     부트스트랩 테이블 :   --%>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">eno</th>
                <th scope="col">ename</th>
                <th scope="col">job</th>
                <th scope="col">manager</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="data" items="${list}">
                <tr>
                    <td>
                        <a href="/exam01/member/edition/${data.eno}">${data.eno}</a>
                    </td>
                    <td>${data.ename}</td>
                    <td>${data.job}</td>
                    <td>${data.manager}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

<%--     TODO: 추가 버튼 추가   --%>
        <div class="text-center">
            <a href="/exam01/member/addition" class="btn btn-primary">추가</a>
        </div>

    </div>
<%--  꼬리말--%>
<jsp:include page="../../common/footer.jsp" />
</body>
</html>
