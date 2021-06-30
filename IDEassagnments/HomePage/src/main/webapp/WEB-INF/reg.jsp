<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
</head>
<body>
    <h1 style="texta">Welcome, Create your account name here!</h1>
    
    
    
    <form method="post" action="/registration">
        <p>
            <label >Name:</label>
            <input type="text" name="name"/>
        </p>
        <input type="submit" value="Register!"/>
    </form>
    <form action="/new/shortcut">
    	<input type="submit" value="GCreate New Shortcut" />
	</form>
</body>
</html>