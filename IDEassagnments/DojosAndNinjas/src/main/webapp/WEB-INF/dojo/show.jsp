<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1><c:out value="${dojo.name} Location Ninjas" /></h1>
	<a href="/ninja/new">Create Ninja!</a>
		<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			 <c:forEach items="${ninjas}" var="n">
				<tr>
					<td><c:out value="${n.firstName}"/></td>
					<td><c:out value="${n.lastName}"/></td>
					<td><c:out value="${n.age}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>