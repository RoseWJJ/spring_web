<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/AddNews" method="post">
	标题：<input type="text" name="title"/><br/>
	内容：<textarea cols="20" rows="20" name="content"></textarea><br/>
        <input type="submit" value="Submit" />
	</form>

	
</form>
</body>
</html>