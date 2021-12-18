<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<form action="addOk" method="post">
<table>
<tr><td>Title:</td><td><input type="text" name="title"/></td></tr>
<tr><td>Creator:</td><td><input type="text" name="creator"/></td></tr>
<tr><td>YLink:</td><td><input type="text" name="YLink"/></td></tr>
<tr><td>Category:</td><td><input type="text" name="category"/></td></tr>
<tr><td>Description:</td><td><textarea cols="50" rows="5" name="description"></textarea></td></tr>
<tr><td><a href="list">View All Records</a></td><td align="right"><input type="submit" value="Add Post"/></td></tr>
</table>
</form>

</body>
</html> 
