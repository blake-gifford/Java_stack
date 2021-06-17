<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world!</h1>
	<form action="/home" method="POST">
		<label>Your Name: <input type="text" name="name"></label>
		<label>Location: <select name="location" id="location">
			<option value="san jose">San Jose</option>
			<option value="burbank">Burbank</option>
			</select>
		</label>
		<label>Favorite Language: <select name="lang" id="lang">
			<option value="java">Java</option>
			<option value="js">JS</option>
			<option value="python">Python</option>
			</select>
		</label>
		<label>Description: <input type="text" name="description"></label>
		<button>Submit</button>
	</form>
</body>
</html>