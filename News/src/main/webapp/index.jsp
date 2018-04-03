<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="index" method="get">
			新闻分类 <select name="categoryid">
				<option value="0">全部</option>
				<c:forEach var="c" items="${category}">
					<option value="${c.id}">${c.name}</option>
				</c:forEach>
			</select>
			新闻标题：&nbsp;<input type="text" name="title" />&nbsp;
			<button type="submit">查询</button>

		<table border="1">
			<tr>
				<td>新闻编号</td>
				<td>新闻标题</td>
				<td>新闻摘要</td>
				<td>作者</td>
				<td>创建时间</td>
				<td>操作</td>
			</tr>
			<c:forEach var="c" items="${dateil}">
				<tr>
					<td>${c.id}</td>
					<td>${c.title}</td>
					<td>${c.sumary}</td>
					<td>${c.author}</td>
					<td>${c.createdate}</td>
					<td><a href="update?id=${c.id}">修改</a>&nbsp;</td>
				</tr>
			</c:forEach>
		</table>

	</form>

</body>
</html>