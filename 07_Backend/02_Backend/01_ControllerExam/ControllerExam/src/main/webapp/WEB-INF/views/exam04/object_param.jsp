<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-12
  Time: 오후 4:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%-- bootstrap css cdn   --%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h2>객체 전달받기</h2>
<%--        회원 객체 출력 --%>
        <p>${member}</p>
<%--        회원 객체 속성 출력 : id, name --%>
        <p>${member.id}</p>
        <p>${member.name}</p>
    </div>
</body>
</html>
