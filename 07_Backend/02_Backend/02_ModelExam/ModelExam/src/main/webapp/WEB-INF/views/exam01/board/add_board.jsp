<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-14
  Time: 오후 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    머리말--%>
<jsp:include page="../../common/header.jsp"/>
<%--    본문--%>
<div class="container">
    <form action="/exam01/board/add" method="post">
<%--      TODO: 추가페이지 : 기본키(게시판번호) 입력(없음) : 자동생성  --%>
        <div class="mb-3">
            <%--            게시판제목 입력양식 --%>
            <label for="title" class="form-label">title</label>
            <input type="text"
                   class="form-control"
                   id="title"
                   name="title"
                   placeholder="게시판제목입력">
        </div>
        <div class="mb-3">
            <%--            게시판내용 입력양식 --%>
            <label for="content" class="form-label">content</label>
            <input type="text"
                   class="form-control"
                   id="content"
                   name="content"
                   placeholder="게시판내용입력">
        </div>
        <div class="mb-3">
            <button type="submit" class="btn btn-primary">저장</button>
        </div>
    </form>
</div>
<%--    꼬리말--%>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
