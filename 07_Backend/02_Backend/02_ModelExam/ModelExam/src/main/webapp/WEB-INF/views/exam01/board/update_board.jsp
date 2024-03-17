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
<%--  본문 : 수정/추가 : form/input 태그 --%>
<%--    insert -> post 방식   -> @PostMapping --%>
<%--    update -> put 방식    -> @PutMapping --%>
<%--    delete -> delete 방식 -> @DeleteMapping --%>
<%--    select -> get  방식   -> @GetMapping --%>
<div class="container">
<%--    수정 form --%>
    <form action="/exam01/board/edit/${board.id}" method="post">
        <input type="hidden" name="_method" value="put"/>
        <input type="hidden" name="id" value="${board.id}"/>
        <div class="mb-3">
            <label for="title" class="form-label">제목</label>
            <input type="text"
                   class="form-control"
                   id="title"
                   name="title"
                   value="${board.title}"
                   placeholder="제목 입력">
        </div>
        <div class="mb-3">
            <label for="content" class="form-label">내용</label>
            <input type="text"
                   class="form-control"
                   id="content"
                   name="content"
                   value="${board.content}"
                   placeholder="내용 입력">
        </div>
<%--     수정버튼       --%>
        <div class="mb-3">
            <button type="submit" class="btn btn-warning">수정</button>
        </div>
    </form>
</div>
<%--    꼬리말--%>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
