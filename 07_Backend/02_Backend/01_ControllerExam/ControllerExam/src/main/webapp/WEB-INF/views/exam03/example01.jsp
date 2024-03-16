<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-12
  Time: 오전 10:34
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
<%--    jsp el 표현식 : ${변수명} --%>
        <p>${dno}</p>
        <p>${dname}</p>
        <p>${loc}</p>
    </div>
</body>
</html>
