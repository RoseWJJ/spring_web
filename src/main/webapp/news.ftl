<form action="NewsController" method="get">
	内容:<input type='text' name="myContent" value="${myContent}">
		<input type='submit' value='查询'/>
</form>
<table border=1>
<tr><th style='width:10%'>新闻编号</th><th style='width:30%'>新闻标题</th><th>新闻内容</th></tr>
<#list newsList as tmp>
	<tr><td>${tmp.newid}</td><td>${tmp.title}</td><td>${tmp.content}</td></tr>
</#list>
</table>