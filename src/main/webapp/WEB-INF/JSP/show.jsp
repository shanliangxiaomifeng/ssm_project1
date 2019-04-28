<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xiaomifeng
  Date: 2019/4/28
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${studentList}" var="student" varStatus="vs">
    <tr>

    <td>
    <s:property value="#vs.index+1"/>
    </td>
    <td align = "center">${student.sid}</td>
    <td align = "center">${student.sname}</td>
    <td align = "center">${student.classes.cid}</td>
    <td align = "center">${student.sex}</td>
    <td align = "center">${student.birthplace}</td>
    </tr>
</c:forEach>
</body>
</html>
