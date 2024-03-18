<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <h1 align="center">Welcome to Result</h1>
    <table border="1" align="center">
        <tr>
        <th>Mark Id</th>
            <th>IT Mark</th>
            <th>CS Mark</th>
        </tr>
        <c:if test="${not empty Data}">
            <c:forEach items="${Data}" var="stud">
                <tr>
                <td>${stud.id}</td>
                    <td>${stud.itMark}</td>
                    <td>${stud.csMark}</td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${empty Data}">
            <tr>
                <td colspan="2" align="center">No data available</td>
            </tr>
        </c:if>
    </table>
    <h1 align="center"><a href="back">Logout</a></h1>
</body>
</html>
