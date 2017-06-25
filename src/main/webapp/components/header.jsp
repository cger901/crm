<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>
	欢迎回来，
	<c:choose>
		<c:when test="${user!=null}">${user.employeeName}<br />${user.department}&nbsp;${user.title}</c:when>
		<c:otherwise>请<a href="login.jsp">登录</a></c:otherwise>
	</c:choose>
</h2>