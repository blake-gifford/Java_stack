<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/ninja" method="post" modelAttribute="ninja">
		<p>
			<form:label path="dojo"></form:label>
			<form:errors path="dojo" />
			<form:select path="dojo">
				<option value="" disabled selected>Please Select a Dojo</option>
					<c:forEach items="${dojo}" var="d">
						<form:option value="d">
							<c:out value="${d.name}"></c:out>
						</form:option>
					</c:forEach>
			</form:select>
		</p>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>