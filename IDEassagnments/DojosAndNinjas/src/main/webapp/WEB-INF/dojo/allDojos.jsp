<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Dojos</title>
</head>
<body>
	<h1>All Dojos</h1>
	<h2><a href="/dojo">Add new Dojo!</a></h2>
	
		<c:forEach items="${dojo}" var="d">
			<p><a href="/dojo/{id}"><c:out value="${d.name }"></c:out></a></p>
		</c:forEach>
	
</body>
</html>