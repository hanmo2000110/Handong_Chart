<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.mycom.test1.BoardDAO, com.mycom.test1.BoardVO"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>

<h1>Edit Form</h1>
<% 
	
%>

<form action="../editok" method="post">
<input type="hidden" name="id" value="${song.id}"/>
<table>
<tr><td>Title:</td><td><input type="text" name='title' value='${song.title}'/></td></tr>
<tr><td>Creator:</td><td><input type="text" name="creator" value='${song.title}'/></td></tr>
<tr><td>YLink:</td><td><input type="text" name="YLink" value='${song.title}'/></td></tr>
<tr><td>Category:</td><td><input type="text" name="category" value='${song.title}'/></td></tr>
<tr><td>Description:</td><td><textarea cols="50" rows="5" name="description"> ${song.title}</textarea></td></tr>
<tr><td colspan="2"><input type="submit" value="Edit Post"/>
<input type="button" value="Cancel" onclick="history.back()"/></td></tr>
</table>
</form>

</body>
</html> 
