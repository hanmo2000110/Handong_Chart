<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.mycom.test1.BoardDAO, com.mycom.test1.BoardVO"%>
<%
	String sid = request.getParameter("id");
	if (sid != ""){  
		int id = Integer.parseInt(sid);
		BoardVO u = new BoardVO();
		u.setId(id);
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.deleteBoard(id);
	}
	response.sendRedirect("posts.jsp");
%>