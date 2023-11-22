<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>NAME</th>
        <th>FAMILY</th>
        <th>AGE</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}">
    <tr>
        <td>${user.firstname}</td>
        <td>${user.surname}</td>
        <td>${user.age}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
