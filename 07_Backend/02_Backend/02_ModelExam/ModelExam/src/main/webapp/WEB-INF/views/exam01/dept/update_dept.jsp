<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-14
  Time: 오후 5:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%--  머리말  --%>
<jsp:include page="../../common/header.jsp"/>
<%--  본문 : 수정/추가 : form/input 태그 --%>
<%--    insert -> post 방식   -> @PostMapping --%>
<%--    update -> put 방식    -> @PutMapping --%>
<%--    delete -> delete 방식 -> @DeleteMapping --%>
<%--    select -> get  방식   -> @GetMapping --%>
<div class="container">
<%--    수정 form --%>
    <form action="/exam01/dept/edit/${dept.dno}" method="post">
        <%--        TODO: 아래 input(hidden) 사용하면 put 방식으로 전송됨 --%>
        <input type="hidden" name="_method" value="put"/>
        <%--        TODO: 상세조회 값 input 태그에 출력 : value=값 --%>
        <%--        TODO: 부서번호(기본키) 숨김 : 수정불가 --%>
        <input type="hidden" name="dno" value="${dept.dno}"/>
        <div class="mb-3">
            <%--            부서명 입력양식 --%>
            <label for="dname" class="form-label">dname</label>
            <input type="text"
                   class="form-control"
                   id="dname"
                   name="dname"
                   value="${dept.dname}"
                   placeholder="부서명입력">
        </div>
        <div class="mb-3">
            <%--            부서위치 입력양식 --%>
            <label for="loc" class="form-label">loc</label>
            <input type="text"
                   class="form-control"
                   id="loc"
                   name="loc"
                   value="${dept.loc}"
                   placeholder="부서위치입력">
        </div>
<%--     수정버튼       --%>
        <div class="mb-3">
            <button type="submit" class="btn btn-warning">수정</button>
        </div>
    </form>

<%--    삭제 form --%>
    <form action="/exam01/dept/delete/${dept.dno}" method="post">
<%--      delete 방식은 아래 input 태그가 필요함  --%>
        <input type="hidden" name="_method" value="delete"/>
<%--        삭제 버튼 추가 : submit --%>
        <button type="submit" class="btn btn-danger">삭제</button>
    </form>
</div>
<%--  꼬리말  --%>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
