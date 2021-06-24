<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>New Dojo</h1>
	<form:form action="/dojo/new" method="post" modelAttribute="dojo">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<input type="submit" value="Submit"/>
	</form:form>
	<a href="/alldojos">All Dojos</a>
</body>
</html>