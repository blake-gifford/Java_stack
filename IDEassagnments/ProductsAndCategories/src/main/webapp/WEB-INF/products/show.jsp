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
<%--  	<h1><c:out value="${product.name}" /></h1> --%>
  	<ul>
		<c:forEach items="${category}" var="c">
			<li><c:out value="${c.name}" /></li>
		</c:forEach>
	</ul>
	<form action="/products/${category.id}/edit" method="post">
		<select name="category">
			<option selected disabled >Select a category</option>
				<c:forEach items="${category}" var="c">
					<option value="${c.id}">
						<c:out value="${c.name}"></c:out>
					</option>
				</c:forEach>
		</select>
		<input type="submit" value="Add a category to this product"/>
	</form>
	<a href="/category/new">Create Category</a>
</body> 
</html>