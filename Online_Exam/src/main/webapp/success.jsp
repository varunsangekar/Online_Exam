<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
<h1 align="center">Welcome to Result</h1>
<table border="1" align="center">
<tr>
<th>sid</th>
<th>Name</th>
<th>Email</th>
<th>Branch</th>
<th>College</th>
<th>Pass Out Year</th>
<th>Mobile No</th>
</tr>
<c:forEach items="${data}" var="stud">
<tr>
    <td>${stud.sid}</td>
    <td>${stud.sname}</td>
    <td>${stud.email}</td>
    <td>${stud.branch}</td>
    <td>${stud.college}</td>
    <td>${stud.poy}</td>
    <td>${stud.mobile}</td>
</tr>
</c:forEach>
</table>
<div align="center">
    <button><a href="viewResult?sid=${data[0].sid}">View Result</a></button> <!-- Assuming data[0] is the first student -->
</div>
<h1 align="center"><a href="back">Logout</a></h1>
</body>
</html>
