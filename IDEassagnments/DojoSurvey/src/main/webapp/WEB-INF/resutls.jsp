<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
	<h1>Submitted Info</h1>
	<h3>Name: <c:out value="${name}"></c:out></h3>
	<h3>Dojo Location: <c:out value="${location}"></c:out></h3>
	<h3>Favorite Language: <c:out value="${lang}"></c:out></h3>
	<h3>Description: <c:out value="${description}"></c:out></h3>
	<button action="/">Go back</button>
</body>
</html>