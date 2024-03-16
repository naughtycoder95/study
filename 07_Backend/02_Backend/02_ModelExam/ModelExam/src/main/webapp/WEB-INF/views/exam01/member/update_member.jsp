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
<%-- 본문 --%>
<div class="container">
<%--    수정 form --%>
    <form action="/exam01/member/edit/${member.eno}" method="post">
        <%--        put 방식 전송 : 아래 input 태그 필요 --%>
        <input type="hidden" name="_method" value="put"/>
        <%--     기본키: 사원번호(eno) : 숨김 --%>
        <input type="hidden" name="dno" value="${member.eno}"/>
        <div class="mb-3">
            <%--            사원명(ename) 입력양식 --%>
            <label for="ename" class="form-label">ename</label>
            <input type="text"
                   class="form-control"
                   id="ename"
                   name="ename"
                   value="${member.ename}"
                   placeholder="사원명입력">
        </div>
        <div class="mb-3">
            <%--            직위(job) 입력양식 --%>
            <label for="job" class="form-label">job</label>
            <input type="text"
                   class="form-control"
                   id="job"
                   name="job"
                   value="${member.job}"
                   placeholder="직위입력">
        </div>
        <div class="mb-3">
            <%--            관리자사원번호(manager) 입력양식 --%>
            <label for="manager" class="form-label">manager</label>
            <input type="text"
                   class="form-control"
                   id="manager"
                   name="manager"
                   value="${member.manager}"
                   placeholder="관리자사원번호입력">
        </div>
        <%--     수정버튼       --%>
        <div class="mb-3">
            <button type="submit" class="btn btn-warning">수정</button>
        </div>
    </form>

<%--    삭제 form --%>
    <form action="/exam01/member/delete/${member.eno}" method="post">
<%--      delete 방식 사용시 아래 input 태그가 필요  --%>
        <input type="hidden" name="_method" value="delete"/>
<%--        삭제 버튼 추가 --%>
        <button type="submit" class="btn btn-danger">삭제</button>
    </form>

</div>
<%--  꼬리말  --%>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
