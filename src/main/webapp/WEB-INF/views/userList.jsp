<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
    <table>
        <thead>
            <td>序号</td>
            <td>用户id</td>
            <td>用户名</td>
            <td>用户密码</td>
            <td>用户状态</td>
        </thead>
        <c:forEach items="${userList}" var="user" varStatus="row">
            <tr>
                <td>${row.index}</td>
                <td>${user.id}</td>
                <td>${user.userName}</td>
                <td>${user.password}</td>
                <td>${user.state}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
