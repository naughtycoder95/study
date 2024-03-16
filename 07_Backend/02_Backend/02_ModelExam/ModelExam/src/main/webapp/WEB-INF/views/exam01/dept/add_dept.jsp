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
<%--  html : 입력(insert/update) : form/input 태그 --%>
<%--  웹 전송(약속) : get(조회:select), post(추가:insert) --%>
<%--                put(수정:update), delete(삭제:delete) --%>
<%--      get 방식 : 웹브라우저 주소창에 값을 입력해서 전송하는 방식--%>
<%--      post/put/delete 방식 : 눈에 안보이고 내부적으로 숨겨서 전송되는 방식 --%>
<%--   TODO: 프론트(html/vue/jsp) <=> 벡엔드(spring) :
            1) form 태그의 input 양식의 값은 name 속성이름으로 spring 으로 전송됨 --%>
<%--           예) input name="dname" => spring : dname 변수명으로 전달받음 --%>
<%--        2) submit 버튼을 클릭하면 위의 값이 전달됨 --%>
<%--        3) form action="/컨트롤러함수url" method="웹전송방식" --%>
<div class="container">
    <form action="/exam01/dept/add" method="post">
        <%--         부트스트랩 input 양식   --%>
        <%--        자동정렬 : ctrl + alt + l --%>
        <div class="mb-3">
            <%--            부서명 입력양식 --%>
            <label for="dname" class="form-label">dname</label>
            <input type="text"
                   class="form-control"
                   id="dname"
                   name="dname"
                   placeholder="부서명입력">
        </div>
        <div class="mb-3">
            <%--            부서위치 입력양식 --%>
            <label for="loc" class="form-label">loc</label>
            <input type="text"
                   class="form-control"
                   id="loc"
                   name="loc"
                   placeholder="부서위치입력">
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
