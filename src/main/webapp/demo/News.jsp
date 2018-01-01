<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>NewList</title>
</head>
<body>
<div >
		<form action="${pageContext.request.contextPath}/NewsController" method="get">
		
			<input type="text" name="newsContent" title="请输入新闻关键字">
			<input type="submit" value="搜索">
		</form>
	</div>
	 <table  align="center" cellspacing="0" cellpadding="0">
        <!-- 表头-->
        <thead>
            <tr align="center" valign="middle" id="TableTitle">
				<td>新闻id</td>
				<td>新闻标题</td>
				<td>新闻 内容</td>
			</tr>
		</thead>	
	<c:forEach var="temp" items="${requestScope.news}" >
			<tr>
				
				<td>${pageScope.temp.newid}</td>
				<td>${pageScope.temp.title}</td>
				<td>${pageScope.temp.content}</td>
				
			</tr>	
        </c:forEach>
       <div><a href="${pageContext.request.contextPath}/demo/addNews.jsp">添加</a></div>
        <tbody >
</body>
</html>